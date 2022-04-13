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
public class D1_d_RealtimeVO extends DeviceVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 开关位 */
    private D1_d_ByteArraySwitchFlag switchFlag;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 错误代码 */
    private D1_d_ByteArrayErrorCode errorCode;
    /** 放水模式（0：单按 1：双按） */
    private Integer releaseWaterMode;
    /** 加热保护时长（小时） */
    private Integer heatingProtectInterval;
    /** 加热温度 */
    private Integer heatingTemp;
    /** 当前水值（流量） */
    private Long currentWaterVal;
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

    public D1_d_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D1_d_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }

    public D1_d_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D1_d_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }

    public Integer getReleaseWaterMode() { return releaseWaterMode; }

    public void setReleaseWaterMode(Integer releaseWaterMode) { this.releaseWaterMode = releaseWaterMode; }

    public Integer getHeatingProtectInterval() { return heatingProtectInterval; }

    public void setHeatingProtectInterval(Integer heatingProtectInterval) { this.heatingProtectInterval = heatingProtectInterval; }

    public Integer getHeatingTemp() { return heatingTemp; }

    public void setHeatingTemp(Integer heatingTemp) { this.heatingTemp = heatingTemp; }

    public Long getCurrentWaterVal() { return currentWaterVal; }

    public void setCurrentWaterVal(Long currentWaterVal) { this.currentWaterVal = currentWaterVal; }

    public Date getEventTime() { return eventTime; }

    public void setEventTime(Date eventTime) { this.eventTime = eventTime; }

    public List<String> getEvents() { return events; }

    public void setEvents(List<String> events) { this.events = events; }

    public DeviceServiceInfoVO getServiceInfo() { return serviceInfo; }

    public void setServiceInfo(DeviceServiceInfoVO serviceInfo) { this.serviceInfo = serviceInfo; }

    public Long getRemainServiceSeconds() { return remainServiceSeconds; }

    public void setRemainServiceSeconds(Long remainServiceSeconds) { this.remainServiceSeconds = remainServiceSeconds; }
}
