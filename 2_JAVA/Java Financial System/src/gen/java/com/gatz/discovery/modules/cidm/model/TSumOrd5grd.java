package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrd5grd extends TSumOrd5grdKey {
    private Short areaType;

    private Long orderNumber;

    private Double tradingPrice;

    private Double freight;

    private Double payablePrice;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Short getAreaType() {
        return areaType;
    }

    public void setAreaType(Short areaType) {
        this.areaType = areaType;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTradingPrice() {
        return tradingPrice;
    }

    public void setTradingPrice(Double tradingPrice) {
        this.tradingPrice = tradingPrice;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Double getPayablePrice() {
        return payablePrice;
    }

    public void setPayablePrice(Double payablePrice) {
        this.payablePrice = payablePrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}