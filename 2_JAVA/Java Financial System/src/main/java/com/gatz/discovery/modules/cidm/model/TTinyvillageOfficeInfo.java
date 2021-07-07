package com.gatz.discovery.modules.cidm.model;

import java.math.BigDecimal;
import java.util.Date;

public class TTinyvillageOfficeInfo {
    private Long tinyvillageId;

    private String districtName;

    private String addressa;

    private String bldGrade;

    private String managementType;

    private Long buildupArea;

    private Long sitArea;

    private Long bayArea;

    private Long households;

    private BigDecimal far;

    private Byte elevatorNum;

    private Byte cargoNum;

    private Integer groundFloorNum;

    private Integer layerNum;

    private Long groundParkNum;

    private Long layerParkNum;

    private String propertyCompany;

    private BigDecimal managementFee;

    private Date completeDate;

    private String completeDateType;

    private String developer;

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

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public String getAddressa() {
        return addressa;
    }

    public void setAddressa(String addressa) {
        this.addressa = addressa == null ? null : addressa.trim();
    }

    public String getBldGrade() {
        return bldGrade;
    }

    public void setBldGrade(String bldGrade) {
        this.bldGrade = bldGrade == null ? null : bldGrade.trim();
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType == null ? null : managementType.trim();
    }

    public Long getBuildupArea() {
        return buildupArea;
    }

    public void setBuildupArea(Long buildupArea) {
        this.buildupArea = buildupArea;
    }

    public Long getSitArea() {
        return sitArea;
    }

    public void setSitArea(Long sitArea) {
        this.sitArea = sitArea;
    }

    public Long getBayArea() {
        return bayArea;
    }

    public void setBayArea(Long bayArea) {
        this.bayArea = bayArea;
    }

    public Long getHouseholds() {
        return households;
    }

    public void setHouseholds(Long households) {
        this.households = households;
    }

    public BigDecimal getFar() {
        return far;
    }

    public void setFar(BigDecimal far) {
        this.far = far;
    }

    public Byte getElevatorNum() {
        return elevatorNum;
    }

    public void setElevatorNum(Byte elevatorNum) {
        this.elevatorNum = elevatorNum;
    }

    public Byte getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(Byte cargoNum) {
        this.cargoNum = cargoNum;
    }

    public Integer getGroundFloorNum() {
        return groundFloorNum;
    }

    public void setGroundFloorNum(Integer groundFloorNum) {
        this.groundFloorNum = groundFloorNum;
    }

    public Integer getLayerNum() {
        return layerNum;
    }

    public void setLayerNum(Integer layerNum) {
        this.layerNum = layerNum;
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

    public String getPropertyCompany() {
        return propertyCompany;
    }

    public void setPropertyCompany(String propertyCompany) {
        this.propertyCompany = propertyCompany == null ? null : propertyCompany.trim();
    }

    public BigDecimal getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(BigDecimal managementFee) {
        this.managementFee = managementFee;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getCompleteDateType() {
        return completeDateType;
    }

    public void setCompleteDateType(String completeDateType) {
        this.completeDateType = completeDateType == null ? null : completeDateType.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
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