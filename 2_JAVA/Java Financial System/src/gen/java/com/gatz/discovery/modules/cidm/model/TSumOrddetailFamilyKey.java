package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrddetailFamilyKey {
    private Date date;

    private Long eshopProdservId;

    private Long houseId;

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

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }
}