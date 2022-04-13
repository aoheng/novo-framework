package com.novo.commons.support.operator.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.novo.framework.core.entity.BaseEntity;

public class OperatorLoginVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 代理商账号
	 */
	private String loginName;

	private String connecterMobile;

	private String operatorName;

	private String password;

	// 代理商id
	private String id;

	// 用户id
	private String uid;
	private Byte installStatus;
	private String orgCode;

	private Integer type;
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getConnecterMobile() {
		return connecterMobile;
	}

	public void setConnecterMobile(String connecterMobile) {
		this.connecterMobile = connecterMobile;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Byte getInstallStatus() {
		return installStatus;
	}

	public void setInstallStatus(Byte installStatus) {
		this.installStatus = installStatus;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
  
	
}
