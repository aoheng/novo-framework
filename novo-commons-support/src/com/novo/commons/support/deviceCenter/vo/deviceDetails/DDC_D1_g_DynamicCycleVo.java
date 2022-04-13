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
public class DDC_D1_g_DynamicCycleVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**当前时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间", fieldName = "currentTime", type = "date")
    private Date currentTime;
    /**开关位*/
    @FieldDetail(name = "开关位", fieldName = "events")
    private List<String> events;
    /**错误代码*/
    @FieldDetail(name = "错误代码", fieldName = "errors")
    private List<String> errors;
    /**信号强度（0-5）*/
    @FieldDetail(name = "信号强度（0-5）", fieldName = "signal", type = "int")
    private Integer signal;
    /** 开关位 */
    @JsonIgnore
    private Map<String, Object> switchFlag;
    /** GPRS信号强度(CSQ) */
    @JsonIgnore
    private Map<String, Object> gprs;
    /** 错误代码 */
    @JsonIgnore
    private Map<String, Object> errorCode;

    /** A滤芯剩余百分比 */
    @FieldDetail(name = "A滤芯剩余百分比", fieldName = "coreR1Percent")
    private Integer coreR1Percent;
    /** B滤芯剩余百分比 */
    @FieldDetail(name = "B滤芯剩余百分比", fieldName = "coreR2Percent")
    private Integer coreR2Percent;
    /** C滤芯剩余百分比 */
    @FieldDetail(name = "C滤芯剩余百分比", fieldName = "coreR3Percent")
    private Integer coreR3Percent;
    /** D滤芯剩余百分比 */
    @FieldDetail(name = "D滤芯剩余百分比", fieldName = "coreR4Percent")
    private Integer coreR4Percent;
    /** 总断网时长 */
    @FieldDetail(name = "总断网时长", fieldName = "disconnectInterval")
    private Long disconnectInterval;
    /** 累计用水量 */
    @FieldDetail(name = "累计用水量", fieldName = "totalWaterConsumption")
    private Long totalWaterConsumption;
    /** 当前温度 */
    @FieldDetail(name = "当前温度", fieldName = "currentTemp")
    private Integer currentTemp;
    /** 当前温度模式 */
    @JsonIgnore
    private Map<String, Object> tempMode;
    /** 加热温度 */
    @FieldDetail(name = "加热温度", fieldName = "heatingTemp")
    private Integer heatingTemp;

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

    public Integer getCoreR1Percent() {
        return coreR1Percent;
    }

    public void setCoreR1Percent(Integer coreR1Percent) {
        this.coreR1Percent = coreR1Percent;
    }

    public Integer getCoreR2Percent() {
        return coreR2Percent;
    }

    public void setCoreR2Percent(Integer coreR2Percent) {
        this.coreR2Percent = coreR2Percent;
    }

    public Integer getCoreR3Percent() {
        return coreR3Percent;
    }

    public void setCoreR3Percent(Integer coreR3Percent) {
        this.coreR3Percent = coreR3Percent;
    }

    public Integer getCoreR4Percent() {
        return coreR4Percent;
    }

    public void setCoreR4Percent(Integer coreR4Percent) {
        this.coreR4Percent = coreR4Percent;
    }

    public Long getDisconnectInterval() {
        return disconnectInterval;
    }

    public void setDisconnectInterval(Long disconnectInterval) {
        this.disconnectInterval = disconnectInterval;
    }

    public Long getTotalWaterConsumption() {
        return totalWaterConsumption;
    }

    public void setTotalWaterConsumption(Long totalWaterConsumption) {
        this.totalWaterConsumption = totalWaterConsumption;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Map<String, Object> getTempMode() {
        return tempMode;
    }

    public void setTempMode(Map<String, Object> tempMode) {
        this.tempMode = tempMode;
    }

    public Integer getHeatingTemp() {
        return heatingTemp;
    }

    public void setHeatingTemp(Integer heatingTemp) {
        this.heatingTemp = heatingTemp;
    }
}
