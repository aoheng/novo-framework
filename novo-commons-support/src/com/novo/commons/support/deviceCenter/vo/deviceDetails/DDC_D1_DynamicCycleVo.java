package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（净水器）
 */
public class DDC_D1_DynamicCycleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间", fieldName = "currentTime", type = "date")
    private Date currentTime;

    /**
     * 滤芯A剩余百分比
     */
    @FieldDetail(name = "滤芯A剩余百分比", fieldName = "coreR1Percent", type = "int")
    private Integer coreR1Percent;

    /**
     * 滤芯B剩余百分比
     */
    @FieldDetail(name = "滤芯B剩余百分比", fieldName = "coreR2Percent", type = "int")
    private Integer coreR2Percent;

    /**
     * 滤芯C剩余百分比
     */
    @FieldDetail(name = "滤芯C剩余百分比", fieldName = "coreR3Percent", type = "int")
    private Integer coreR3Percent;

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

    /**
     * TD1
     */
    @FieldDetail(name = "TD1", fieldName = "td1", type = "int")
    private Integer td1;

    /**
     * TD2
     */
    @FieldDetail(name = "TD2", fieldName = "td2", type = "int")
    private Integer td2;

    /**
     * 节水比率
     */
    @FieldDetail(name = "节水比率", fieldName = "waterSavingRate", type = "int")
    private Integer waterSavingRate;

    /**
     * 错误数量
     */
    @FieldDetail(name = "错误数量", fieldName = "errorCount", type = "int")
    private Integer errorCount;

    /**
     * 总断网时长
     */
    @FieldDetail(name = "总断网时长", fieldName = "disconnectInterval", type = "long")
    private Long disconnectInterval;

    /**
     * 制水次数
     */
    @FieldDetail(name = "制水次数", fieldName = "produceWaterTimes", type = "int")
    private Integer produceWaterTimes;

    /**
     * 累计用水量
     */
    @FieldDetail(name = "累计用水量", fieldName = "totalWaterConsumption", type = "long")
    private Long totalWaterConsumption;

    /**
     * 当前温度
     */
    @FieldDetail(name = "当前温度", fieldName = "currentTemp", type = "int")
    private Integer currentTemp;
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

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
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

    public Integer getWaterSavingRate() {
        return waterSavingRate;
    }

    public void setWaterSavingRate(Integer waterSavingRate) {
        this.waterSavingRate = waterSavingRate;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Long getDisconnectInterval() {
        return disconnectInterval;
    }

    public void setDisconnectInterval(Long disconnectInterval) {
        this.disconnectInterval = disconnectInterval;
    }

    public Integer getProduceWaterTimes() {
        return produceWaterTimes;
    }

    public void setProduceWaterTimes(Integer produceWaterTimes) {
        this.produceWaterTimes = produceWaterTimes;
    }

    public Long getTotalWaterConsumption() {
        return totalWaterConsumption;
    }

    public void setTotalWaterConsumption(Long totalWaterConsumption) {
        this.totalWaterConsumption = totalWaterConsumption;
    }

    ////
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

    public Map<String, Object> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Map<String, Object> errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, Object> getGprs() {
        return gprs;
    }

    public void setGprs(Map<String, Object> gprs) {
        this.gprs = gprs;
    }
}
