package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-12-01 10:56
 **/

public class PanelConfigRequestProtocol extends PaginationRequestProtocol {

    private Long id;

    /**
     * 订单/客户数量(0:订单数量 1:客户数量)
     */
    private Integer totalNumber;

    /**
     * 设别接入(0:否 1:是)
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


    private Integer checkAll;

    
    private Boolean isCheckAll; 
//*****************************************************************************************************

 

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    

    public Integer getDistribute() {
        return distribute;
    }

    public void setDistribute(Integer distribute) {
        this.distribute = distribute;
    }

    /**
     * 收益金额(0:有 1:无)
     */
    private Integer incomeAmount;

	public Integer getJoinUp() {
		return joinUp;
	}

	public void setJoinUp(Integer joinUp) {
		this.joinUp = joinUp;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getCheckAll() {
		return checkAll;
	}

	public void setCheckAll(Integer checkAll) {
		this.checkAll = checkAll;
	}

	public Integer getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(Integer incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public Boolean getIsCheckAll() {
		return isCheckAll;
	}

	public void setIsCheckAll(Boolean isCheckAll) {
		this.isCheckAll = isCheckAll;
	}

    //*****************************************************************************************************
    

}
