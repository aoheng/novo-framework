package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.ByteGprs;
import com.novo.commons.support.deviceCenter.mqtt.bean.D3_ByteArrayErrorCode;
import com.novo.commons.support.deviceCenter.mqtt.bean.D3_ByteArraySwitchFlag;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（空气净化器）
 */
public class D3_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 开关位 */
    private D3_ByteArraySwitchFlag switchFlag;
    /** 出风模式（0：auto 1：静音 2：强风） */
    private Integer windMode;
    /** PM2.5 */
    private Integer pm25;
    /** 当前温度 */
    private Integer currentTemp;
    /** 湿度 */
    private Integer humidity;
    /** VOC（0：优 1：中 2：差） */
    private Integer voc;
    /** 滤芯A百分比 */
    private Integer coreR1Percent;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 错误代码 */
    private D3_ByteArrayErrorCode errorCode;

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public D3_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D3_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public Integer getWindMode() { return windMode; }

    public void setWindMode(Integer windMode) { this.windMode = windMode; }

    public Integer getPm25() { return pm25; }

    public void setPm25(Integer pm25) { this.pm25 = pm25; }

    public Integer getCurrentTemp() { return currentTemp; }

    public void setCurrentTemp(Integer currentTemp) { this.currentTemp = currentTemp; }

    public Integer getHumidity() { return humidity; }

    public void setHumidity(Integer humidity) { this.humidity = humidity; }

    public Integer getVoc() { return voc; }

    public void setVoc(Integer voc) { this.voc = voc; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }

    public D3_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D3_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }
}
