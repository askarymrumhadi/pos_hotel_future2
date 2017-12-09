package com.pos.hotel.model.response.base;

import java.math.BigDecimal;

public class PageMetaData {
    private int page;
    private int size;
    private BigDecimal totalRecords = BigDecimal.ZERO;

    public PageMetaData() {}

    public PageMetaData(int page, int size, BigDecimal totalRecords) {
        this.page = page;
        this.size = size;
        this.totalRecords = totalRecords;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(BigDecimal totalRecords) {
        this.totalRecords = totalRecords;
    }
}
