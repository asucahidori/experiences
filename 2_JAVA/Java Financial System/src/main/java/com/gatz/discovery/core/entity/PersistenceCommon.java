package com.gatz.discovery.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 功能说明：基础业务对象（必要的公共属性、逻辑删除数据的统一配置）
 * @author
 * @created 2014年6月12日 下午3:10:07
 * @updated
 */
@MappedSuperclass
public abstract class PersistenceCommon {
	/** 信息录入者标识id */
	@Column(length=100)
	protected String creator;
	
	/**更新人标识id*/
	@Column(length=100)
	protected String updator;
	
	/**创建时间*/
	@Temporal(TemporalType.TIMESTAMP)
	protected Date created =new Date();
	
	/**更新时间*/
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updated;
	
	@Column(length = 5)
	private Integer sort=1;
	
	@Column(length = 2000)
	protected String remark;
	
	 /** 实体的状态 1启用，0禁用 */
    @Column(nullable = false, length = 1)
    protected Integer status=1;
    /**删除标记1已删除 0未删除 默认0*/
	@Column(length=1)
	protected Integer delStatue=0;
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDelStatue() {
		return delStatue;
	}
	public void setDelStatue(Integer delStatue) {
		this.delStatue = delStatue;
	}

}
