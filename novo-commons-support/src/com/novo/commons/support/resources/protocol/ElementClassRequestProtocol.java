package com.novo.commons.support.resources.protocol;

import java.util.List;

import com.novo.commons.support.resources.vo.ElementFieldVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class ElementClassRequestProtocol extends PaginationRequestProtocol{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	private String elementName;
	
	private String className;
	
	private List<ElementFieldVo> elementFields;

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
