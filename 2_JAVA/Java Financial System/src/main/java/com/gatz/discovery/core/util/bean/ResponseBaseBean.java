package com.gatz.discovery.core.util.bean;


import java.io.Serializable;

import com.gatz.discovery.modules.sys.model.authority.BaseBean;



public class ResponseBaseBean extends BaseBean  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6249498327525979188L;

	private ResponseHeader header;
	
	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

}
