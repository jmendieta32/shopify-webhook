
package com.gen.shopify.webhook.vo;


public class DiscountAllocation {

    private String amount;
    private Integer discount_application_index;
    private AmountSet amountSet;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public AmountSet getAmountSet() {
        return amountSet;
    }

    public void setAmountSet(AmountSet amountSet) {
        this.amountSet = amountSet;
    }

    /**
     * @return the discount_application_index
     */
    public Integer getDiscount_application_index() {
        return discount_application_index;
    }

    /**
     * @param discount_application_index the discount_application_index to set
     */
    public void setDiscount_application_index(Integer discount_application_index) {
        this.discount_application_index = discount_application_index;
    }

}
