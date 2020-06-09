package com.gen.shopify.webhook.vo;

import java.util.List;

public class Order {

    private Long id;
    private String email;
    private Object closed_at;
    private String created_at;
    private String updated_at;
    private String number;
    private Object note;
    private String token;
    private Object gateway;
    private Boolean test;
    private String total_price;
    private String subtotal_price;
    private Integer total_weight;
    private String total_tax;
    private Boolean taxes_included;
    private String currency;
    private String financial_status;
    private Boolean confirmed;
    private String total_discounts;
    private String total_line_items_price;
    private Object cart_token;
    private Boolean buyer_accepts_marketing;
    private String name;
    private Object referring_site;
    private Object landing_site;
    private String cancelled_at;
    private String cancel_reason;
    private Object total_price_usd;
    private Object checkout_token;
    private Object reference;
    private Object user_id;
    private Object location_id;
    private Object source_identifier;
    private Object source_url;
    private Object processed_at;
    private Object device_id;
    private Object phone;
    private String customer_locale;
    private Object app_id;
    private Object browser_ip;
    private Object landing_site_ref;
    private Integer order_number;
    private List<DiscountApplication> discount_applications = null;
    private List<Object> discount_codes = null;
    private List<Object> note_attributes = null;
    private List<String> payment_gateway_names = null;
    private String processing_method;
    private Object checkout_id;
    private String source_name;
    private String fulfillment_status;
    private List<Object> tax_lines = null;
    private String tags;
    private String contact_email;
    private String order_status_url;
    private String presentment_currency;
    private TotalLineItemsPriceSet total_line_items_price_set;
    private TotalDiscountsSet total_discounts_set;
    private TotalShippingPriceSet total_shipping_price_set;
    private SubtotalPriceSet subtotal_price_set;
    private TotalPriceSet total_price_set;
    private TotalTaxSet total_tax_set;
    private List<LineItem> line_items = null;
    private List<Object> fulfillments = null;
    private List<Object> refunds = null;
    private String total_tip_received;
    private Object original_total_duties_set;
    private Object current_total_duties_set;
    private String admin_graphql_api_id;
    private List<ShippingLine> shipping_lines = null;
    private BillingAddress billing_address;
    private ShippingAddress shipping_address;
    /**/
    private Customer customer;
    /**/

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
     * @return the closed_at
     */
    public Object getClosed_at() {
        return closed_at;
    }

    /**
     * @param closed_at the closed_at to set
     */
    public void setClosed_at(Object closed_at) {
        this.closed_at = closed_at;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the note
     */
    public Object getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(Object note) {
        this.note = note;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the gateway
     */
    public Object getGateway() {
        return gateway;
    }

    /**
     * @param gateway the gateway to set
     */
    public void setGateway(Object gateway) {
        this.gateway = gateway;
    }

    /**
     * @return the test
     */
    public Boolean getTest() {
        return test;
    }

    /**
     * @param test the test to set
     */
    public void setTest(Boolean test) {
        this.test = test;
    }

    /**
     * @return the total_price
     */
    public String getTotal_price() {
        return total_price;
    }

    /**
     * @param total_price the total_price to set
     */
    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    /**
     * @return the subtotal_price
     */
    public String getSubtotal_price() {
        return subtotal_price;
    }

    /**
     * @param subtotal_price the subtotal_price to set
     */
    public void setSubtotal_price(String subtotal_price) {
        this.subtotal_price = subtotal_price;
    }

    /**
     * @return the total_weight
     */
    public Integer getTotal_weight() {
        return total_weight;
    }

    /**
     * @param total_weight the total_weight to set
     */
    public void setTotal_weight(Integer total_weight) {
        this.total_weight = total_weight;
    }

    /**
     * @return the total_tax
     */
    public String getTotal_tax() {
        return total_tax;
    }

    /**
     * @param total_tax the total_tax to set
     */
    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    /**
     * @return the taxes_included
     */
    public Boolean getTaxes_included() {
        return taxes_included;
    }

    /**
     * @param taxes_included the taxes_included to set
     */
    public void setTaxes_included(Boolean taxes_included) {
        this.taxes_included = taxes_included;
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
     * @return the financial_status
     */
    public String getFinancial_status() {
        return financial_status;
    }

    /**
     * @param financial_status the financial_status to set
     */
    public void setFinancial_status(String financial_status) {
        this.financial_status = financial_status;
    }

    /**
     * @return the confirmed
     */
    public Boolean getConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed the confirmed to set
     */
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * @return the total_discounts
     */
    public String getTotal_discounts() {
        return total_discounts;
    }

    /**
     * @param total_discounts the total_discounts to set
     */
    public void setTotal_discounts(String total_discounts) {
        this.total_discounts = total_discounts;
    }

    /**
     * @return the total_line_items_price
     */
    public String getTotal_line_items_price() {
        return total_line_items_price;
    }

    /**
     * @param total_line_items_price the total_line_items_price to set
     */
    public void setTotal_line_items_price(String total_line_items_price) {
        this.total_line_items_price = total_line_items_price;
    }

    /**
     * @return the cart_token
     */
    public Object getCart_token() {
        return cart_token;
    }

    /**
     * @param cart_token the cart_token to set
     */
    public void setCart_token(Object cart_token) {
        this.cart_token = cart_token;
    }

    /**
     * @return the buyer_accepts_marketing
     */
    public Boolean getBuyer_accepts_marketing() {
        return buyer_accepts_marketing;
    }

    /**
     * @param buyer_accepts_marketing the buyer_accepts_marketing to set
     */
    public void setBuyer_accepts_marketing(Boolean buyer_accepts_marketing) {
        this.buyer_accepts_marketing = buyer_accepts_marketing;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the referring_site
     */
    public Object getReferring_site() {
        return referring_site;
    }

    /**
     * @param referring_site the referring_site to set
     */
    public void setReferring_site(Object referring_site) {
        this.referring_site = referring_site;
    }

    /**
     * @return the landing_site
     */
    public Object getLanding_site() {
        return landing_site;
    }

    /**
     * @param landing_site the landing_site to set
     */
    public void setLanding_site(Object landing_site) {
        this.landing_site = landing_site;
    }

    /**
     * @return the cancelled_at
     */
    public String getCancelled_at() {
        return cancelled_at;
    }

    /**
     * @param cancelled_at the cancelled_at to set
     */
    public void setCancelled_at(String cancelled_at) {
        this.cancelled_at = cancelled_at;
    }

    /**
     * @return the cancel_reason
     */
    public String getCancel_reason() {
        return cancel_reason;
    }

    /**
     * @param cancel_reason the cancel_reason to set
     */
    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    /**
     * @return the total_price_usd
     */
    public Object getTotal_price_usd() {
        return total_price_usd;
    }

    /**
     * @param total_price_usd the total_price_usd to set
     */
    public void setTotal_price_usd(Object total_price_usd) {
        this.total_price_usd = total_price_usd;
    }

    /**
     * @return the checkout_token
     */
    public Object getCheckout_token() {
        return checkout_token;
    }

    /**
     * @param checkout_token the checkout_token to set
     */
    public void setCheckout_token(Object checkout_token) {
        this.checkout_token = checkout_token;
    }

    /**
     * @return the reference
     */
    public Object getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(Object reference) {
        this.reference = reference;
    }

    /**
     * @return the user_id
     */
    public Object getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(Object user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the location_id
     */
    public Object getLocation_id() {
        return location_id;
    }

    /**
     * @param location_id the location_id to set
     */
    public void setLocation_id(Object location_id) {
        this.location_id = location_id;
    }

    /**
     * @return the source_identifier
     */
    public Object getSource_identifier() {
        return source_identifier;
    }

    /**
     * @param source_identifier the source_identifier to set
     */
    public void setSource_identifier(Object source_identifier) {
        this.source_identifier = source_identifier;
    }

    /**
     * @return the source_url
     */
    public Object getSource_url() {
        return source_url;
    }

    /**
     * @param source_url the source_url to set
     */
    public void setSource_url(Object source_url) {
        this.source_url = source_url;
    }

    /**
     * @return the processed_at
     */
    public Object getProcessed_at() {
        return processed_at;
    }

    /**
     * @param processed_at the processed_at to set
     */
    public void setProcessed_at(Object processed_at) {
        this.processed_at = processed_at;
    }

    /**
     * @return the device_id
     */
    public Object getDevice_id() {
        return device_id;
    }

    /**
     * @param device_id the device_id to set
     */
    public void setDevice_id(Object device_id) {
        this.device_id = device_id;
    }

    /**
     * @return the phone
     */
    public Object getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    /**
     * @return the customer_locale
     */
    public String getCustomer_locale() {
        return customer_locale;
    }

    /**
     * @param customer_locale the customer_locale to set
     */
    public void setCustomer_locale(String customer_locale) {
        this.customer_locale = customer_locale;
    }

    /**
     * @return the app_id
     */
    public Object getApp_id() {
        return app_id;
    }

    /**
     * @param app_id the app_id to set
     */
    public void setApp_id(Object app_id) {
        this.app_id = app_id;
    }

    /**
     * @return the browser_ip
     */
    public Object getBrowser_ip() {
        return browser_ip;
    }

    /**
     * @param browser_ip the browser_ip to set
     */
    public void setBrowser_ip(Object browser_ip) {
        this.browser_ip = browser_ip;
    }

    /**
     * @return the landing_site_ref
     */
    public Object getLanding_site_ref() {
        return landing_site_ref;
    }

    /**
     * @param landing_site_ref the landing_site_ref to set
     */
    public void setLanding_site_ref(Object landing_site_ref) {
        this.landing_site_ref = landing_site_ref;
    }

    /**
     * @return the order_number
     */
    public Integer getOrder_number() {
        return order_number;
    }

    /**
     * @param order_number the order_number to set
     */
    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    /**
     * @return the discount_applications
     */
    public List<DiscountApplication> getDiscount_applications() {
        return discount_applications;
    }

    /**
     * @param discount_applications the discount_applications to set
     */
    public void setDiscount_applications(List<DiscountApplication> discount_applications) {
        this.discount_applications = discount_applications;
    }

    /**
     * @return the discount_codes
     */
    public List<Object> getDiscount_codes() {
        return discount_codes;
    }

    /**
     * @param discount_codes the discount_codes to set
     */
    public void setDiscount_codes(List<Object> discount_codes) {
        this.discount_codes = discount_codes;
    }

    /**
     * @return the note_attributes
     */
    public List<Object> getNote_attributes() {
        return note_attributes;
    }

    /**
     * @param note_attributes the note_attributes to set
     */
    public void setNote_attributes(List<Object> note_attributes) {
        this.note_attributes = note_attributes;
    }

    /**
     * @return the payment_gateway_names
     */
    public List<String> getPayment_gateway_names() {
        return payment_gateway_names;
    }

    /**
     * @param payment_gateway_names the payment_gateway_names to set
     */
    public void setPayment_gateway_names(List<String> payment_gateway_names) {
        this.payment_gateway_names = payment_gateway_names;
    }

    /**
     * @return the processing_method
     */
    public String getProcessing_method() {
        return processing_method;
    }

    /**
     * @param processing_method the processing_method to set
     */
    public void setProcessing_method(String processing_method) {
        this.processing_method = processing_method;
    }

    /**
     * @return the checkout_id
     */
    public Object getCheckout_id() {
        return checkout_id;
    }

    /**
     * @param checkout_id the checkout_id to set
     */
    public void setCheckout_id(Object checkout_id) {
        this.checkout_id = checkout_id;
    }

    /**
     * @return the source_name
     */
    public String getSource_name() {
        return source_name;
    }

    /**
     * @param source_name the source_name to set
     */
    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    /**
     * @return the fulfillment_status
     */
    public String getFulfillment_status() {
        return fulfillment_status;
    }

    /**
     * @param fulfillment_status the fulfillment_status to set
     */
    public void setFulfillment_status(String fulfillment_status) {
        this.fulfillment_status = fulfillment_status;
    }

    /**
     * @return the tax_lines
     */
    public List<Object> getTax_lines() {
        return tax_lines;
    }

    /**
     * @param tax_lines the tax_lines to set
     */
    public void setTax_lines(List<Object> tax_lines) {
        this.tax_lines = tax_lines;
    }

    /**
     * @return the tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return the contact_email
     */
    public String getContact_email() {
        return contact_email;
    }

    /**
     * @param contact_email the contact_email to set
     */
    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    /**
     * @return the order_status_url
     */
    public String getOrder_status_url() {
        return order_status_url;
    }

    /**
     * @param order_status_url the order_status_url to set
     */
    public void setOrder_status_url(String order_status_url) {
        this.order_status_url = order_status_url;
    }

    /**
     * @return the presentment_currency
     */
    public String getPresentment_currency() {
        return presentment_currency;
    }

    /**
     * @param presentment_currency the presentment_currency to set
     */
    public void setPresentment_currency(String presentment_currency) {
        this.presentment_currency = presentment_currency;
    }

    /**
     * @return the total_line_items_price_set
     */
    public TotalLineItemsPriceSet getTotal_line_items_price_set() {
        return total_line_items_price_set;
    }

    /**
     * @param total_line_items_price_set the total_line_items_price_set to set
     */
    public void setTotal_line_items_price_set(TotalLineItemsPriceSet total_line_items_price_set) {
        this.total_line_items_price_set = total_line_items_price_set;
    }

    /**
     * @return the total_discounts_set
     */
    public TotalDiscountsSet getTotal_discounts_set() {
        return total_discounts_set;
    }

    /**
     * @param total_discounts_set the total_discounts_set to set
     */
    public void setTotal_discounts_set(TotalDiscountsSet total_discounts_set) {
        this.total_discounts_set = total_discounts_set;
    }

    /**
     * @return the total_shipping_price_set
     */
    public TotalShippingPriceSet getTotal_shipping_price_set() {
        return total_shipping_price_set;
    }

    /**
     * @param total_shipping_price_set the total_shipping_price_set to set
     */
    public void setTotal_shipping_price_set(TotalShippingPriceSet total_shipping_price_set) {
        this.total_shipping_price_set = total_shipping_price_set;
    }

    /**
     * @return the subtotal_price_set
     */
    public SubtotalPriceSet getSubtotal_price_set() {
        return subtotal_price_set;
    }

    /**
     * @param subtotal_price_set the subtotal_price_set to set
     */
    public void setSubtotal_price_set(SubtotalPriceSet subtotal_price_set) {
        this.subtotal_price_set = subtotal_price_set;
    }

    /**
     * @return the total_price_set
     */
    public TotalPriceSet getTotal_price_set() {
        return total_price_set;
    }

    /**
     * @param total_price_set the total_price_set to set
     */
    public void setTotal_price_set(TotalPriceSet total_price_set) {
        this.total_price_set = total_price_set;
    }

    /**
     * @return the total_tax_set
     */
    public TotalTaxSet getTotal_tax_set() {
        return total_tax_set;
    }

    /**
     * @param total_tax_set the total_tax_set to set
     */
    public void setTotal_tax_set(TotalTaxSet total_tax_set) {
        this.total_tax_set = total_tax_set;
    }

    /**
     * @return the line_items
     */
    public List<LineItem> getLine_items() {
        return line_items;
    }

    /**
     * @param line_items the line_items to set
     */
    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    /**
     * @return the fulfillments
     */
    public List<Object> getFulfillments() {
        return fulfillments;
    }

    /**
     * @param fulfillments the fulfillments to set
     */
    public void setFulfillments(List<Object> fulfillments) {
        this.fulfillments = fulfillments;
    }

    /**
     * @return the refunds
     */
    public List<Object> getRefunds() {
        return refunds;
    }

    /**
     * @param refunds the refunds to set
     */
    public void setRefunds(List<Object> refunds) {
        this.refunds = refunds;
    }

    /**
     * @return the total_tip_received
     */
    public String getTotal_tip_received() {
        return total_tip_received;
    }

    /**
     * @param total_tip_received the total_tip_received to set
     */
    public void setTotal_tip_received(String total_tip_received) {
        this.total_tip_received = total_tip_received;
    }

    /**
     * @return the original_total_duties_set
     */
    public Object getOriginal_total_duties_set() {
        return original_total_duties_set;
    }

    /**
     * @param original_total_duties_set the original_total_duties_set to set
     */
    public void setOriginal_total_duties_set(Object original_total_duties_set) {
        this.original_total_duties_set = original_total_duties_set;
    }

    /**
     * @return the current_total_duties_set
     */
    public Object getCurrent_total_duties_set() {
        return current_total_duties_set;
    }

    /**
     * @param current_total_duties_set the current_total_duties_set to set
     */
    public void setCurrent_total_duties_set(Object current_total_duties_set) {
        this.current_total_duties_set = current_total_duties_set;
    }

    /**
     * @return the admin_graphql_api_id
     */
    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    /**
     * @param admin_graphql_api_id the admin_graphql_api_id to set
     */
    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    /**
     * @return the shipping_lines
     */
    public List<ShippingLine> getShipping_lines() {
        return shipping_lines;
    }

    /**
     * @param shipping_lines the shipping_lines to set
     */
    public void setShipping_lines(List<ShippingLine> shipping_lines) {
        this.shipping_lines = shipping_lines;
    }

    /**
     * @return the billing_address
     */
    public BillingAddress getBilling_address() {
        return billing_address;
    }

    /**
     * @param billing_address the billing_address to set
     */
    public void setBilling_address(BillingAddress billing_address) {
        this.billing_address = billing_address;
    }

    /**
     * @return the shipping_address
     */
    public ShippingAddress getShipping_address() {
        return shipping_address;
    }

    /**
     * @param shipping_address the shipping_address to set
     */
    public void setShipping_address(ShippingAddress shipping_address) {
        this.shipping_address = shipping_address;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    
    
}
