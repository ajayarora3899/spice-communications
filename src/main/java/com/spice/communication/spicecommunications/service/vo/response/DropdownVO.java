package com.spice.communication.spicecommunications.service.vo.response;

public class DropdownVO {


    private Object key;
    private String value;

    public DropdownVO(Object key, String value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
