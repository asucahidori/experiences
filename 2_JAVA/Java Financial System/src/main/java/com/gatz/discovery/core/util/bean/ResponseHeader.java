package com.gatz.discovery.core.util.bean;

import com.gatz.discovery.modules.sys.model.authority.BaseBean;




public class ResponseHeader extends BaseBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2635424722215574601L;

	private String code;
	
	private String message;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
