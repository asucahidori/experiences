package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrdCustKey {
    private Long customerId;

    private Date date;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}