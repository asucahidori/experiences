package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TTown {
    private Long townId;

    private String gbCode;

    private String name;

    private Long countyId;

    private Integer squareArea;

    private String introduction;

    private Integer householdNumber;

    private Integer residentPopulationNumber;

    private Double baiduCoordinateX;

    private Double baiduCoordinateY;

    private Double gaodeCoordinateLat;

    private Double gaodeCoordinateLng;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private Long createUserId;

    private Long updateUserId;

    private Boolean batch;

    public Long getTownId() {
        return townId;
    }

    public void setTownId(Long townId) {
        this.townId = townId;
    }

    public String getGbCode() {
        return gbCode;
    }

    public void setGbCode(String gbCode) {
        this.gbCode = gbCode == null ? null : gbCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public Integer getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(Integer squareArea) {
        this.squareArea = squareArea;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(Integer householdNumber) {
        this.householdNumber = householdNumber;
    }

    public Integer getResidentPopulationNumber() {
        return residentPopulationNumber;
    }

    public void setResidentPopulationNumber(Integer residentPopulationNumber) {
        this.residentPopulationNumber = residentPopulationNumber;
    }

    public Double getBaiduCoordinateX() {
        return baiduCoordinateX;
    }

    public void setBaiduCoordinateX(Double baiduCoordinateX) {
        this.baiduCoordinateX = baiduCoordinateX;
    }

    public Double getBaiduCoordinateY() {
        return baiduCoordinateY;
    }

    public void setBaiduCoordinateY(Double baiduCoordinateY) {
        this.baiduCoordinateY = baiduCoordinateY;
    }

    public Double getGaodeCoordinateLat() {
        return gaodeCoordinateLat;
    }

    public void setGaodeCoordinateLat(Double gaodeCoordinateLat) {
        this.gaodeCoordinateLat = gaodeCoordinateLat;
    }

    public Double getGaodeCoordinateLng() {
        return gaodeCoordinateLng;
    }

    public void setGaodeCoordinateLng(Double gaodeCoordinateLng) {
        this.gaodeCoordinateLng = gaodeCoordinateLng;
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

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Boolean getBatch() {
        return batch;
    }

    public void setBatch(Boolean batch) {
        this.batch = batch;
    }
}