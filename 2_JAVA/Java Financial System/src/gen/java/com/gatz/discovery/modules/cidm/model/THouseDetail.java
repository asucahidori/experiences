package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class THouseDetail {
    private Long houseId;

    private Integer houseType;

    private Short floor;

    private Integer buildupArea;

    private Date purchaseDate;

    private String decorateStyle;

    private String decorateLevel;

    private String tvBrand;

    private String tvSize;

    private String tvColor;

    private String airconBrand;

    private String airconType;

    private String airconColor;

    private Byte roomNumber;

    private Byte roomSize;

    private String roomDirection;

    private Byte windowNumber;

    private String windowDirection;

    private Byte bathroomNumber;

    private String bathroomSize;

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

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Short getFloor() {
        return floor;
    }

    public void setFloor(Short floor) {
        this.floor = floor;
    }

    public Integer getBuildupArea() {
        return buildupArea;
    }

    public void setBuildupArea(Integer buildupArea) {
        this.buildupArea = buildupArea;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getDecorateStyle() {
        return decorateStyle;
    }

    public void setDecorateStyle(String decorateStyle) {
        this.decorateStyle = decorateStyle == null ? null : decorateStyle.trim();
    }

    public String getDecorateLevel() {
        return decorateLevel;
    }

    public void setDecorateLevel(String decorateLevel) {
        this.decorateLevel = decorateLevel == null ? null : decorateLevel.trim();
    }

    public String getTvBrand() {
        return tvBrand;
    }

    public void setTvBrand(String tvBrand) {
        this.tvBrand = tvBrand == null ? null : tvBrand.trim();
    }

    public String getTvSize() {
        return tvSize;
    }

    public void setTvSize(String tvSize) {
        this.tvSize = tvSize == null ? null : tvSize.trim();
    }

    public String getTvColor() {
        return tvColor;
    }

    public void setTvColor(String tvColor) {
        this.tvColor = tvColor == null ? null : tvColor.trim();
    }

    public String getAirconBrand() {
        return airconBrand;
    }

    public void setAirconBrand(String airconBrand) {
        this.airconBrand = airconBrand == null ? null : airconBrand.trim();
    }

    public String getAirconType() {
        return airconType;
    }

    public void setAirconType(String airconType) {
        this.airconType = airconType == null ? null : airconType.trim();
    }

    public String getAirconColor() {
        return airconColor;
    }

    public void setAirconColor(String airconColor) {
        this.airconColor = airconColor == null ? null : airconColor.trim();
    }

    public Byte getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Byte roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Byte getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Byte roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomDirection() {
        return roomDirection;
    }

    public void setRoomDirection(String roomDirection) {
        this.roomDirection = roomDirection == null ? null : roomDirection.trim();
    }

    public Byte getWindowNumber() {
        return windowNumber;
    }

    public void setWindowNumber(Byte windowNumber) {
        this.windowNumber = windowNumber;
    }

    public String getWindowDirection() {
        return windowDirection;
    }

    public void setWindowDirection(String windowDirection) {
        this.windowDirection = windowDirection == null ? null : windowDirection.trim();
    }

    public Byte getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(Byte bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    public String getBathroomSize() {
        return bathroomSize;
    }

    public void setBathroomSize(String bathroomSize) {
        this.bathroomSize = bathroomSize == null ? null : bathroomSize.trim();
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