package com.gatz.discovery.modules.sys.model.authority;


public class UserRoleKey extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5050870478456392863L;

	private String systemCode;

    private Integer roleId;

    private String username;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}