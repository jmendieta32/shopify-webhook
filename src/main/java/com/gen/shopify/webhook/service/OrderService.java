/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.service;

import com.gen.shopify.webhook.vo.OrderModel;

/**
 *
 * @author jmendieta
 */
public interface OrderService {
    
    OrderModel saveUser(OrderModel user);

    OrderModel findByWebhook(String webhook);
}
