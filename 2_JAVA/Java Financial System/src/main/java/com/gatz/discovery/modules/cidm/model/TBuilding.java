package com.gatz.discovery.modules.cidm.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.minidev.json.JSONObject;

public class TBuilding {
    private Long buildingId;

    private String name;

    private Long tinyvillageId;

    private String description;

    private Long buildupArea;

    private Long households;

    private Long groundParkNum;

    private Long layerParkNum;

    private Float coordinateX;

    private Float coordinateY;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getTinyvillageId() {
        return tinyvillageId;
    }

    public void setTinyvillageId(Long tinyvillageId) {
        this.tinyvillageId = tinyvillageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getBuildupArea() {
        return buildupArea;
    }

    public void setBuildupArea(Long buildupArea) {
        this.buildupArea = buildupArea;
    }

    public Long getHouseholds() {
        return households;
    }

    public void setHouseholds(Long households) {
        this.households = households;
    }

    public Long getGroundParkNum() {
        return groundParkNum;
    }

    public void setGroundParkNum(Long groundParkNum) {
        this.groundParkNum = groundParkNum;
    }

    public Long getLayerParkNum() {
        return layerParkNum;
    }

    public void setLayerParkNum(Long layerParkNum) {
        this.layerParkNum = layerParkNum;
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