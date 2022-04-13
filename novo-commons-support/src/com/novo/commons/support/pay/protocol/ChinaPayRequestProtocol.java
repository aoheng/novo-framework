package com.novo.commons.support.pay.protocol;
/**
 * @author LK
 * @createDate 2020-08-30
 */
public class ChinaPayRequestProtocol {
	private String orderNo;
	private Integer price;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
