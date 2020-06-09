package com.gen.shopify.webhook.vo;


import java.util.List;

public class LineItem {

    private String id;
    private String variant_id;
    private String title;
    private Integer quantity;
    private String sku;
    private String variant_title;
    private String vendor;
    private String fulfillment_service;
    private String product_id;
    private Boolean requires_shipping;
    private Boolean taxable;
    private Boolean gift_card;
    private String name;
    private String variant_inventory_management;
    private List<Object> properties = null;
    private Boolean product_exists;
    private Integer fulfillable_quantity;
    private Integer grams;
    private String price;
    private String total_discount;
    private Object fulfillment_status;
    private PriceSet price_set;
    private TotalDiscountSet total_discount_set;
    private List<Object> discount_allocations = null;
    private List<Object> duties = null;
    private String admin_graphql_api_id;
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
     * @return the variant_id
     */
    public String getVariant_id() {
        return variant_id;
    }

    /**
     * @param variant_id the variant_id to set
     */
    public void setVariant_id(String variant_id) {
        this.variant_id = variant_id;
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
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the variant_title
     */
    public String getVariant_title() {
        return variant_title;
    }

    /**
     * @param variant_title the variant_title to set
     */
    public void setVariant_title(String variant_title) {
        this.variant_title = variant_title;
    }

    /**
     * @return the vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @param vendor the vendor to set
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * @return the fulfillment_service
     */
    public String getFulfillment_service() {
        return fulfillment_service;
    }

    /**
     * @param fulfillment_service the fulfillment_service to set
     */
    public void setFulfillment_service(String fulfillment_service) {
        this.fulfillment_service = fulfillment_service;
    }

    /**
     * @return the product_id
     */
    public String getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the requires_shipping
     */
    public Boolean getRequires_shipping() {
        return requires_shipping;
    }

    /**
     * @param requires_shipping the requires_shipping to set
     */
    public void setRequires_shipping(Boolean requires_shipping) {
        this.requires_shipping = requires_shipping;
    }

    /**
     * @return the taxable
     */
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * @param taxable the taxable to set
     */
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * @return the gift_card
     */
    public Boolean getGift_card() {
        return gift_card;
    }

    /**
     * @param gift_card the gift_card to set
     */
    public void setGift_card(Boolean gift_card) {
        this.gift_card = gift_card;
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
     * @return the variant_inventory_management
     */
    public String getVariant_inventory_management() {
        return variant_inventory_management;
    }

    /**
     * @param variant_inventory_management the variant_inventory_management to set
     */
    public void setVariant_inventory_management(String variant_inventory_management) {
        this.variant_inventory_management = variant_inventory_management;
    }

    /**
     * @return the properties
     */
    public List<Object> getProperties() {
        return properties;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    /**
     * @return the product_exists
     */
    public Boolean getProduct_exists() {
        return product_exists;
    }

    /**
     * @param product_exists the product_exists to set
     */
    public void setProduct_exists(Boolean product_exists) {
        this.product_exists = product_exists;
    }

    /**
     * @return the fulfillable_quantity
     */
    public Integer getFulfillable_quantity() {
        return fulfillable_quantity;
    }

    /**
     * @param fulfillable_quantity the fulfillable_quantity to set
     */
    public void setFulfillable_quantity(Integer fulfillable_quantity) {
        this.fulfillable_quantity = fulfillable_quantity;
    }

    /**
     * @return the grams
     */
    public Integer getGrams() {
        return grams;
    }

    /**
     * @param grams the grams to set
     */
    public void setGrams(Integer grams) {
        this.grams = grams;
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
     * @return the total_discount
     */
    public String getTotal_discount() {
        return total_discount;
    }

    /**
     * @param total_discount the total_discount to set
     */
    public void setTotal_discount(String total_discount) {
        this.total_discount = total_discount;
    }

    /**
     * @return the fulfillment_status
     */
    public Object getFulfillment_status() {
        return fulfillment_status;
    }

    /**
     * @param fulfillment_status the fulfillment_status to set
     */
    public void setFulfillment_status(Object fulfillment_status) {
        this.fulfillment_status = fulfillment_status;
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
     * @return the total_discount_set
     */
    public TotalDiscountSet getTotal_discount_set() {
        return total_discount_set;
    }

    /**
     * @param total_discount_set the total_discount_set to set
     */
    public void setTotal_discount_set(TotalDiscountSet total_discount_set) {
        this.total_discount_set = total_discount_set;
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
     * @return the duties
     */
    public List<Object> getDuties() {
        return duties;
    }

    /**
     * @param duties the duties to set
     */
    public void setDuties(List<Object> duties) {
        this.duties = duties;
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
