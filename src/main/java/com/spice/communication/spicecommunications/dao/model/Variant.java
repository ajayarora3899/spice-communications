package com.spice.communication.spicecommunications.dao.model;

import javax.persistence.*;

@Entity
@Table(name="variant")
public class Variant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer variantId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mob_id")
    private Mobile mobile;

    @Column(name = "ram")
    private String ram;

    @Column(name = "storage")
    private String storage;

    @Column(name = "total")
    private Integer totalPiece;

    @Column(name = "available")
    private Integer availablePiece;

    @Column(name = "price")
    private Integer price;

    public Variant() {
    }

    public Variant(Integer variantId) {
        this.variantId = variantId;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Integer getTotalPiece() {
        return totalPiece;
    }

    public void setTotalPiece(Integer totalPiece) {
        this.totalPiece = totalPiece;
    }

    public Integer getAvailablePiece() {
        return availablePiece;
    }

    public void setAvailablePiece(Integer availablePiece) {
        this.availablePiece = availablePiece;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
