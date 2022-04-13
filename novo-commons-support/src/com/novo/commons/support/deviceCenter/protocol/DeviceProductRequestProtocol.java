package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * 设备产品
 */
public class DeviceProductRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**产品名称*/
    private String productName;
    /**产品所属类型代码*/
    private Integer productTypeCode;
    /**产品描述*/
    private String productDesc;
    /**产品代码*/
    private Integer productCode;
    /**产品秘钥*/
    private String prodPassword;
    /**产品适用的协议id集合*/
    private List<Long> protocolIdList;
    /**产品滤芯集合*/
    private List<DeviceProductCoreCycleRequestProtocol> coreCycleReqs;

    private List<Integer> productCodeList;

    public List<Integer> getProductCodeList() {
        return productCodeList;
    }

    public void setProductCodeList(List<Integer> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(Integer productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProdPassword() {
        return prodPassword;
    }

    public void setProdPassword(String prodPassword) {
        this.prodPassword = prodPassword;
    }

    public List<Long> getProtocolIdList() {
        return protocolIdList;
    }

    public void setProtocolIdList(List<Long> protocolIdList) {
        this.protocolIdList = protocolIdList;
    }

    public List<DeviceProductCoreCycleRequestProtocol> getCoreCycleReqs() {
        return coreCycleReqs;
    }

    public void setCoreCycleReqs(List<DeviceProductCoreCycleRequestProtocol> coreCycleReqs) {
        this.coreCycleReqs = coreCycleReqs;
    }
}
