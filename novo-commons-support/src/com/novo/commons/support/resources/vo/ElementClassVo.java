package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ElementClassVo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String elementName;
	
	private String className;
	
	private String classCode;
	
	private List<ElementFieldVo> elementFields;
	
	private Boolean dataStatus;
	
	private Date createTime;
	
	private Date updateTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<ElementFieldVo> getElementFields() {
		return elementFields;
	}

	public void setElementFields(List<ElementFieldVo> elementFields) {
		this.elementFields = elementFields;
	}
	
}
