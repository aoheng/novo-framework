package com.novo.commons.support.deviceCenter.vo;


import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author MickeyChen
 * @date 2020/10/30
 */
public class ScanRechargeVO {

    private Long id;

    private String deviceSn;

    private String imeiCode;

    private Integer productCode;

    @Temporal(TemporalType.TIMESTAMP)
    private Date rechargeTime;

    private Integer rechargeNum;

    @Temporal(TemporalType.TIMESTAMP)
    private Date removeTime;

    private Integer removeNum;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expireTime;

    //到期次数(总计量次数）
    private Long expireNumber;

    private Integer status;

    private String protocolVer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Integer getRechargeNum() {
        return rechargeNum;
    }

    public void setRechargeNum(Integer rechargeNum) {
        this.rechargeNum = rechargeNum;
    }

    public Date getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(Date removeTime) {
        this.removeTime = removeTime;
    }

    public Integer getRemoveNum() {
        return removeNum;
    }

    public void setRemoveNum(Integer removeNum) {
        this.removeNum = removeNum;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProtocolVer() {
        return protocolVer;
    }

    public void setProtocolVer(String protocolVer) {
        this.protocolVer = protocolVer;
    }

    public Long getExpireNumber() {
        return expireNumber;
    }

    public ScanRechargeVO setExpireNumber(Long expireNumber) {
        this.expireNumber = expireNumber;
        return this;
    }
}
