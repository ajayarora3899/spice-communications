package com.spice.communication.spicecommunications.common;

public enum ErrorCodes {

    USER_NOT_REGISTERED("0000", "User Not Registered");

    private String errorCode;
    private String message;

    ErrorCodes(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
