package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ElementModelVo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String modelName;
	
	private Long elementClassId;

	private String modelDesc;
	
	private List<ElementFieldVo> elementFields;

	private Boolean dataStatus;
	
	private Date createTime;
	
	private Date updateTime;
	
	private String modelCode;
	
	private String orgCode;
	
	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Long getElementClassId() {
		return elementClassId;
	}

	public void setElementClassId(Long elementClassId) {
		this.elementClassId = elementClassId;
	}

	public String getModelDesc() {
		return modelDesc;
	}

	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	public List<ElementFieldVo> getElementFields() {
		return elementFields;
	}

	public void setElementFields(List<ElementFieldVo> elementFields) {
		this.elementFields = elementFields;
	}
	
}
