package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TBldHouse {
    private Long houseId;

    private Long buildingId;

    private Short floor;

    private String buildingUnitNo;

    private String buildingHouseNo;

    private String address;

    private Float coordinateX;

    private Float coordinateY;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public Short getFloor() {
        return floor;
    }

    public void setFloor(Short floor) {
        this.floor = floor;
    }

    public String getBuildingUnitNo() {
        return buildingUnitNo;
    }

    public void setBuildingUnitNo(String buildingUnitNo) {
        this.buildingUnitNo = buildingUnitNo == null ? null : buildingUnitNo.trim();
    }

    public String getBuildingHouseNo() {
        return buildingHouseNo;
    }

    public void setBuildingHouseNo(String buildingHouseNo) {
        this.buildingHouseNo = buildingHouseNo == null ? null : buildingHouseNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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