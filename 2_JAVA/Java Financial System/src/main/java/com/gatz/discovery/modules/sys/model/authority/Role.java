package com.gatz.discovery.modules.sys.model.authority;


import java.util.Date;

public class Role extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3870402338499399861L;

	private Integer id;

    private String name;

    private String systemCode;

    private Integer depJuriType;

    private String depJuri;

    private Integer systemJuriType;

    private String systemJuri;

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

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    public Integer getDepJuriType() {
        return depJuriType;
    }

    public void setDepJuriType(Integer depJuriType) {
        this.depJuriType = depJuriType;
    }

    public String getDepJuri() {
        return depJuri;
    }

    public void setDepJuri(String depJuri) {
        this.depJuri = depJuri == null ? null : depJuri.trim();
    }

    public Integer getSystemJuriType() {
        return systemJuriType;
    }

    public void setSystemJuriType(Integer systemJuriType) {
        this.systemJuriType = systemJuriType;
    }

    public String getSystemJuri() {
        return systemJuri;
    }

    public void setSystemJuri(String systemJuri) {
        this.systemJuri = systemJuri == null ? null : systemJuri.trim();
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