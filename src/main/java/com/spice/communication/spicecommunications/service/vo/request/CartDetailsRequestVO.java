package com.spice.communication.spicecommunications.service.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

public class CartDetailsRequestVO {

    private Integer cartDetailsId;
    private Integer cartId;
    private Integer mobId;
    private Integer variantId;
    private Integer count;

    public CartDetailsRequestVO() {
    }

    public Integer getCartDetailsId() {
        return cartDetailsId;
    }

    public void setCartDetailsId(Integer cartDetailsId) {
        this.cartDetailsId = cartDetailsId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getMobId() {
        return mobId;
    }

    public void setMobId(Integer mobId) {
        this.mobId = mobId;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
