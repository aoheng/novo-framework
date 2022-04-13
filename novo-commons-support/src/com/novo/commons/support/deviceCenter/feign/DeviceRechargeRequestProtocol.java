package com.novo.commons.support.deviceCenter.feign;

import java.io.Serializable;
import java.util.Date;

/**
 * @author BinksRao on 2020/8/17
 */
public class DeviceRechargeRequestProtocol implements Serializable {
    private static final long serialVersionUID = 1L;

    private String deviceSn;
    private String imeiCode;
    private Date rechargeTime;
    private String type;      //充值类型：时间充值（time）,计量充值(number)
    private Long expireNumber;//计量模式总量

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getType() {
        return type;
    }

    public DeviceRechargeRequestProtocol setType(String type) {
        this.type = type;
        return this;
    }

    public Long getExpireNumber() {
        return expireNumber;
    }

    public DeviceRechargeRequestProtocol setExpireNumber(Long expireNumber) {
        this.expireNumber = expireNumber;
        return this;
    }
}
