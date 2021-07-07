package com.gatz.discovery.core.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
/**
 * 功能说明：简单树基类
 * @updated
 */
@MappedSuperclass
public abstract class SimpleTreePersistenceComon extends PersistenceCommon {
    /**节点名称*/
	@Column
	protected String name;
	/**节点名称code*/
	@Column
	protected String code;
    /**节点链接的目标 URL*/
	@Column
	protected String url;
	@Column
	protected String icon;
    /**节点的父级id
     * 第一层节点为"0"
     * */
	@Column
	protected String pId;
    /**节点的层级,默认为1*/
	@Column
	protected Integer treeLeveal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public Integer getTreeLeveal() {
		return treeLeveal;
	}
	public void setTreeLeveal(Integer treeLeveal) {
		this.treeLeveal = treeLeveal;
	}
	   
	   
}
