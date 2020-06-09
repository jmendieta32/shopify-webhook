/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.vo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jmendieta
 */

@Entity
@Table(name = "orders_webhook")
public class OrderModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String webhook;
    private String email;
    private Date createdAt;
    private Date updated;
    private Double totalPrice;
    private Double subPrice;
    private Double totalDiscounts;
    private Double totalLineItems;    
    private String currency;
    private String customerLocale;
    private String orderNumber;
    private String lineItems;
    private String rawData;
    
    private int status;

    public OrderModel() {
    }


    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated the updated to set
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * @return the totalPrice
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return the subPrice
     */
    public Double getSubPrice() {
        return subPrice;
    }

    /**
     * @param subPrice the subPrice to set
     */
    public void setSubPrice(Double subPrice) {
        this.subPrice = subPrice;
    }

    /**
     * @return the totalDiscounts
     */
    public Double getTotalDiscounts() {
        return totalDiscounts;
    }

    /**
     * @param totalDiscounts the totalDiscounts to set
     */
    public void setTotalDiscounts(Double totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    /**
     * @return the totalLineItems
     */
    public Double getTotalLineItems() {
        return totalLineItems;
    }

    /**
     * @param totalLineItems the totalLineItems to set
     */
    public void setTotalLineItems(Double totalLineItems) {
        this.totalLineItems = totalLineItems;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the customerLocale
     */
    public String getCustomerLocale() {
        return customerLocale;
    }

    /**
     * @param customerLocale the customerLocale to set
     */
    public void setCustomerLocale(String customerLocale) {
        this.customerLocale = customerLocale;
    }

    /**
     * @return the orderNumber
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return the lineItems
     */
    public String getLineItems() {
        return lineItems;
    }

    /**
     * @param lineItems the lineItems to set
     */
    public void setLineItems(String lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * @return the rawData
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * @param rawData the rawData to set
     */
    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the webhook
     */
    public String getWebhook() {
        return webhook;
    }

    /**
     * @param webhook the webhook to set
     */
    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }


    
    
    
    
    
}
