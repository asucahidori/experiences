package com.gatz.discovery.modules.sys.model.authority;

import java.util.Date;

public class User extends UserKey {

	private Integer companyId;

	private String companyName;

	private Integer depId;

	private String depName;

	private Integer positionId;

	private String realName;

	private Integer sex;

	private String idCard;

	private String password;

	private String mobile;

	private String email;

	private String phone;

	private Integer status;

	private String operUser;

	private Date operTime;

	private Long sequenceId;

	public Long getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
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

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
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