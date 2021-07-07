package com.gatz.discovery.modules.cidm.model;

public class AreaMapVo {
	private long id;
	private String longitudeX;
	private String longitudeY;
	private String gaodeLat;
	private String gaodeLng;
	private int type;
	private String areaName;
	private Integer  tinyvillageType;
	private long  population;
	private Long income;
	private Long expend;
	public String getGaodeLat() {
		return gaodeLat;
	}
	public void setGaodeLat(String gaodeLat) {
		this.gaodeLat = gaodeLat;
	}
	public String getGaodeLng() {
		return gaodeLng;
	}
	public void setGaodeLng(String gaodeLng) {
		this.gaodeLng = gaodeLng;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLongitudeX() {
		return longitudeX;
	}
	public void setLongitudeX(String longitudeX) {
		this.longitudeX = longitudeX;
	}
	public String getLongitudeY() {
		return longitudeY;
	}
	public void setLongitudeY(String longitudeY) {
		this.longitudeY = longitudeY;
	}
	public Integer getTinyvillageType() {
		return tinyvillageType;
	}
	public void setTinyvillageType(Integer tinyvillageType) {
		this.tinyvillageType = tinyvillageType;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Long getIncome() {
		return income;
	}
	public void setIncome(Long income) {
		this.income = income;
	}
	public Long getExpend() {
		return expend;
	}
	public void setExpend(Long expend) {
		this.expend = expend;
	}
}
