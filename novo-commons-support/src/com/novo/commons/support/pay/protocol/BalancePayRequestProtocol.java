package com.novo.commons.support.pay.protocol;
/**
 * @author LK
 * @createDate 2020-09-07
 */
public class BalancePayRequestProtocol {
	private String  serialno;
	private Integer amount;
	private String orgCode;
	private Long customerId;
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
}
