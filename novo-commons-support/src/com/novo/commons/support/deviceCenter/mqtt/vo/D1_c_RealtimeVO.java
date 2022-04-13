package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;
import com.novo.commons.support.deviceCenter.vo.DeviceVO;

import java.util.Date;
import java.util.List;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（1.5代机）
 */
public class D1_c_RealtimeVO extends DeviceVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 开关位 */
    private D1_c_ByteArraySwitchFlag switchFlag;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** TD1 */
    private Integer td1;
    /** TD2 */
    private Integer td2;
    /** 节水比率 */
    private Integer waterSavingRate;
    /** 错误代码 */
    private D1_c_ByteArrayErrorCode errorCode;
    /** 总断网时长 */
    private Long disconnectInterval;
    /** 制水次数 */
    private Integer produceWaterTimes;
    /** 放水模式 */
    private Integer releaseWaterMode;
    /** 冷/温水电磁阀模式 */
    private Integer valveMode;
    /** 杀菌 */
    private D1_ByteArraySterilization sterilization;
    /** led亮度 */
    private Integer ledBrightness;
    /** 定时加热 */
    private ByteArrayPlanTime heatingPlanTime;
    /** 当前温度 */
    private Integer currentTemp;
    /** 制冷信息 */
    private D1_c_ByteArrayCoolingInfo coolingInfo;
    /** 声音开关 */
    private Integer sound;
    /** 定时开关机 */
    private ByteArrayPlanTime powerPlanTime;
    /** 自动息屏时长（0~30min) */
    private Integer screenTimeout;
    /** 加热信息 */
    private D1_c_ByteArrayHeatingInfo heatingInfo;
    /** 水箱液位状态（0：低 1：中 2：高） */
    private Integer liquidLevel;
    /** 压力罐状态（0：未满 1：满水） */
    private Integer fullWater;
    /** TDS偏差校准 */
    private D1_c_ByteArrayTdsAdjust tdsAdjust;
    /** 保温（0：关 1：开） */
    private Integer keepWarm;
    /** 事件时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date eventTime;
    /** 事件列表 */
    private List<String> events;
    /** 服务信息 */
    private DeviceServiceInfoVO serviceInfo;
    /** 剩余服务秒数 */
    private Long remainServiceSeconds;

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public D1_c_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D1_c_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }

    public Integer getTd1() { return td1; }

    public void setTd1(Integer td1) { this.td1 = td1; }

    public Integer getTd2() { return td2; }

    public void setTd2(Integer td2) { this.td2 = td2; }

    public Integer getWaterSavingRate() { return waterSavingRate; }

    public void setWaterSavingRate(Integer waterSavingRate) { this.waterSavingRate = waterSavingRate; }

    public D1_c_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D1_c_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }

    public Long getDisconnectInterval() { return disconnectInterval; }

    public void setDisconnectInterval(Long disconnectInterval) { this.disconnectInterval = disconnectInterval; }

    public Integer getProduceWaterTimes() { return produceWaterTimes; }

    public void setProduceWaterTimes(Integer produceWaterTimes) { this.produceWaterTimes = produceWaterTimes; }

    public Integer getReleaseWaterMode() { return releaseWaterMode; }

    public void setReleaseWaterMode(Integer releaseWaterMode) { this.releaseWaterMode = releaseWaterMode; }

    public Integer getValveMode() { return valveMode; }

    public void setValveMode(Integer valveMode) { this.valveMode = valveMode; }

    public D1_ByteArraySterilization getSterilization() { return sterilization; }

    public void setSterilization(D1_ByteArraySterilization sterilization) { this.sterilization = sterilization; }

    public Integer getLedBrightness() { return ledBrightness; }

    public void setLedBrightness(Integer ledBrightness) { this.ledBrightness = ledBrightness; }

    public ByteArrayPlanTime getHeatingPlanTime() { return heatingPlanTime; }

    public void setHeatingPlanTime(ByteArrayPlanTime heatingPlanTime) { this.heatingPlanTime = heatingPlanTime; }

    public Integer getCurrentTemp() { return currentTemp; }

    public void setCurrentTemp(Integer currentTemp) { this.currentTemp = currentTemp; }

    public D1_c_ByteArrayCoolingInfo getCoolingInfo() { return coolingInfo; }

    public void setCoolingInfo(D1_c_ByteArrayCoolingInfo coolingInfo) { this.coolingInfo = coolingInfo; }

    public Integer getSound() { return sound; }

    public void setSound(Integer sound) { this.sound = sound; }

    public ByteArrayPlanTime getPowerPlanTime() { return powerPlanTime; }

    public void setPowerPlanTime(ByteArrayPlanTime powerPlanTime) { this.powerPlanTime = powerPlanTime; }

    public Integer getScreenTimeout() { return screenTimeout; }

    public void setScreenTimeout(Integer screenTimeout) { this.screenTimeout = screenTimeout; }

    public D1_c_ByteArrayHeatingInfo getHeatingInfo() { return heatingInfo; }

    public void setHeatingInfo(D1_c_ByteArrayHeatingInfo heatingInfo) { this.heatingInfo = heatingInfo; }

    public Integer getLiquidLevel() { return liquidLevel; }

    public void setLiquidLevel(Integer liquidLevel) { this.liquidLevel = liquidLevel; }

    public Integer getFullWater() { return fullWater; }

    public void setFullWater(Integer fullWater) { this.fullWater = fullWater; }

    public D1_c_ByteArrayTdsAdjust getTdsAdjust() { return tdsAdjust; }

    public void setTdsAdjust(D1_c_ByteArrayTdsAdjust tdsAdjust) { this.tdsAdjust = tdsAdjust; }

    public Integer getKeepWarm() { return keepWarm; }

    public void setKeepWarm(Integer keepWarm) { this.keepWarm = keepWarm; }

    public Long getRemainServiceSeconds() { return remainServiceSeconds; }

    public void setRemainServiceSeconds(Long remainServiceSeconds) { this.remainServiceSeconds = remainServiceSeconds; }

    public Date getEventTime() { return eventTime; }

    public void setEventTime(Date eventTime) { this.eventTime = eventTime; }

    public List<String> getEvents() { return events; }

    public void setEvents(List<String> events) { this.events = events; }

    public DeviceServiceInfoVO getServiceInfo() { return serviceInfo; }

    public void setServiceInfo(DeviceServiceInfoVO serviceInfo) { this.serviceInfo = serviceInfo; }
}
