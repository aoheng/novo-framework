package com.novo.commons.support.resources.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-12-01 10:57
 **/

public class PanelConfigVo implements Serializable {
    private Long id;

    /**
     * 订单/客户数量(0:订单数量 1:客户数量)
     */
    private Integer totalNumber;

    /**
     * 设别接入(0:是 1:否)
     */
    private Integer joinUp;
    /**
     * 设别/运营商分布(0:设别分布 1:运营商分布)
     */
    private Integer distribute;
    /**
     * 订单统计(0:有 1:无)
     */
    private Integer orderCount;
    /**
     * 收益金额(0:有 1:无)
     */
    private Integer incomeAmount;

    private Integer checkAll;
    
    private String orgCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Integer getJoinUp() {
		return joinUp;
	}

	public void setJoinUp(Integer joinUp) {
		this.joinUp = joinUp;
	}

	public Integer getDistribute() {
		return distribute;
	}

	public void setDistribute(Integer distribute) {
		this.distribute = distribute;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(Integer incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public Integer getCheckAll() {
		return checkAll;
	}

	public void setCheckAll(Integer checkAll) {
		this.checkAll = checkAll;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

    //*****************************************************************************************************


   
    
}
