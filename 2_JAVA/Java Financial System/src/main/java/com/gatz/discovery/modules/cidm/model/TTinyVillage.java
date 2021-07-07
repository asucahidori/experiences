package com.gatz.discovery.modules.cidm.model;

import java.math.BigDecimal;
import java.util.Date;

public class TTinyVillage {
    private Long tinyvillageId;

    private String name;

    private Integer tinyvillageType;

    private String address;

    private Long villageId;

    private Date completeTime;

    private Long siteArea;

    private Long buildupArea;

    private Long parkNum;

    private BigDecimal plotRatio;

    private Long buildingNum;

    private Long households;

    private Float coordinateX;

    private Float coordinateY;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getTinyvillageId() {
        return tinyvillageId;
    }

    public void setTinyvillageId(Long tinyvillageId) {
        this.tinyvillageId = tinyvillageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTinyvillageType() {
        return tinyvillageType;
    }

    public void setTinyvillageType(Integer tinyvillageType) {
        this.tinyvillageType = tinyvillageType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getVillageId() {
        return villageId;
    }

    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Long getSiteArea() {
        return siteArea;
    }

    public void setSiteArea(Long siteArea) {
        this.siteArea = siteArea;
    }

    public Long getBuildupArea() {
        return buildupArea;
    }

    public void setBuildupArea(Long buildupArea) {
        this.buildupArea = buildupArea;
    }

    public Long getParkNum() {
        return parkNum;
    }

    public void setParkNum(Long parkNum) {
        this.parkNum = parkNum;
    }

    public BigDecimal getPlotRatio() {
        return plotRatio;
    }

    public void setPlotRatio(BigDecimal plotRatio) {
        this.plotRatio = plotRatio;
    }

    public Long getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Long buildingNum) {
        this.buildingNum = buildingNum;
    }

    public Long getHouseholds() {
        return households;
    }

    public void setHouseholds(Long households) {
        this.households = households;
    }

    public Float getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Float getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Float coordinateY) {
        this.coordinateY = coordinateY;
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