package com.pos.hotel.model.response.base;

import java.util.ArrayList;
import java.util.List;

public class RestListResponse<T extends Object> extends BaseRestResponse {

    private List<T> content = new ArrayList<>();

    public RestListResponse() {
    }

    public RestListResponse(List<T> content) {
        this.content = content;
    }

    public RestListResponse(String errorCode, String errorMessage, boolean success) {
        super(errorCode, errorMessage, success);
    }

    public RestListResponse(String errorCode, String errorMessage, boolean success,
        List<T> content) {
        super(errorCode, errorMessage, success);
        this.content = content;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
