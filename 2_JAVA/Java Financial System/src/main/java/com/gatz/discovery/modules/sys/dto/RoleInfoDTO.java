package com.gatz.discovery.modules.sys.dto;


import java.io.Serializable;

import com.gatz.discovery.modules.sys.model.authority.Role;



public class RoleInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8073031934445602037L;
	/**
	 * 角色基本信息
	 */
	private Role role;
	/**
	 * 角色系统权限
	 */
	private SystemInfoDTO systemDTO;

	public Role getRoleInfo() {
		return role;
	}

	public void setRoleInfo(Role role) {
		this.role = role;
	}

	public SystemInfoDTO getSystemDTO() {
		return systemDTO;
	}

	public void setSystemDTO(SystemInfoDTO systemDTO) {
		this.systemDTO = systemDTO;
	}
	
	
}
