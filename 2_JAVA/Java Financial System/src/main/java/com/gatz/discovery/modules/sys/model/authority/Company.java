package com.gatz.discovery.modules.sys.model.authority;

import java.util.Date;

public class Company extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1712084052754959615L;

	private Integer id;

    private String name;

    private Integer status;

    private String operUser;

    private Date operTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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