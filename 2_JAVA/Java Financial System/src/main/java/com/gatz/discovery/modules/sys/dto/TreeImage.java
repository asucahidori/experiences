package com.gatz.discovery.modules.sys.dto;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class TreeImage {
	public static String COMPANY_PNG = "/assets/img/ztree/company.png";// 公司

	public static String DEPT_PNG = "/assets/img/ztree/dept.png";// 部门

	public static String MODULE_PNG = "/assets/img/ztree/module.png";// 模块

	public static String POSITION_PNG = "/assets/img/ztree/position.png";// 岗位

	public static String ROLE_PNG = "/assets/img/ztree/role.png";// 角色

	public static String SYSTEM_PNG = "/assets/img/ztree/system.png";// 系统

	public static String USER_PNG = "/assets/img/ztree/user.png";// 用户

	public static String BUTTON_PNG = "/assets/img/ztree/button.png";// 按钮

	public static String MENU_PNG = "/assets/img/ztree/menu.png";// 菜单


	private static HttpServletRequest getRequest() {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();  
		return ((ServletRequestAttributes)ra).getRequest();
	}


	public static String getCOMPANY_PNG() {
		return getRequest().getContextPath()+COMPANY_PNG;
	}

	public static void setCOMPANY_PNG(String cOMPANY_PNG) {
		COMPANY_PNG = cOMPANY_PNG;
	}

	public static String getDEPT_PNG() {
		return getRequest().getContextPath()+DEPT_PNG;
	}

	public static void setDEPT_PNG(String dEPT_PNG) {
		DEPT_PNG = dEPT_PNG;
	}

	public static String getMODULE_PNG() {
		return getRequest().getContextPath()+MODULE_PNG;
	}

	public static void setMODULE_PNG(String mODULE_PNG) {
		MODULE_PNG = mODULE_PNG;
	}

	public static String getPOSITION_PNG() {
		return getRequest().getContextPath()+POSITION_PNG;
	}

	public static void setPOSITION_PNG(String pOSITION_PNG) {
		POSITION_PNG = pOSITION_PNG;
	}

	public static String getROLE_PNG() {
		return getRequest().getContextPath()+ROLE_PNG;
	}

	public static void setROLE_PNG(String rOLE_PNG) {
		ROLE_PNG = rOLE_PNG;
	}

	public static String getSYSTEM_PNG() {
		return getRequest().getContextPath()+SYSTEM_PNG;
	}

	public static void setSYSTEM_PNG(String sYSTEM_PNG) {
		SYSTEM_PNG = sYSTEM_PNG;
	}

	public static String getUSER_PNG() {
		return getRequest().getContextPath()+USER_PNG;
	}

	public static void setUSER_PNG(String uSER_PNG) {
		USER_PNG = uSER_PNG;
	}

	public static String getBUTTON_PNG() {
		return getRequest().getContextPath()+BUTTON_PNG;
	}

	public static void setBUTTON_PNG(String bUTTON_PNG) {
		BUTTON_PNG = bUTTON_PNG;
	}

	public static String getMENU_PNG() {
		return getRequest().getContextPath()+MENU_PNG;
	}

	public static void setMENU_PNG(String mENU_PNG) {
		MENU_PNG = mENU_PNG;
	}

}
