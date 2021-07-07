package com.gatz.discovery.modules.sys.model.authority;


import java.util.Date;

public class SystemInfo extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7045594977246982925L;

	private String code;//系统代码

    private int id;

    private String name;//系统名称

    private String url;//系统url

    private boolean status;//系统状态

    private String operUser;//修改人

    private Date operTime;//修改时间

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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