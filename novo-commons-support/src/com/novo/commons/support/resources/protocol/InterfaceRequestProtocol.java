package com.novo.commons.support.resources.protocol;

import java.util.List;


import com.novo.commons.support.resources.vo.InterfaceParamVo;
import com.novo.commons.support.resources.vo.OrgAndInterfaceVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class InterfaceRequestProtocol extends PaginationRequestProtocol{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	private List<InterfaceParamVo> params;

	private String name;
	
	private String targetServiceName;
	
	private Boolean isOpen; 
	
	private String desc;
	
	private List<OrgAndInterfaceVo> orgAndInterfaces;

	public List<OrgAndInterfaceVo> getOrgAndInterfaces() {
		return orgAndInterfaces;
	}

	public void setOrgAndInterfaces(List<OrgAndInterfaceVo> orgAndInterfaces) {
		this.orgAndInterfaces = orgAndInterfaces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTargetServiceName() {
		return targetServiceName;
	}

	public void setTargetServiceName(String targetServiceName) {
		this.targetServiceName = targetServiceName;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<InterfaceParamVo> getParams() {
		return params;
	}

	public void setParams(List<InterfaceParamVo> params) {
		this.params = params;
	}
	
	
}
