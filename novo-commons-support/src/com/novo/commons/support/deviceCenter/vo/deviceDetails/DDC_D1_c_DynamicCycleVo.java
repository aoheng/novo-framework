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
public class DDC_D1_c_DynamicCycleVo implements Serializable {
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

    /** TD1 */
    @FieldDetail(name = "净化前水质", fieldName = "TD1")
    private Integer td1;
    /** TD2 */
    @FieldDetail(name = "净化后水质", fieldName = "TD2")
    private Integer td2;
    /** 节水比率 */
    @FieldDetail(name = "节水比率", fieldName = "waterSavingRate")
    private Integer waterSavingRate;
    /** 总断网时长 */
    @FieldDetail(name = "总断网时长", fieldName = "disconnectInterval")
    private Long disconnectInterval;
    /** 制水次数 */
    @FieldDetail(name = "制水次数", fieldName = "produceWaterTimes")
    private Integer produceWaterTimes;
    /** 放水模式 */
    @FieldDetail(name = "放水模式", fieldName = "releaseWaterMode")
    private Integer releaseWaterMode;
    /** 冷/温水电磁阀模式 */
    @FieldDetail(name = "冷/温水电磁阀模式", fieldName = "valveMode")
    private Integer valveMode;

    /** led亮度 */
    @FieldDetail(name = "led亮度", fieldName = "ledBrightness")
    private Integer ledBrightness;
    /** 定时加热 */
    @JsonIgnore
    private Map<String, Object> heatingPlanTime;
    /** 当前温度 */
    @FieldDetail(name = "当前温度", fieldName = "currentTemp")
    private Integer currentTemp;
    /** 制冷信息 */
    private Map<String, Object> coolingInfo;
    /** 声音开关 */
    @FieldDetail(name = "声音开关", fieldName = "sound")
    private Integer sound;
    /** 定时开关机 */
    @JsonIgnore
    private Map<String, Object> powerPlanTime;
    /** 自动息屏时长（0~30min) */
    @FieldDetail(name = "自动息屏时长", fieldName = "screenTimeout")
    private Integer screenTimeout;
    /** 加热信息 */
    @JsonIgnore
    private Map<String, Object> heatingInfo;
    /** 水箱液位状态（0：低 1：中 2：高） */
    @FieldDetail(name = "水箱液位状态（0：低 1：中 2：高）", fieldName = "liquidLevel")
    private Integer liquidLevel;
    /** 压力罐状态（0：未满 1：满水） */
    @FieldDetail(name = "压力罐状态（0：未满 1：满水）", fieldName = "fullWater")
    private Integer fullWater;
    /** TDS偏差校准 */
    @JsonIgnore
    private Map<String, Object> tdsAdjust;
    /** 保温（0：关 1：开） */
    @FieldDetail(name = "保温（0：关 1：开）", fieldName = "keepWarm")
    private Integer keepWarm;


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

    public Integer getReleaseWaterMode() {
        return releaseWaterMode;
    }

    public void setReleaseWaterMode(Integer releaseWaterMode) {
        this.releaseWaterMode = releaseWaterMode;
    }

    public Integer getValveMode() {
        return valveMode;
    }

    public void setValveMode(Integer valveMode) {
        this.valveMode = valveMode;
    }

    public Integer getLedBrightness() {
        return ledBrightness;
    }

    public void setLedBrightness(Integer ledBrightness) {
        this.ledBrightness = ledBrightness;
    }

    public Map<String, Object> getHeatingPlanTime() {
        return heatingPlanTime;
    }

    public void setHeatingPlanTime(Map<String, Object> heatingPlanTime) {
        this.heatingPlanTime = heatingPlanTime;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Map<String, Object> getCoolingInfo() {
        return coolingInfo;
    }

    public void setCoolingInfo(Map<String, Object> coolingInfo) {
        this.coolingInfo = coolingInfo;
    }

    public Integer getSound() {
        return sound;
    }

    public void setSound(Integer sound) {
        this.sound = sound;
    }

    public Map<String, Object> getPowerPlanTime() {
        return powerPlanTime;
    }

    public void setPowerPlanTime(Map<String, Object> powerPlanTime) {
        this.powerPlanTime = powerPlanTime;
    }

    public Integer getScreenTimeout() {
        return screenTimeout;
    }

    public void setScreenTimeout(Integer screenTimeout) {
        this.screenTimeout = screenTimeout;
    }

    public Map<String, Object> getHeatingInfo() {
        return heatingInfo;
    }

    public void setHeatingInfo(Map<String, Object> heatingInfo) {
        this.heatingInfo = heatingInfo;
    }

    public Integer getLiquidLevel() {
        return liquidLevel;
    }

    public void setLiquidLevel(Integer liquidLevel) {
        this.liquidLevel = liquidLevel;
    }

    public Integer getFullWater() {
        return fullWater;
    }

    public void setFullWater(Integer fullWater) {
        this.fullWater = fullWater;
    }

    public Map<String, Object> getTdsAdjust() {
        return tdsAdjust;
    }

    public void setTdsAdjust(Map<String, Object> tdsAdjust) {
        this.tdsAdjust = tdsAdjust;
    }

    public Integer getKeepWarm() {
        return keepWarm;
    }

    public void setKeepWarm(Integer keepWarm) {
        this.keepWarm = keepWarm;
    }
}
