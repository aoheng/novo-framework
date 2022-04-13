package com.novo.commons.support.operator.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.novo.framework.core.entity.BaseEntity;

public class AppOperatorVo implements Serializable {

	private static final long serialVersionUID = 1L;

	// 代理商名称
	private String operatorName;

	// 代理商id
	private String id;

	// 设备可用额度
	private Integer baseUseNumber;

	// 代理商头像路径
	private String headimgurl;

	// 代理商返利余额
	private Long rebate;

	// 代理商层级名称
	private String levelName;

	// 代理商账户版本
	private Integer accountVersion;

	// 代理商账户开户人
	private String accName;

	// 代理商账户开户账户
	private String accBankNum;

	// 代理商账户开户行
	private String bankName;

	// 代理商账户账户总额
	private String balance;

	// 代理商id
	private String accountId;
	
	private String connecterMobile;
	
	private String loginName;
	
	//管理奖励
	private Long recommendRebate;
	
	//开拓奖励
	private Long manageRebate;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBaseUseNumber() {
		return baseUseNumber;
	}

	public void setBaseUseNumber(Integer baseUseNumber) {
		this.baseUseNumber = baseUseNumber;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public Long getRebate() {
		return rebate;
	}

	public void setRebate(Long rebate) {
		this.rebate = rebate;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getAccountVersion() {
		return accountVersion;
	}

	public void setAccountVersion(Integer accountVersion) {
		this.accountVersion = accountVersion;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBankNum() {
		return accBankNum;
	}

	public void setAccBankNum(String accBankNum) {
		this.accBankNum = accBankNum;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getConnecterMobile() {
		return connecterMobile;
	}

	public void setConnecterMobile(String connecterMobile) {
		this.connecterMobile = connecterMobile;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Long getRecommendRebate() {
		return recommendRebate;
	}

	public void setRecommendRebate(Long recommendRebate) {
		this.recommendRebate = recommendRebate;
	}

	public Long getManageRebate() {
		return manageRebate;
	}

	public void setManageRebate(Long manageRebate) {
		this.manageRebate = manageRebate;
	}

	 
}
