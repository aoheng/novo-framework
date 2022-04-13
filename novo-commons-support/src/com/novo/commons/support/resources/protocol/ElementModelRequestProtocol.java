package com.novo.commons.support.resources.protocol;


import java.util.List;

import com.novo.commons.support.resources.vo.ElementFieldVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class ElementModelRequestProtocol extends PaginationRequestProtocol{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private String modelName;
	
	private Long elementClassId;

	private String modelDesc;
	
	private List<ElementFieldVo> elementFields;

	private String targetOrgCode;
	
	private String modelCode;
	
	private Boolean dataStatus;
	
	public Boolean getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getTargetOrgCode() {
		return targetOrgCode;
	}

	public void setTargetOrgCode(String targetOrgCode) {
		this.targetOrgCode = targetOrgCode;
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
