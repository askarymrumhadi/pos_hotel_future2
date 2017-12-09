package com.pos.hotel.model.response.base;

import java.util.ArrayList;
import java.util.List;

public class RestListResponse<T extends BaseResponse> extends BaseRestResponse {

    private List<T> content = new ArrayList<>();
    private PageMetaData pageMetaData;

    public RestListResponse() {
    }

    public RestListResponse(List<T> content) {
        this.content = content;
    }

    public RestListResponse(String errorCode, String errorMessage, boolean success) {
        super(errorCode, errorMessage, success);
    }

    public RestListResponse(String errorCode, String errorMessage, boolean success,
        List<T> content, PageMetaData pageMetaData) {
        super(errorCode, errorMessage, success);
        this.content = content;
        this.pageMetaData = pageMetaData;
    }

    public PageMetaData getPageMetaData() {
        return pageMetaData;
    }

    public void setPageMetaData(PageMetaData pageMetaData) {
        this.pageMetaData = pageMetaData;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
