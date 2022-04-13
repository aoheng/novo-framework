package com.novo.commons.support.deviceCenter.vo.jsonVO;

/**
 * @author MickeyChen
 * @date 2020/3/13
 */
public class SendRechargeVO extends SendDeviceCommandVO {

    public String deviceSn;

    public String imeiCode;

    public String rechargeTime;

    private Integer state;

    private Integer resetPpf;

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

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getResetPpf() {
        return resetPpf;
    }

    public void setResetPpf(Integer resetPpf) {
        this.resetPpf = resetPpf;
    }
}
