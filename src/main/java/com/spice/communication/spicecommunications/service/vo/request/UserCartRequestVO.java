package com.spice.communication.spicecommunications.service.vo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

public class UserCartRequestVO {

    private Integer cartId;
    private Integer userId;

    public UserCartRequestVO() {
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
