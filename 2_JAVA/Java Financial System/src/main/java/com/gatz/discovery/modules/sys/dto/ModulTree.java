package com.gatz.discovery.modules.sys.dto;

public class ModulTree {
	private String id;
	private String pId;
	private String type;
	private String name;
	private String userName;
	private String nameCode;
	private String code;
	private String parameter;
	private String url;
	private String open = "false";
	private String icon;
	private String status;
	private String checked;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNameCode() {
		return nameCode;
	}

	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getUl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOpen() {
		if (this.pId.equals("0")) {
			open = "false";
		}
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

}
