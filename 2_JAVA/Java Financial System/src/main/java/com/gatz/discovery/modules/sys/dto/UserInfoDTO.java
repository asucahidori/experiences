package com.gatz.discovery.modules.sys.dto;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gatz.discovery.modules.sys.model.authority.Organization;
import com.gatz.discovery.modules.sys.model.authority.Position;
import com.gatz.discovery.modules.sys.model.authority.User;

public class UserInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8548161073399982335L;
	/**
	 * 用户基本信息
	 */
	private User user;
	/**
	 * 角色信息和角色权限
	 */
	private List<RoleInfoDTO> roleInfoDTOList;
	
	private Map<String,RoleInfoDTO> roleDTOMap = new HashMap<String, RoleInfoDTO>();

	public Map<String, RoleInfoDTO> getRoleDTOMap() {
		return roleDTOMap;
	}

	public void setRoleDTOMap(Map<String, RoleInfoDTO> roleDTOMap) {
		this.roleDTOMap.putAll(roleDTOMap);
	}

	/**
	 * 公司和公司权限信息
	 */
	private CompanyDTO companyDTO;
	/**
	 * 部门基本信息
	 */
	private Organization organization;
	/**
	 * 岗位基本信息
	 */
	private Position position;

	public User getUserInfo() {
		return user;
	}

	public void setUserInfo(User user) {
		this.user = user;
	}

	public List<RoleInfoDTO> getRoleInfoDTOList() {
		return roleInfoDTOList;
	}

	public void setRoleInfoDTOList(List<RoleInfoDTO> roleInfoDTOList) {
		this.roleInfoDTOList = roleInfoDTOList;
	}

	public CompanyDTO getCompanyDTO() {
		return companyDTO;
	}

	public void setCompanyDTO(CompanyDTO companyDTO) {
		this.companyDTO = companyDTO;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
}
