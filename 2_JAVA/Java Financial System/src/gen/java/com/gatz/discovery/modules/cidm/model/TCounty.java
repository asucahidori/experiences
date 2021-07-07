package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

import com.gatz.discovery.modules.cidm.model.TCity;
import com.gatz.discovery.modules.cidm.model.TSumOrd5grd;
import com.gatz.discovery.modules.cidm.model.TSumPopulation;

public class TCounty {
    private Long countyId;

    private String gbCode;

    private String name;

    private Long cityId;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;
    private TCity tCity;
    private TSumPopulation tSumPopulation;
    private TSumOrd5grd tSumOrd5grd;


    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
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

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
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
    
    public TCity gettCity() {
		return tCity;
	}

	public void settCity(TCity tCity) {
		this.tCity = tCity;
	}

	public TSumPopulation gettSumPopulation() {
		return tSumPopulation;
	}

	public void settSumPopulation(TSumPopulation tSumPopulation) {
		this.tSumPopulation = tSumPopulation;
	}

	public TSumOrd5grd gettSumOrd5grd() {
		return tSumOrd5grd;
	}

	public void settSumOrd5grd(TSumOrd5grd tSumOrd5grd) {
		this.tSumOrd5grd = tSumOrd5grd;
	}
}