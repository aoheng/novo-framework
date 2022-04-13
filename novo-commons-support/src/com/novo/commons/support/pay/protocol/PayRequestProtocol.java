package com.novo.commons.support.pay.protocol;


import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author LK
 * @createDate 2020-09-03
 */
public class PayRequestProtocol{
	public static final String MY_FIELD_ORDERID="serialno";
	public static final String MY_FIELD_PRICE="amount";
	public static final String MY_FIELD_BODY="body";
	public static final String MY_FIELD_PAYTYPE="payType";
	public static final String MY_FIELD_OPENID="openId";
	public static final String MY_FIELD_CUSTOMERID="customerId";
	public static final String ORGCODE = "orgCode";
	private HttpServletResponse response;
	private String  serialno;
	private Integer amount;
	private String orgCode;
	private String body;
	private Long customerId;
	private String openId;
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
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
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PayRequestProtocol [serialno=");
		builder.append(serialno);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", body=");
		builder.append(body);
		builder.append(", payType=");
		builder.append(", customerId=");
		builder.append(customerId);
		builder.append(", openId=");
		builder.append(openId);
		builder.append("]");
		return builder.toString();
	}
}