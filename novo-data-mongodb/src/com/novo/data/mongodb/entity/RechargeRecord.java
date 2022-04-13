package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author MickeyChen
 * @date 2020/3/29
 */
public class RechargeRecord extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceSn;
    private String actionType;
    private Date expireTime;

    private Long rechargeId;
    private String type;      //充值类型：时间充值（time）,计量充值(number)
    private Long expireNumber;//计量模式总量


    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Long getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(Long rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getType() {
        return type;
    }

    public RechargeRecord setType(String type) {
        this.type = type;
        return this;
    }

    public Long getExpireNumber() {
        return expireNumber;
    }

    public RechargeRecord setExpireNumber(Long expireNumber) {
        this.expireNumber = expireNumber;
        return this;
    }
}
