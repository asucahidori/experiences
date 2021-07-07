package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class TSumPopulation extends TSumPopulationKey {
	
	private Date dateId;
	
	private Long areaId;
	
    private Short areaType;

    private Long population;

    private Long malePopulation;

    private Long femalePopulation;

    private Short comsumeLevel;

    private Long nuclearFamily;

    private Long leadNum;

    private Integer status;

    private Integer version;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private double onepersonhouseratio;
    
    private double twopersonhouseratio;
    
    private double threepersonhouseratio;
    
    private double fourpersonhouseratio;
    
    private double fivepersonhouseratio;
    
    public Short getAreaType() {
        return areaType;
    }

    public void setAreaType(Short areaType) {
        this.areaType = areaType;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getMalePopulation() {
        return malePopulation;
    }

    public void setMalePopulation(Long malePopulation) {
        this.malePopulation = malePopulation;
    }

    public Long getFemalePopulation() {
        return femalePopulation;
    }

    public void setFemalePopulation(Long femalePopulation) {
        this.femalePopulation = femalePopulation;
    }

    public Short getComsumeLevel() {
        return comsumeLevel;
    }

    public void setComsumeLevel(Short comsumeLevel) {
        this.comsumeLevel = comsumeLevel;
    }

    public Long getNuclearFamily() {
        return nuclearFamily;
    }

    public void setNuclearFamily(Long nuclearFamily) {
        this.nuclearFamily = nuclearFamily;
    }

    public Long getLeadNum() {
        return leadNum;
    }

    public void setLeadNum(Long leadNum) {
        this.leadNum = leadNum;
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

	public double getOnepersonhouseratio() {
		return onepersonhouseratio;
	}

	public void setOnepersonhouseratio(double onepersonhouseratio) {
		this.onepersonhouseratio = onepersonhouseratio;
	}

	public double getTwopersonhouseratio() {
		return twopersonhouseratio;
	}

	public void setTwopersonhouseratio(double twopersonhouseratio) {
		this.twopersonhouseratio = twopersonhouseratio;
	}

	public double getThreepersonhouseratio() {
		return threepersonhouseratio;
	}

	public void setThreepersonhouseratio(double threepersonhouseratio) {
		this.threepersonhouseratio = threepersonhouseratio;
	}

	public double getFourpersonhouseratio() {
		return fourpersonhouseratio;
	}

	public void setFourpersonhouseratio(double fourpersonhouseratio) {
		this.fourpersonhouseratio = fourpersonhouseratio;
	}

	public double getFivepersonhouseratio() {
		return fivepersonhouseratio;
	}

	public void setFivepersonhouseratio(double fivepersonhouseratio) {
		this.fivepersonhouseratio = fivepersonhouseratio;
	}
    
}