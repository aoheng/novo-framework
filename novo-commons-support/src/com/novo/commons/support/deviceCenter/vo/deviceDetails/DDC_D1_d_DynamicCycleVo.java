package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author BinksRao on 2020/11/20
 */
public class DDC_D1_d_DynamicCycleVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间", fieldName = "currentTime", type = "date")
    private Date currentTime;
    /** 开关位 */
    @JsonIgnore
    private Map<String, Object> switchFlag;
    /** GPRS信号强度(CSQ) */
    @JsonIgnore
    private Map<String, Object> gprs;
    /** 错误代码 */
    @JsonIgnore
    private Map<String, Object> errorCode;
    /**开关位*/
    @FieldDetail(name = "开关位", fieldName = "events")
    private List<String> events;
    /**错误代码*/
    @FieldDetail(name = "错误代码", fieldName = "errors")
    private List<String> errors;
    /**信号强度（0-5）*/
    @FieldDetail(name = "信号强度（0-5）", fieldName = "signal", type = "int")
    private Integer signal;
    /** 放水模式（0：单按 1：双按） */
    @FieldDetail(name = "放水模式（0：单按 1：双按）", fieldName = "releaseWaterMode")
    private Integer releaseWaterMode;
    /** 加热保护时长（小时） */
    @FieldDetail(name = "加热保护时长", fieldName = "heatingProtectInterval")
    private Integer heatingProtectInterval;
    /** 加热温度 */
    @FieldDetail(name = "加热温度", fieldName = "heatingTemp")
    private Integer heatingTemp;
    /** 当前水值（流量） */
    @FieldDetail(name = "当前水值", fieldName = "currentWaterVal")
    private Long currentWaterVal;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Map<String, Object> getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(Map<String, Object> switchFlag) {
        this.switchFlag = switchFlag;
    }

    public Map<String, Object> getGprs() {
        return gprs;
    }

    public void setGprs(Map<String, Object> gprs) {
        this.gprs = gprs;
    }

    public Map<String, Object> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Map<String, Object> errorCode) {
        this.errorCode = errorCode;
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

    public Integer getReleaseWaterMode() {
        return releaseWaterMode;
    }

    public void setReleaseWaterMode(Integer releaseWaterMode) {
        this.releaseWaterMode = releaseWaterMode;
    }

    public Integer getHeatingProtectInterval() {
        return heatingProtectInterval;
    }

    public void setHeatingProtectInterval(Integer heatingProtectInterval) {
        this.heatingProtectInterval = heatingProtectInterval;
    }

    public Integer getHeatingTemp() {
        return heatingTemp;
    }

    public void setHeatingTemp(Integer heatingTemp) {
        this.heatingTemp = heatingTemp;
    }

    public Long getCurrentWaterVal() {
        return currentWaterVal;
    }

    public void setCurrentWaterVal(Long currentWaterVal) {
        this.currentWaterVal = currentWaterVal;
    }
}
