package com.novo.commons.support.customer.protocol.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-05-03 10:31
 **/

public class CouponCustomerVo implements Serializable {

    private Long id;
    /**
     * 客户id
     */
    private Long customerId;

    /**
     * 优惠券Id
     */
    private Long couponId;
    /**
     * 组织码
     */
    private String orgCode;


    /**
     * 状态（0：未使用，1：已使用）
     */
    private Integer status;

    /**
     * 领取来源类型(0，app、1，微信公众号、2，网页)
     */
    private Integer resource;

    /**
     * 类型（0:优惠券，1：充值券）
     */
    private Integer type;

    /**
     * 满减金额
     */
    private BigDecimal fullMoney;


    /**
     * 开始时间
     */
    private String startDate;

    /**
     * 结束时间
     */
    private String endDate;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getResource() {
        return resource;
    }

    public void setResource(Integer resource) {
        this.resource = resource;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getFullMoney() {
        return fullMoney;
    }

    public void setFullMoney(BigDecimal fullMoney) {
        this.fullMoney = fullMoney;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
