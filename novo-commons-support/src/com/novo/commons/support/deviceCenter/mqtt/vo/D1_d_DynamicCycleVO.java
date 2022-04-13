package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（A6G）
 */
public class D1_d_DynamicCycleVO {

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
}
