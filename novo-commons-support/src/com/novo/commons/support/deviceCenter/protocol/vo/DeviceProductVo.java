package com.novo.commons.support.deviceCenter.protocol.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 产品信息
 * @author mark_lu
 * 2020年1月24日
 */
public class DeviceProductVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**产品名称*/
    private String productName;
    /**产品所属类型代码*/
    private Integer productTypeCode;
    /**产品所属类型名称*/
    private String productType;
    /**产品描述*/
    private String productDesc;
    /**产品代码*/
    private Integer productCode;
    /**产品秘钥*/
    private String prodPassword;
    /**组织代码*/
    private String orgCode;
    /**创建时间*/
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime;
    /**产品适用的协议集合*/
    private List<DeviceProtocolVo> protocolVoList;
    /**产品适用的协议集合*/
    private List<DeviceProductCoreCycleVo> coreCycleVos;

    private Boolean status = false;//用于标识前端选中状态

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public List<DeviceProtocolVo> getProtocolVoList() {
        return protocolVoList;
    }

    public void setProtocolVoList(List<DeviceProtocolVo> protocolVoList) {
        this.protocolVoList = protocolVoList;
    }

    public List<DeviceProductCoreCycleVo> getCoreCycleVos() {
        return coreCycleVos;
    }

    public void setCoreCycleVos(List<DeviceProductCoreCycleVo> coreCycleVos) {
        this.coreCycleVos = coreCycleVos;
    }
}
