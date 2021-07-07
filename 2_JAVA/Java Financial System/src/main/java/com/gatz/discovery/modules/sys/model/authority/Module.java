package com.gatz.discovery.modules.sys.model.authority;

import java.util.Date;

public class Module extends BaseBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8808510788988402354L;

	private String moduleCode;//模块代码

    private int id;

    private String systemCode;//系统代码

    private String parentCode;//上级模块代码

    private String name;//模块名称

    private int type;//模块类型

    private int moduleOrder;//排序

    private String parameter;//传递参数

    private String url;//模块URL

    private String operUser;//操作人

    private Date operTime;//操作时间
    
    private String code;
    

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(int moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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