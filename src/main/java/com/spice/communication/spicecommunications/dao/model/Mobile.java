package com.spice.communication.spicecommunications.dao.model;

import javax.persistence.*;

@Entity
@Table(name="mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer mobileId;

    @Column(name = "mobile_name")
    private String mobileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Mobile() {
    }

    public Mobile(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
