/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.service;

import com.gen.shopify.webhook.vo.OrderModel;
import com.gen.shopify.webhook.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmendieta
 */

@Service
public class OrderServiceImpl implements OrderService{

    
    @Autowired
    private OrderRepository orderRepository;
    
    
    
    @Override
    public OrderModel saveUser(OrderModel order) {
        return orderRepository.save(order);
    }

    @Override
    public OrderModel findByWebhook(String webhook) {
        return orderRepository.findByWebhook(webhook);
    }

    
    
    
}
