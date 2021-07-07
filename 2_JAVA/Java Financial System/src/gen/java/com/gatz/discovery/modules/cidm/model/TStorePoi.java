package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TStorePoi {
    private Long storePoiId;

    private Long storeId;

    private Long cityId;

    private String name;

    private String region;

    private Long openstausFlag;

    private String opentatus;

    private Long optionFlag;

    private String option;

    private Date opentime;

    private String supervisor;

    private Long svTelno;

    private String manager;

    private Long mgTelno;

    private String address;

    private Float coordinateX;

    private Float coordinateY;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String filler01;

    private String filler02;

    private String filler03;

    private String filler04;

    private String filler05;

    public Long getStorePoiId() {
        return storePoiId;
    }

    public void setStorePoiId(Long storePoiId) {
        this.storePoiId = storePoiId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Long getOpenstausFlag() {
        return openstausFlag;
    }

    public void setOpenstausFlag(Long openstausFlag) {
        this.openstausFlag = openstausFlag;
    }

    public String getOpentatus() {
        return opentatus;
    }

    public void setOpentatus(String opentatus) {
        this.opentatus = opentatus == null ? null : opentatus.trim();
    }

    public Long getOptionFlag() {
        return optionFlag;
    }

    public void setOptionFlag(Long optionFlag) {
        this.optionFlag = optionFlag;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public Long getSvTelno() {
        return svTelno;
    }

    public void setSvTelno(Long svTelno) {
        this.svTelno = svTelno;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Long getMgTelno() {
        return mgTelno;
    }

    public void setMgTelno(Long mgTelno) {
        this.mgTelno = mgTelno;
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

    public String getFiller01() {
        return filler01;
    }

    public void setFiller01(String filler01) {
        this.filler01 = filler01 == null ? null : filler01.trim();
    }

    public String getFiller02() {
        return filler02;
    }

    public void setFiller02(String filler02) {
        this.filler02 = filler02 == null ? null : filler02.trim();
    }

    public String getFiller03() {
        return filler03;
    }

    public void setFiller03(String filler03) {
        this.filler03 = filler03 == null ? null : filler03.trim();
    }

    public String getFiller04() {
        return filler04;
    }

    public void setFiller04(String filler04) {
        this.filler04 = filler04 == null ? null : filler04.trim();
    }

    public String getFiller05() {
        return filler05;
    }

    public void setFiller05(String filler05) {
        this.filler05 = filler05 == null ? null : filler05.trim();
    }
}