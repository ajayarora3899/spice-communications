package com.spice.communication.spicecommunications.dao.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CartDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer cartDetailsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private UserCart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mob_id")
    private Mobile mobile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "variant_id")
    private Variant variant;

    private Integer count;

    public CartDetails() {
    }

    public Integer getCartDetailsId() {
        return cartDetailsId;
    }

    public void setCartDetailsId(Integer cartDetailsId) {
        this.cartDetailsId = cartDetailsId;
    }

    public UserCart getCart() {
        return cart;
    }

    public void setCart(UserCart cart) {
        this.cart = cart;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
