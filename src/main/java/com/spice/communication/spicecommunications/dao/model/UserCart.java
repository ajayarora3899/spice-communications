package com.spice.communication.spicecommunications.dao.model;

import javax.persistence.*;

@Entity
@Table(name = "user_cart")
public class UserCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer cartId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public UserCart() {
    }

    public UserCart(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
