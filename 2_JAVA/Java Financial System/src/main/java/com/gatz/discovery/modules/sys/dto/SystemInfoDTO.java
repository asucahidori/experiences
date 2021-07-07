package com.gatz.discovery.modules.sys.dto;


import java.io.Serializable;
import java.util.List;

import com.gatz.discovery.modules.sys.model.authority.Module;
import com.gatz.discovery.modules.sys.model.authority.SystemInfo;



public class SystemInfoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1436322703436427767L;
	/**
	 * 系统基本信息
	 */
	private SystemInfo systemInfo;
	/**
	 * 系统模块列表
	 */
	private List<Module> moduleList;
	
	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}
}
