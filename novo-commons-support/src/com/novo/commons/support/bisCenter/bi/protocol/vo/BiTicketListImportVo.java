package com.novo.commons.support.bisCenter.bi.protocol.vo;


import com.novo.commons.util.excel.annotation.TitleCell;

import java.io.Serializable;

/**
 * 电影票券导入VO
 */
public class BiTicketListImportVo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@TitleCell(name= "客户手机号码【必填】" , column = 1)
	private String customerMobile;//客户手机号码
	
	@TitleCell(name= "电影券码【必填】" , column = 2)
	private String couponCode;//电影券码
	
	@TitleCell(name= "活动过期时间【必填】" , column = 3)
	private String dueTime;//活动过期时间

	public String getCustomerMobile() {
		return customerMobile;
	}

	public BiTicketListImportVo setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
		return this;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public BiTicketListImportVo setCouponCode(String couponCode) {
		this.couponCode = couponCode;
		return this;
	}

	public String getDueTime() {
		return dueTime;
	}

	public BiTicketListImportVo setDueTime(String dueTime) {
		this.dueTime = dueTime;
		return this;
	}
}
