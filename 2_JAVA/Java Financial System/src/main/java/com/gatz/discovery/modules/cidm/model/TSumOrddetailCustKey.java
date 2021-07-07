package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrddetailCustKey {
    private Long customerId;

    private Date date;

    private Long eshopProdservId;

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

    public Long getEshopProdservId() {
        return eshopProdservId;
    }

    public void setEshopProdservId(Long eshopProdservId) {
        this.eshopProdservId = eshopProdservId;
    }
}