/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gen.shopify.webhook.exception;

/**
 *
 * @author jmendieta
 */
public class DomainVerificationException extends Exception {

    public DomainVerificationException() {
        super("You shall not pass..");
    }

    public DomainVerificationException(String message) {
        super(message);
    }

}
