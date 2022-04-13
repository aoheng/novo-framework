package com.novo.commons.support.deviceCenter.vo;

import java.util.Date;

/**
 * @author Aoheng on 2020/03/14.
 */
public class RechargeVO {

    private String imeiCode;

    /** 过期时间，如果清水值则设置为30天前 */
    private Date expireTime;

    private boolean clean;

    private Date insertRedisTime;

    private String type;      //充值类型：时间充值（time）,计量充值(number)

    private Long expireNumber;//计量模式总量

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Date getExpireTime() { return expireTime; }

    public void setExpireTime(Date expireTime) { this.expireTime = expireTime; }

    public boolean isClean() { return clean; }

    public void setClean(boolean clean) { this.clean = clean; }

    public Date getInsertRedisTime() {
        return insertRedisTime;
    }

    public void setInsertRedisTime(Date insertRedisTime) {
        this.insertRedisTime = insertRedisTime;
    }

    public String getType() {
        return type;
    }

    public RechargeVO setType(String type) {
        this.type = type;
        return this;
    }

    public Long getExpireNumber() {
        return expireNumber;
    }

    public RechargeVO setExpireNumber(Long expireNumber) {
        this.expireNumber = expireNumber;
        return this;
    }
}
