package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.ByteGprs;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_e_ByteArrayErrorCode;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_e_ByteArraySwitchFlag;
import com.novo.commons.support.deviceCenter.vo.DeviceVO;

import java.util.Date;
import java.util.List;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（华迈云水机E1）
 */
public class D1_e_RealtimeVO extends DeviceVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 开关位 */
    private D1_e_ByteArraySwitchFlag switchFlag;
    /** 滤芯A剩余百分比 */
    private Integer coreR1Percent;
    /** 滤芯B剩余百分比 */
    private Integer coreR2Percent;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 错误代码 */
    private D1_e_ByteArrayErrorCode errorCode;
    /** 事件时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date eventTime;
    /** 事件列表 */
    private List<String> events;
    /** 服务信息 */
    private DeviceServiceInfoVO serviceInfo;
    /** 剩余服务秒数 */
    private Long remainServiceSeconds;
    /**计费模式*/
    private Integer chargeMode;
    /**计量模式总套餐*/
    private Long meteringMode;
    /**计量模式下已使用水量*/
    private Long usedMeteringMode;
    /**计量模式下未使用水量*/
    private Long unUsedMeteringMode;
    /** 设备到期时间 */
    private Date deviceExpireTime;

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public D1_e_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D1_e_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public Integer getCoreR2Percent() { return coreR2Percent; }

    public void setCoreR2Percent(Integer coreR2Percent) { this.coreR2Percent = coreR2Percent; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }

    public D1_e_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D1_e_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }

    public Date getEventTime() { return eventTime; }

    public void setEventTime(Date eventTime) { this.eventTime = eventTime; }

    public List<String> getEvents() { return events; }

    public void setEvents(List<String> events) { this.events = events; }

    public DeviceServiceInfoVO getServiceInfo() { return serviceInfo; }

    public void setServiceInfo(DeviceServiceInfoVO serviceInfo) { this.serviceInfo = serviceInfo; }

    public Long getRemainServiceSeconds() { return remainServiceSeconds; }

    public void setRemainServiceSeconds(Long remainServiceSeconds) { this.remainServiceSeconds = remainServiceSeconds; }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public D1_e_RealtimeVO setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public Long getMeteringMode() {
        return meteringMode;
    }

    public D1_e_RealtimeVO setMeteringMode(Long meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }

    public Long getUsedMeteringMode() {
        return usedMeteringMode;
    }

    public D1_e_RealtimeVO setUsedMeteringMode(Long usedMeteringMode) {
        this.usedMeteringMode = usedMeteringMode;
        return this;
    }

    public Long getUnUsedMeteringMode() {
        return unUsedMeteringMode;
    }

    public D1_e_RealtimeVO setUnUsedMeteringMode(Long unUsedMeteringMode) {
        this.unUsedMeteringMode = unUsedMeteringMode;
        return this;
    }

    public Date getDeviceExpireTime() {
        return deviceExpireTime;
    }

    public D1_e_RealtimeVO setDeviceExpireTime(Date deviceExpireTime) {
        this.deviceExpireTime = deviceExpireTime;
        return this;
    }
}
