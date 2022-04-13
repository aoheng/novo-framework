package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import com.novo.framework.core.type.BaseDataType;

public class InterfaceParamVo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	
	private String paramName;
	
	private BaseDataType paramType;
	
	private Boolean isRequired;
	
	private String regex;
	
	private Long interfaceId;

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public BaseDataType getParamType() {
		return paramType;
	}

	public void setParamType(BaseDataType paramType) {
		this.paramType = paramType;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public Long getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(Long interfaceId) {
		this.interfaceId = interfaceId;
	}
	
	
}
