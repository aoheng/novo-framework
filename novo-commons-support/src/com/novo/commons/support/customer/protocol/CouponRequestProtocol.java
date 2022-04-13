package com.novo.commons.support.customer.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-05-02 19:12
 **/

public class CouponRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;

    public static final String my_field_id = "id";

    public static final String my_field_saveMoney = "saveMoney";

    public static final String my_field_type = "type";

    /**
     * 关联客户id
     */
    private Long customerId;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 优惠券支付金额
     */
    private Long payMoney;

    /**
     * 优惠券赠送金额
     */
    private Long saveMoney;

    /**
     * 优惠券面额
     */
    private Long fullMoney;

    /**
     * 组织码
     */
    private String orgCode;

    /**
     * 使用备注
     */
    private String remark;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 发行总量
     */
    private Long number;

    /**
     * 已领取的数量(初始化为0)
     */
    private Integer totalNumber = 0;

    /**
     * 剩余数量
     */
    private Integer limitNumber;

    /**
     * 优惠券开始时间
     */
    private String startDate;

    /**
     * 优惠券结束时间
     */
    private String endDate;


    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public Long getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(Long saveMoney) {
        this.saveMoney = saveMoney;
    }

    public Long getFullMoney() {
        return fullMoney;
    }

    public void setFullMoney(Long fullMoney) {
        this.fullMoney = fullMoney;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
