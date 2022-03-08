package com.spice.communication.spicecommunications.service.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserResponseVO {

    @JsonProperty(value = "id")
    private Integer userId;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "mob")
    private String mobNumber;

    @JsonProperty(value = "g")
    private Integer gender;

    @JsonProperty(value = "ad")
    private String address;

    @JsonProperty(value = "uname")
    private String username;

    @JsonProperty(value = "pass")
    private String password;

    @JsonProperty(value = "regOn")
    private Date registeredOn;

    public UserResponseVO() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Date registeredOn) {
        this.registeredOn = registeredOn;
    }
}
