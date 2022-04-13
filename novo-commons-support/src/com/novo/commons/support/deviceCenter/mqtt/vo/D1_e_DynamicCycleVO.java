package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.ByteGprs;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_e_ByteArrayErrorCode;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_e_ByteArraySwitchFlag;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（华迈云水机E1）
 */
public class D1_e_DynamicCycleVO {

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
    /** 到期时间 */
    private Date deviceExpireTime;
    /** 错误代码 */
    private D1_e_ByteArrayErrorCode errorCode;

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

    public Date getDeviceExpireTime() {
        return deviceExpireTime;
    }

    public D1_e_DynamicCycleVO setDeviceExpireTime(Date deviceExpireTime) {
        this.deviceExpireTime = deviceExpireTime;
        return this;
    }
}
