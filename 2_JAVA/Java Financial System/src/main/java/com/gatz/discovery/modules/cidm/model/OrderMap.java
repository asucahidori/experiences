package com.gatz.discovery.modules.cidm.model;

import java.util.Date;

public class OrderMap {
	private long id;
	private String name;
	private Double ordersCount;
	private Date date;
	private long population;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getOrdersCount() {
		return ordersCount;
	}
	public void setOrdersCount(Double ordersCount) {
		this.ordersCount = ordersCount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}

	
	
}
