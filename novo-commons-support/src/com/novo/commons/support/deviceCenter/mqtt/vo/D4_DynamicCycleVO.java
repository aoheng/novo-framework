package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（NOVO-BOT）
 */
public class D4_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 套餐模式 */
    private Integer chargeMode;
    /** 投币型套餐参数 */
    private Integer coinsPackage;
    /** 计时型套餐参数 */
    private Integer timePackage;
    /** 到期时间 */
    private Date deviceExpireTime;
    /** 投币数 */
    private Integer coinsTotal;
    /** TD1 */
    private Integer td1;
    /** TD2 */
    private Integer td2;
    /** RFID数据 */
    private String rfidInfo;
    /** 滤芯信息 */
    private D4_ByteArrayPpfDetails ppfDetails;
    /** 开关位 */
    private D4_ByteArraySwitchFlag switchFlag;
    /** 错误代码 */
    private D4_ByteArrayErrorCode errorCode;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public ByteGprs getGprs() {
        return gprs;
    }

    public void setGprs(ByteGprs gprs) {
        this.gprs = gprs;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Integer getCoinsPackage() {
        return coinsPackage;
    }

    public void setCoinsPackage(Integer coinsPackage) {
        this.coinsPackage = coinsPackage;
    }

    public Integer getTimePackage() {
        return timePackage;
    }

    public void setTimePackage(Integer timePackage) {
        this.timePackage = timePackage;
    }

    public Date getDeviceExpireTime() {
        return deviceExpireTime;
    }

    public void setDeviceExpireTime(Date deviceExpireTime) {
        this.deviceExpireTime = deviceExpireTime;
    }

    public Integer getCoinsTotal() {
        return coinsTotal;
    }

    public void setCoinsTotal(Integer coinsTotal) {
        this.coinsTotal = coinsTotal;
    }

    public Integer getTd1() {
        return td1;
    }

    public void setTd1(Integer td1) {
        this.td1 = td1;
    }

    public Integer getTd2() {
        return td2;
    }

    public void setTd2(Integer td2) {
        this.td2 = td2;
    }

    public String getRfidInfo() {
        return rfidInfo;
    }

    public void setRfidInfo(String rfidInfo) {
        this.rfidInfo = rfidInfo;
    }

    public D4_ByteArrayPpfDetails getPpfDetails() {
        return ppfDetails;
    }

    public void setPpfDetails(D4_ByteArrayPpfDetails ppfDetails) {
        this.ppfDetails = ppfDetails;
    }

    public D4_ByteArraySwitchFlag getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(D4_ByteArraySwitchFlag switchFlag) {
        this.switchFlag = switchFlag;
    }

    public D4_ByteArrayErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(D4_ByteArrayErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
