/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.controller;

import com.google.gson.Gson;
import com.gen.shopify.webhook.exception.DomainVerificationException;
import com.gen.shopify.webhook.exception.FailVerificationException;
import com.gen.shopify.webhook.exception.TopicVerificationException;
import com.gen.shopify.webhook.vo.OrderModel;
import com.gen.shopify.webhook.service.OrderService;
import com.gen.shopify.webhook.vo.Order;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import javax.crypto.Mac;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class OrderController {

    static Log log = LogFactory.getLog(OrderController.class);

    @Autowired
    private OrderService orderService;

    private final String shopifyVerficatorHeader="x-shopify-hmac-sha256";

    @Value("${shopify.key}")
    private String shopifyKey;

    @PostMapping(value = "order/payment", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity postController(@RequestBody String body, @RequestHeader Map<String, String> headers) throws ParseException, FailVerificationException, DomainVerificationException, TopicVerificationException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {

        Date start = new Date();
        //Validate message 
        if (!validateMessage(shopifyKey, headers.get(shopifyVerficatorHeader.toLowerCase().trim()), body)) {
            throw new FailVerificationException();
        }

        Order order = new Gson().fromJson(body, Order.class);

        //creating new model
        OrderModel model = new OrderModel();

        try {
            //Setting values
            model.setWebhook(order.getId() + "");
            model.setEmail(order.getEmail());
            model.setCreatedAt(DateUtils.parseDate(order.getCreated_at(), new String[]{DateFormatUtils.ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT.getPattern()}));
            model.setUpdated(DateUtils.parseDate(order.getUpdated_at(), new String[]{DateFormatUtils.ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT.getPattern()}));
            model.setTotalPrice(Double.parseDouble(order.getTotal_price()));
            model.setTotalDiscounts(Double.parseDouble(order.getTotal_discounts()));
            model.setTotalLineItems(Double.parseDouble(order.getTotal_line_items_price()));
            model.setOrderNumber(order.getOrder_number().toString());
            model.setCurrency(order.getCurrency());
            model.setCustomerLocale(order.getCustomer_locale());
            model.setLineItems(new Gson().toJson(order.getLine_items()));
            model.setRawData(new Gson().toJson(order));

            model.setStatus(0);
        } catch (Exception e) {

            //Incase of error, all raw data will be saved
            model.setRawData(new Gson().toJson(order));
            model.setStatus(1);
            log.fatal("FATAL_ERROR: Parsing order json form shopify, please be careful with the OrderVo in code, cheack all attributes type.");
        } finally {

            //Saving into table
            orderService.saveUser(model);
        }

        Date end = new Date();
        //Response
        //Loggin for information pourposes
        log.info("Order " + model.getWebhook() + " has been processed in:"+(end.getTime()-start.getTime())+" millis");
        return ResponseEntity.ok(order);

    }

    private boolean validateMessage(String key, String hmacShopify, String body) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        boolean result = false;

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        sha256_HMAC.init(new javax.crypto.spec.SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256"));

        Base64 base64 = new Base64();
        String processed = new String(base64.encode(sha256_HMAC.doFinal(body.getBytes("UTF-8"))));

        if (hmacShopify.equals(processed)) {
            result = true;
        }

        return result;
    }

}
