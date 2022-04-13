package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author BinksRao on 2020/11/21
 */
public class DDC_D3_DynamicCycleVO  implements Serializable {
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

    /** 出风模式（0：auto 1：静音 2：强风） */
    @FieldDetail(name = "出风模式", fieldName = "windMode")
    private Integer windMode;
    /** PM2.5 */
    @FieldDetail(name = "PM2.5", fieldName = "pm25")
    private Integer pm25;
    /** 当前温度 */
    @FieldDetail(name = "当前温度", fieldName = "currentTemp")
    private Integer currentTemp;
    /** 湿度 */
    @FieldDetail(name = "湿度", fieldName = "humidity")
    private Integer humidity;
    /** VOC（0：优 1：中 2：差） */
    @FieldDetail(name = "VOC", fieldName = "voc")
    private Integer voc;
    /** 滤芯A百分比 */
    @FieldDetail(name = "滤芯A百分比", fieldName = "coreR1Percent")
    private Integer coreR1Percent;

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

    public Integer getWindMode() {
        return windMode;
    }

    public void setWindMode(Integer windMode) {
        this.windMode = windMode;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getVoc() {
        return voc;
    }

    public void setVoc(Integer voc) {
        this.voc = voc;
    }

    public Integer getCoreR1Percent() {
        return coreR1Percent;
    }

    public void setCoreR1Percent(Integer coreR1Percent) {
        this.coreR1Percent = coreR1Percent;
    }
}
