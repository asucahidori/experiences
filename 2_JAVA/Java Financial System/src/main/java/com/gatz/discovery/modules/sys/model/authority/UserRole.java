package com.gatz.discovery.modules.sys.model.authority;

import java.util.Date;

public class UserRole extends UserRoleKey {
	private Integer id;

	private String operUser;

	private Date operTime;

	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}