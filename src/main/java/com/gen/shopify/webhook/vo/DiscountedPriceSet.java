package com.gen.shopify.webhook.vo;



public class DiscountedPriceSet {

    private ShopMoney shop_money;
    private PresentmentMoney presentment_money;

    /**
     * @return the shop_money
     */
    public ShopMoney getShop_money() {
        return shop_money;
    }

    /**
     * @param shop_money the shop_money to set
     */
    public void setShop_money(ShopMoney shop_money) {
        this.shop_money = shop_money;
    }

    /**
     * @return the presentment_money
     */
    public PresentmentMoney getPresentment_money() {
        return presentment_money;
    }

    /**
     * @param presentment_money the presentment_money to set
     */
    public void setPresentment_money(PresentmentMoney presentment_money) {
        this.presentment_money = presentment_money;
    }

}
