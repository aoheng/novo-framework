package com.novo.commons.support.resources.vo;

import java.io.Serializable;


public class OrgAndInterfaceVo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private String orgCode;
	
	private Long id;
	
	private Long interfaceId;
	
	private Boolean isOpen;
	
	private InterfaceInfoVo interfaceInfo;
	
	public InterfaceInfoVo getInterfaceInfo() {
		return interfaceInfo;
	}

	public void setInterfaceInfo(InterfaceInfoVo interfaceInfo) {
		this.interfaceInfo = interfaceInfo;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(Long interfaceId) {
		this.interfaceId = interfaceId;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	} 
	
	
}
