package com.pos.hotel.model.response.base;

public class BaseRestResponse {
    private String errorCode;
    private String errorMessage;
    private boolean success;

    public BaseRestResponse() {}

    public BaseRestResponse(String errorCode, String errorMessage, boolean success) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
