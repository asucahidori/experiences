package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TTinyvillageHomeInfo {
    private Long tinyvillageId;

    private String districtName;

    private String addressa;

    private String houseType;

    private Short buildYear;

    private String buildingType;

    private Long propertyFee;

    private String propertyCompany;

    private String buildCompany;

    private Short buildingNum;

    private Double far;

    private Short houseNum;

    private Double greenRate;

    private String schoolDistrict;

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

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public Short getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Short buildYear) {
        this.buildYear = buildYear;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public Long getPropertyFee() {
        return propertyFee;
    }

    public void setPropertyFee(Long propertyFee) {
        this.propertyFee = propertyFee;
    }

    public String getPropertyCompany() {
        return propertyCompany;
    }

    public void setPropertyCompany(String propertyCompany) {
        this.propertyCompany = propertyCompany == null ? null : propertyCompany.trim();
    }

    public String getBuildCompany() {
        return buildCompany;
    }

    public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany == null ? null : buildCompany.trim();
    }

    public Short getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Short buildingNum) {
        this.buildingNum = buildingNum;
    }

    public Double getFar() {
        return far;
    }

    public void setFar(Double far) {
        this.far = far;
    }

    public Short getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Short houseNum) {
        this.houseNum = houseNum;
    }

    public Double getGreenRate() {
        return greenRate;
    }

    public void setGreenRate(Double greenRate) {
        this.greenRate = greenRate;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict == null ? null : schoolDistrict.trim();
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