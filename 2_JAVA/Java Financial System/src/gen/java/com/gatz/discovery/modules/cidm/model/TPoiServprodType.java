package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TPoiServprodType {
    private Long prodServTypeId;

    private String level1Code;

    private String level1Name;

    private String level2Code;

    private String level2Name;

    private String level3Code;

    private String level3Name;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Long getProdServTypeId() {
        return prodServTypeId;
    }

    public void setProdServTypeId(Long prodServTypeId) {
        this.prodServTypeId = prodServTypeId;
    }

    public String getLevel1Code() {
        return level1Code;
    }

    public void setLevel1Code(String level1Code) {
        this.level1Code = level1Code == null ? null : level1Code.trim();
    }

    public String getLevel1Name() {
        return level1Name;
    }

    public void setLevel1Name(String level1Name) {
        this.level1Name = level1Name == null ? null : level1Name.trim();
    }

    public String getLevel2Code() {
        return level2Code;
    }

    public void setLevel2Code(String level2Code) {
        this.level2Code = level2Code == null ? null : level2Code.trim();
    }

    public String getLevel2Name() {
        return level2Name;
    }

    public void setLevel2Name(String level2Name) {
        this.level2Name = level2Name == null ? null : level2Name.trim();
    }

    public String getLevel3Code() {
        return level3Code;
    }

    public void setLevel3Code(String level3Code) {
        this.level3Code = level3Code == null ? null : level3Code.trim();
    }

    public String getLevel3Name() {
        return level3Name;
    }

    public void setLevel3Name(String level3Name) {
        this.level3Name = level3Name == null ? null : level3Name.trim();
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