package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrddetailBuildingKey {
    private Long buildingId;

    private Date date;

    private Long eshopProdservId;

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
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