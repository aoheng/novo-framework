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
public class DDC_D1_f_DynamicCycleVo implements Serializable {
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

    /** 杀菌参数 */
    @JsonIgnore
    private Map<String, Object> sterilization;
    /** TD1 */
    @FieldDetail(name = "净化前水质", fieldName = "TD1")
    private Integer td1;
    /** TD2 */
    @FieldDetail(name = "净化后水质", fieldName = "TD2")
    private Integer td2;
    /** TDS校准比例值 */
    @JsonIgnore
    private Map<String, Object> tdsAdjust;
    /** 节水比率 */
    @FieldDetail(name = "节水比率", fieldName = "waterSavingRate")
    private Integer waterSavingRate;
    /** 累计用水量 */
    @FieldDetail(name = "累计用水量", fieldName = "totalWaterConsumption")
    private Long totalWaterConsumption;
    /** 温度信息 */
    @FieldDetail(name = "温度信息", fieldName = "tempInfo")
    private Integer tempInfo;
    /** 加热状态 */
    @FieldDetail(name = "加热状态", fieldName = "heatingStatus")
    private Integer heatingStatus;
    /** 液位状态 */
    @FieldDetail(name = "液位状态", fieldName = "liquidLevel")
    private Integer liquidLevel;

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

    public Map<String, Object> getSterilization() {
        return sterilization;
    }

    public void setSterilization(Map<String, Object> sterilization) {
        this.sterilization = sterilization;
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

    public Map<String, Object> getTdsAdjust() {
        return tdsAdjust;
    }

    public void setTdsAdjust(Map<String, Object> tdsAdjust) {
        this.tdsAdjust = tdsAdjust;
    }

    public Integer getWaterSavingRate() {
        return waterSavingRate;
    }

    public void setWaterSavingRate(Integer waterSavingRate) {
        this.waterSavingRate = waterSavingRate;
    }

    public Long getTotalWaterConsumption() {
        return totalWaterConsumption;
    }

    public void setTotalWaterConsumption(Long totalWaterConsumption) {
        this.totalWaterConsumption = totalWaterConsumption;
    }

    public Integer getTempInfo() {
        return tempInfo;
    }

    public void setTempInfo(Integer tempInfo) {
        this.tempInfo = tempInfo;
    }

    public Integer getHeatingStatus() {
        return heatingStatus;
    }

    public void setHeatingStatus(Integer heatingStatus) {
        this.heatingStatus = heatingStatus;
    }

    public Integer getLiquidLevel() {
        return liquidLevel;
    }

    public void setLiquidLevel(Integer liquidLevel) {
        this.liquidLevel = liquidLevel;
    }
}
