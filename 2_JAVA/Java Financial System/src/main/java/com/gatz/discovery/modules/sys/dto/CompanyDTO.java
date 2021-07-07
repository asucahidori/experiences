package com.gatz.discovery.modules.sys.dto;

import java.io.Serializable;
import java.util.List;

import com.gatz.discovery.modules.sys.model.authority.Company;
import com.gatz.discovery.modules.sys.model.authority.SystemInfo;


public class CompanyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5501659038154263416L;
	/**
	 * 公司基本信息
	 */
	private Company company;
	/**
	 * 公司系统权限列表
	 */
	private List<SystemInfo> systemList;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<SystemInfo> getSystemList() {
		return systemList;
	}

	public void setSystemList(List<SystemInfo> systemList) {
		this.systemList = systemList;
	}
	
}
