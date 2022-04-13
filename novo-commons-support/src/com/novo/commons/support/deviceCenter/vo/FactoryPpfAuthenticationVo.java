package com.novo.commons.support.deviceCenter.vo;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/11/5
 */
public class FactoryPpfAuthenticationVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String createTime;
    private String updateTime;
    private String factoryId;
    private String batchNo;
    private Integer deviceType;
    private String ppfType;
    private String ppfSn;
    private String antifakeKey;
    private Integer shipmentStatus;
    private String shipmentTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getPpfType() {
        return ppfType;
    }

    public void setPpfType(String ppfType) {
        this.ppfType = ppfType;
    }

    public String getPpfSn() {
        return ppfSn;
    }

    public void setPpfSn(String ppfSn) {
        this.ppfSn = ppfSn;
    }

    public String getAntifakeKey() {
        return antifakeKey;
    }

    public void setAntifakeKey(String antifakeKey) {
        this.antifakeKey = antifakeKey;
    }

    public Integer getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(Integer shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(String shipmentTime) {
        this.shipmentTime = shipmentTime;
    }
}
