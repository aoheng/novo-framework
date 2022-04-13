package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;
import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aoheng on 2020/10/26.
 * Report主题：动态事件
 */
public class D2_DynamicEventVO {

    private List<String> events;
    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 事件类型 */
    private ByteEventType eventType;
    /** 硬件事件位 */
    private D2_ByteArrayHardwareEvent hardwareEvent;
    /** 人机事件位 */
    private D2_ByteArrayHumanMachineEvent humanMachineEvent;
    /** 开关位 */
    private D2_ByteArraySwitchFlag switchFlag;
    /** 错误代码 */
    private D2_ByteArrayErrorCode errorCode;

    public List<String> getEvents() {
        events = new ArrayList<>();
        if (eventType != null) {
            if (eventType.getHardwareEvent() != null && eventType.getHardwareEvent().equals(1))
                events.add("硬件：" + StringUtils.join(hardwareEvent.getEvents(), ","));
            if (eventType.getHumanMachineEvent() != null && eventType.getHumanMachineEvent().equals(1))
                events.add("人机：" + StringUtils.join(humanMachineEvent.getEvents(), ","));
            if (eventType.getSwitchEvent() != null && eventType.getSwitchEvent().equals(1))
                events.add("开关位：" + StringUtils.join(switchFlag.getEvents(), ","));
            if (eventType.getErrorEvent() != null && eventType.getErrorEvent().equals(1))
                events.add("错误：" + StringUtils.join(errorCode.getErrors(), ","));
        }
        return events;
    }

    public void setEvents(List<String> events) { this.events = events; }

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public ByteEventType getEventType() { return eventType; }

    public void setEventType(ByteEventType eventType) { this.eventType = eventType; }

    public D2_ByteArrayHardwareEvent getHardwareEvent() { return hardwareEvent; }

    public void setHardwareEvent(D2_ByteArrayHardwareEvent hardwareEvent) { this.hardwareEvent = hardwareEvent; }

    public D2_ByteArrayHumanMachineEvent getHumanMachineEvent() { return humanMachineEvent; }

    public void setHumanMachineEvent(D2_ByteArrayHumanMachineEvent humanMachineEvent) { this.humanMachineEvent = humanMachineEvent; }

    public D2_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D2_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public D2_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D2_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }
}