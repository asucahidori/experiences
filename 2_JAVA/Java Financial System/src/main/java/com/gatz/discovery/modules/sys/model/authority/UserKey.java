package com.gatz.discovery.modules.sys.model.authority;


public class UserKey extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7906649573024838063L;

	private String username;

    private String origSystemCode;

    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOrigSystemCode() {
        return origSystemCode;
    }

    public void setOrigSystemCode(String origSystemCode) {
        this.origSystemCode = origSystemCode == null ? null : origSystemCode.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}