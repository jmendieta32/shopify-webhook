/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.repository;

import com.gen.shopify.webhook.vo.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderModel, Long>{
    
    OrderModel findByWebhook(String webhook);
}