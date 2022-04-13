package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 事件类型
 */
public class ByteEventType {

    /** 开关触发事件（0：无，1：有） */
    private Integer switchEvent;
    /** 硬件触发事件（0：无，1：有） */
    private Integer hardwareEvent;
    /** 人机触发事件（0：无，1：有） */
    private Integer humanMachineEvent;
    /** 错误事件（0：无，1：有） */
    private Integer errorEvent;

    public ByteEventType() {
    }

    public ByteEventType(byte b) {
        int n = 0x01;
        switchEvent = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        hardwareEvent = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        humanMachineEvent = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        errorEvent = (b & n) != 0 ? 1 : 0;
    }

    @Override
    public String toString() {
        return String.format("{switchEvent=%s, hardwareEvent=%s, humanMachineEvent=%s, errorEvent=%s}", switchEvent, hardwareEvent, humanMachineEvent, errorEvent);
    }

    public Integer getSwitchEvent() { return switchEvent; }

    public void setSwitchEvent(Integer switchEvent) { this.switchEvent = switchEvent; }

    public Integer getHardwareEvent() { return hardwareEvent; }

    public void setHardwareEvent(Integer hardwareEvent) { this.hardwareEvent = hardwareEvent; }

    public Integer getHumanMachineEvent() { return humanMachineEvent; }

    public void setHumanMachineEvent(Integer humanMachineEvent) { this.humanMachineEvent = humanMachineEvent; }

    public Integer getErrorEvent() { return errorEvent; }

    public void setErrorEvent(Integer errorEvent) { this.errorEvent = errorEvent; }
}
