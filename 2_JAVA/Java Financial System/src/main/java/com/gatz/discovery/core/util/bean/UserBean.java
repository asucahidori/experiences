package com.gatz.discovery.core.util.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gatz.discovery.modules.sys.model.authority.Company;
import com.gatz.discovery.modules.sys.model.authority.Organization;
import com.gatz.discovery.modules.sys.model.authority.Position;
import com.gatz.discovery.modules.sys.model.authority.User;
import com.gatz.discovery.modules.sys.model.authority.UserRole;


public class UserBean extends ResponseBaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5832399440552379082L;

	/**
	 * 用户基本信息
	 */
	private User user;
	/**
	 * 公司信息
	 */
	private Company company;
	/**
	 * 部门基本信息
	 */
	private Organization organization;
	/**
	 * 岗位基本信息
	 */
	private Position position;
	/**
	 * Authority Map Key:系统编号 使用枚举SystemCodeEnum Value:redis Key值，用于获取用户菜单权限
	 */
	private Map<String, String> authorityKey;

	private String cookieValue;

	private Date expirationDate;
	/**
	 * 获取用户角色信息
	 * */
	private List<UserRole> userRoleList;
	/**
	 * 获取多个用户信息
	 * */
	private List<User> userList;

	public String getCookieValue() {
		return cookieValue;
	}

	public void setCookieValue(String cookieValue) {
		this.cookieValue = cookieValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

	public Map<String, String> getAuthorityKey() {
		return authorityKey;
	}

	public void setAuthorityKey(Map<String, String> authorityKey) {
		this.authorityKey = authorityKey;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		// 设置过期时间为10分钟后
		expirationDate.setTime(expirationDate.getTime() + 600000L);
		this.expirationDate = expirationDate;
	}

	public List<UserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
