package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumOrddetailBuilding extends TSumOrddetailBuildingKey {
    private String orderTypeId;

    private String eshopProdservName;

    private Long eshopId;

    private Long classId;

    private Long productId;

    private String productName;

    private Double unitPrice;

    private Integer quantity;

    private Double tradingPrice;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId == null ? null : orderTypeId.trim();
    }

    public String getEshopProdservName() {
        return eshopProdservName;
    }

    public void setEshopProdservName(String eshopProdservName) {
        this.eshopProdservName = eshopProdservName == null ? null : eshopProdservName.trim();
    }

    public Long getEshopId() {
        return eshopId;
    }

    public void setEshopId(Long eshopId) {
        this.eshopId = eshopId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTradingPrice() {
        return tradingPrice;
    }

    public void setTradingPrice(Double tradingPrice) {
        this.tradingPrice = tradingPrice;
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