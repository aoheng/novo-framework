package com.novo.commons.support.deviceCenter.vo;

import java.io.Serializable;

/**
 * @author MickeyChen
 * @date 2020/12/8
 */
public class ActivationVO implements Serializable {

    public static final Integer ACTIVATION_STATUS_UNACTIVE = 0;
    public static final Integer ACTIVATION_STATUS_ACTIVESUCCESS = 1;
    public static final Integer ACTIVATION_STATUS_ACTIVEFALSE = 2;
    public static final Integer ACTIVATION_RESETPPF_NO = 0;
    public static final Integer ACTIVATION_RESETPPF_YES = 1;
    private static final long serialVersionUID = 1L;
    private Long id;
    private String deviceId;
    private String imeiCode;
    private Integer deviceType;
    private String protocolVer;
    private String dueTime;
    private Long orderLinesId;
    private Integer state;

    private Integer resetPpf;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDeviceId() { return deviceId; }

    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getDeviceType() { return deviceType; }

    public void setDeviceType(Integer deviceType) { this.deviceType = deviceType; }

    public String getProtocolVer() { return protocolVer; }

    public void setProtocolVer(String protocolVer) { this.protocolVer = protocolVer; }

    public String getDueTime() { return dueTime; }

    public void setDueTime(String dueTime) { this.dueTime = dueTime; }

    public Long getOrderLinesId() { return orderLinesId; }

    public void setOrderLinesId(Long orderLinesId) { this.orderLinesId = orderLinesId; }

    public Integer getState() { return state; }

    public void setState(Integer state) { this.state = state; }

    public Integer getResetPpf() {
        return resetPpf;
    }

    public void setResetPpf(Integer resetPpf) {
        this.resetPpf = resetPpf;
    }
}
