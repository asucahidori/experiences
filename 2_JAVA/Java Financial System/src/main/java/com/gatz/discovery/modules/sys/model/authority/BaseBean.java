package com.gatz.discovery.modules.sys.model.authority;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class BaseBean  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 450641423308011628L;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.DEFAULT_STYLE);
	}
}
