package com.spice.communication.spicecommunications.service.exception;

public class SpiceBaseException extends Exception{

    private String errorCode;

    public SpiceBaseException(String errorCode) {
        this.errorCode = errorCode;
    }

    public SpiceBaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public SpiceBaseException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public SpiceBaseException(Throwable cause, String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public SpiceBaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
