
package com.gen.shopify.webhook.vo;



public class Customer {

    private String id;
    private String email;
    private Boolean accepts_marketing;
    private Object created_at;
    private Object updated_at;
    private String first_name;
    private String last_name;
    private Integer orders_count;
    private String state;
    private String total_spent;
    private Object last_order_id;
    private Object note;
    private Boolean verified_email;
    private Object multipass_identifier;
    private Boolean tax_exempt;
    private Object phone;
    private String tags;
    private Object last_order_name;
    private String currency;
    private Object accepts_marketing_updated_at;
    private Object marketing_opt_in_level;
    private String admin_graphql_api_id;
    private DefaultAddress default_address;

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
     * @return the accepts_marketing
     */
    public Boolean getAccepts_marketing() {
        return accepts_marketing;
    }

    /**
     * @param accepts_marketing the accepts_marketing to set
     */
    public void setAccepts_marketing(Boolean accepts_marketing) {
        this.accepts_marketing = accepts_marketing;
    }

    /**
     * @return the created_at
     */
    public Object getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Object created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the updated_at
     */
    public Object getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Object updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the orders_count
     */
    public Integer getOrders_count() {
        return orders_count;
    }

    /**
     * @param orders_count the orders_count to set
     */
    public void setOrders_count(Integer orders_count) {
        this.orders_count = orders_count;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the total_spent
     */
    public String getTotal_spent() {
        return total_spent;
    }

    /**
     * @param total_spent the total_spent to set
     */
    public void setTotal_spent(String total_spent) {
        this.total_spent = total_spent;
    }

    /**
     * @return the last_order_id
     */
    public Object getLast_order_id() {
        return last_order_id;
    }

    /**
     * @param last_order_id the last_order_id to set
     */
    public void setLast_order_id(Object last_order_id) {
        this.last_order_id = last_order_id;
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
     * @return the verified_email
     */
    public Boolean getVerified_email() {
        return verified_email;
    }

    /**
     * @param verified_email the verified_email to set
     */
    public void setVerified_email(Boolean verified_email) {
        this.verified_email = verified_email;
    }

    /**
     * @return the multipass_identifier
     */
    public Object getMultipass_identifier() {
        return multipass_identifier;
    }

    /**
     * @param multipass_identifier the multipass_identifier to set
     */
    public void setMultipass_identifier(Object multipass_identifier) {
        this.multipass_identifier = multipass_identifier;
    }

    /**
     * @return the tax_exempt
     */
    public Boolean getTax_exempt() {
        return tax_exempt;
    }

    /**
     * @param tax_exempt the tax_exempt to set
     */
    public void setTax_exempt(Boolean tax_exempt) {
        this.tax_exempt = tax_exempt;
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
     * @return the last_order_name
     */
    public Object getLast_order_name() {
        return last_order_name;
    }

    /**
     * @param last_order_name the last_order_name to set
     */
    public void setLast_order_name(Object last_order_name) {
        this.last_order_name = last_order_name;
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
     * @return the accepts_marketing_updated_at
     */
    public Object getAccepts_marketing_updated_at() {
        return accepts_marketing_updated_at;
    }

    /**
     * @param accepts_marketing_updated_at the accepts_marketing_updated_at to set
     */
    public void setAccepts_marketing_updated_at(Object accepts_marketing_updated_at) {
        this.accepts_marketing_updated_at = accepts_marketing_updated_at;
    }

    /**
     * @return the marketing_opt_in_level
     */
    public Object getMarketing_opt_in_level() {
        return marketing_opt_in_level;
    }

    /**
     * @param marketing_opt_in_level the marketing_opt_in_level to set
     */
    public void setMarketing_opt_in_level(Object marketing_opt_in_level) {
        this.marketing_opt_in_level = marketing_opt_in_level;
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
     * @return the default_address
     */
    public DefaultAddress getDefault_address() {
        return default_address;
    }

    /**
     * @param default_address the default_address to set
     */
    public void setDefault_address(DefaultAddress default_address) {
        this.default_address = default_address;
    }


}
