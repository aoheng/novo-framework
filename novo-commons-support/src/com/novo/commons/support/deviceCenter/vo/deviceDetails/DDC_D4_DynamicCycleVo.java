package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author BinksRao on 2020/1/4
 */
public class DDC_D4_DynamicCycleVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 当前时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间", fieldName = "currentTime", type = "date")
    private Date currentTime;

    /**
     * 开关位
     */
    @FieldDetail(name = "开关位", fieldName = "events")
    private List<String> events;

    /**
     * 错误代码
     */
    @FieldDetail(name = "错误代码", fieldName = "errors")
    private List<String> errors;

    /**
     * 信号强度（0-5）
     */
    @FieldDetail(name = "信号强度（0-5）", fieldName = "signal", type = "int")
    private Integer signal;

    /** 套餐模式 */
    @FieldDetail(name = "套餐模式", fieldName = "chargeMode")
    private Integer chargeMode;
    /** 投币型套餐参数 */
    @FieldDetail(name = "投币型套餐参数", fieldName = "coinsPackage")
    private Integer coinsPackage;
    /** 计时型套餐参数 */
    @FieldDetail(name = "计时型套餐参数", fieldName = "timePackage")
    private Integer timePackage;
    /** 到期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "到期时间", fieldName = "deviceExpireTime")
    private Date deviceExpireTime;
    /** 投币数 */
    @FieldDetail(name = "投币数", fieldName = "coinsTotal")
    private Integer coinsTotal;
    /** RFID数据 */
    @FieldDetail(name = "RFID数据", fieldName = "rfidInfo")
    private String rfidInfo;

    /**
     * 开关位
     */
    @JsonIgnore
    private Map<String, Object> switchFlag;
    /**
     * 错误代码
     */
    @JsonIgnore
    private Map<String, Object> errorCode;
    /**
     * GPRS信号强度(CSQ)
     */
    @JsonIgnore
    private Map<String, Object> gprs;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public List<String> getEvents() {
        if (switchFlag != null)
            this.events = (List<String>) switchFlag.get("events");
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public List<String> getErrors() {
        if (errorCode != null)
            this.errors = (List<String>) errorCode.get("errors");
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Integer getSignal() {
        if (gprs != null)
            this.signal = (Integer) gprs.get("signal");
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
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

    public String getRfidInfo() {
        return rfidInfo;
    }

    public void setRfidInfo(String rfidInfo) {
        this.rfidInfo = rfidInfo;
    }
}
