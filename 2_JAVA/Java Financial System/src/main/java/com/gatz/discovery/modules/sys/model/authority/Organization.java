package com.gatz.discovery.modules.sys.model.authority;

import java.util.Date;

public class Organization extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8785547545099812208L;

	private Integer id;

	private String ids[];

	private Integer parentId;

	private Integer companyId;

	private String companyName;

	private String name;

	private Integer type;

	private Integer status;

	private String operUser;

	private Date operTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
}