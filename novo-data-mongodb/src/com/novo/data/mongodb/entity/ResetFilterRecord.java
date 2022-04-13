package com.novo.data.mongodb.entity;


import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/3/30
 */
public class ResetFilterRecord extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceSn;

    private Integer coreR1;
    private Integer coreR2;
    private Integer coreR3;

    public ResetFilterRecord(String deviceSn, String imeiCode, Integer coreR1, Integer coreR2, Integer coreR3) {
        this.deviceSn = deviceSn;
        this.imeiCode = imeiCode;
        this.coreR1 = coreR1;
        this.coreR2 = coreR2;
        this.coreR3 = coreR3;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    @Override
    public String getImeiCode() {
        return imeiCode;
    }

    @Override
    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getCoreR1() {
        return coreR1;
    }

    public void setCoreR1(Integer coreR1) {
        this.coreR1 = coreR1;
    }

    public Integer getCoreR2() {
        return coreR2;
    }

    public void setCoreR2(Integer coreR2) {
        this.coreR2 = coreR2;
    }

    public Integer getCoreR3() {
        return coreR3;
    }

    public void setCoreR3(Integer coreR3) {
        this.coreR3 = coreR3;
    }
}
