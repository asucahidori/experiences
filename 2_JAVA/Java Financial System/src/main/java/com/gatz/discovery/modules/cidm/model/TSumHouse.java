package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumHouse {
    private Long areaId;

    private Date dateId;

    private Short areaType;

    private String gbCode;

    private Long squareArea;

    private Long officeBldNum;

    private Long officeParkNum;

    private Long officeArea;

    private Long houseBldNum;

    private Long houseParkNum;

    private Long houseArea;

    private Long households;

    private Long rentalNumber;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Date getDateId() {
		return dateId;
	}

	public void setDateId(Date dateId) {
		this.dateId = dateId;
	}

	public Short getAreaType() {
        return areaType;
    }

    public void setAreaType(Short areaType) {
        this.areaType = areaType;
    }

    public String getGbCode() {
        return gbCode;
    }

    public void setGbCode(String gbCode) {
        this.gbCode = gbCode == null ? null : gbCode.trim();
    }

    public Long getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(Long squareArea) {
        this.squareArea = squareArea;
    }

    public Long getOfficeBldNum() {
        return officeBldNum;
    }

    public void setOfficeBldNum(Long officeBldNum) {
        this.officeBldNum = officeBldNum;
    }

    public Long getOfficeParkNum() {
        return officeParkNum;
    }

    public void setOfficeParkNum(Long officeParkNum) {
        this.officeParkNum = officeParkNum;
    }

    public Long getOfficeArea() {
        return officeArea;
    }

    public void setOfficeArea(Long officeArea) {
        this.officeArea = officeArea;
    }

    public Long getHouseBldNum() {
        return houseBldNum;
    }

    public void setHouseBldNum(Long houseBldNum) {
        this.houseBldNum = houseBldNum;
    }

    public Long getHouseParkNum() {
        return houseParkNum;
    }

    public void setHouseParkNum(Long houseParkNum) {
        this.houseParkNum = houseParkNum;
    }

    public Long getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Long houseArea) {
        this.houseArea = houseArea;
    }

    public Long getHouseholds() {
        return households;
    }

    public void setHouseholds(Long households) {
        this.households = households;
    }

    public Long getRentalNumber() {
        return rentalNumber;
    }

    public void setRentalNumber(Long rentalNumber) {
        this.rentalNumber = rentalNumber;
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