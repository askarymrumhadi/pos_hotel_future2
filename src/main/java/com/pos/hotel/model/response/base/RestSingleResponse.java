package com.pos.hotel.model.response.base;

public class RestSingleResponse<T extends BaseResponse> extends BaseRestResponse {

    private T value;

    public RestSingleResponse() {
    }

    public RestSingleResponse(T value) {
        this.value = value;
    }

    public RestSingleResponse(String errorCode, String errorMessage, boolean success) {
        super(errorCode, errorMessage, success);
    }

    public RestSingleResponse(String errorCode, String errorMessage, boolean success, T value) {
        super(errorCode, errorMessage, success);
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
