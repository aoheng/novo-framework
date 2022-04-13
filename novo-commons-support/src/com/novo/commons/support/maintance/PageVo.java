package com.novo.commons.support.maintance;

/**
 * @author MickeyChen
 * @date 2020/01/29
 */
public class PageVo extends SignVo {

	private static final long serialVersionUID = 1L;
	
	private Integer pageNo;          //请求页数
	private Long customerId;      //客户id
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
	
}
