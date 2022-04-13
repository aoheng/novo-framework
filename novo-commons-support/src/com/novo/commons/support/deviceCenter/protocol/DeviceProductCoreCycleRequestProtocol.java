package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author BinksRao on 2020/12/19
 */
public class DeviceProductCoreCycleRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**产品id*/
    private Long productId;

    /**滤芯名称-显示名称*/
    private String coreType;

    /**滤芯名称-对应协议中的滤芯*/
    private String coreName;

    /**周期数量*/
    private Integer cycleNumber;

    /**周期类型(0月，1周，2天，3小时)*/
    private Integer cycleType;

    /**备注描述*/
    private String remark;

    private List<Long> productIdList;

    public List<Long> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getCoreType() {
        return coreType;
    }

    public void setCoreType(String coreType) {
        this.coreType = coreType;
    }

    public Integer getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(Integer cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    public Integer getCycleType() {
        return cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCoreName() {
        return coreName;
    }

    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }
}
