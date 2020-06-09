
package com.gen.shopify.webhook.vo;


import java.util.List;

public class ShippingLine {

    private String id;
    private String title;
    private String price;
    private Object code;
    private String source;
    private Object phone;
    private Object requested_fulfillment_service_id;
    private Object delivery_category;
    private Object carrier_identifier;
    private String discounted_price;
    private PriceSet price_set;
    private DiscountedPriceSet discounted_price_set;
    private List<Object> discount_allocations = null;
    private List<Object> tax_lines = null;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public Object getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Object code) {
        this.code = code;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
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
     * @return the requested_fulfillment_service_id
     */
    public Object getRequested_fulfillment_service_id() {
        return requested_fulfillment_service_id;
    }

    /**
     * @param requested_fulfillment_service_id the requested_fulfillment_service_id to set
     */
    public void setRequested_fulfillment_service_id(Object requested_fulfillment_service_id) {
        this.requested_fulfillment_service_id = requested_fulfillment_service_id;
    }

    /**
     * @return the delivery_category
     */
    public Object getDelivery_category() {
        return delivery_category;
    }

    /**
     * @param delivery_category the delivery_category to set
     */
    public void setDelivery_category(Object delivery_category) {
        this.delivery_category = delivery_category;
    }

    /**
     * @return the carrier_identifier
     */
    public Object getCarrier_identifier() {
        return carrier_identifier;
    }

    /**
     * @param carrier_identifier the carrier_identifier to set
     */
    public void setCarrier_identifier(Object carrier_identifier) {
        this.carrier_identifier = carrier_identifier;
    }

    /**
     * @return the discounted_price
     */
    public String getDiscounted_price() {
        return discounted_price;
    }

    /**
     * @param discounted_price the discounted_price to set
     */
    public void setDiscounted_price(String discounted_price) {
        this.discounted_price = discounted_price;
    }

    /**
     * @return the price_set
     */
    public PriceSet getPrice_set() {
        return price_set;
    }

    /**
     * @param price_set the price_set to set
     */
    public void setPrice_set(PriceSet price_set) {
        this.price_set = price_set;
    }

    /**
     * @return the discounted_price_Set
     */
    public DiscountedPriceSet getDiscounted_price_set() {
        return discounted_price_set;
    }

    /**
     * @param discounted_price_Set the discounted_price_Set to set
     */
    public void setDiscounted_price_set(DiscountedPriceSet discounted_price_Set) {
        this.discounted_price_set = discounted_price_Set;
    }

    /**
     * @return the discount_allocations
     */
    public List<Object> getDiscount_allocations() {
        return discount_allocations;
    }

    /**
     * @param discount_allocations the discount_allocations to set
     */
    public void setDiscount_allocations(List<Object> discount_allocations) {
        this.discount_allocations = discount_allocations;
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

}
