package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.commons.support.deviceCenter.mqtt.constant.D2_ByteWashPhase;
import com.novo.commons.support.deviceCenter.mqtt.constant.D2_ByteWorkMode;
import com.novo.framework.core.util.ByteUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 人机事件
 */
public class D2_ByteArrayHumanMachineEvent {

    private List<String> events;

    /**
     * 当前工作模式
     * 0x00 空挡
     * 0x01 节能洗
     * 0x02 强力洗
     * 0x03 日常洗
     * 0x04 快速洗
     * 0x05 奶瓶洗
     * 0x06 果蔬洗
     * 0x07 自清洁
     * 0x08 自定义
     */
    private Integer workMode;

    /**
     * 洗涤阶段
     * 0x00 未洗涤
     * 0x01 预洗
     * 0x02 主洗
     * 0x03 漂洗
     * 0x04 干燥
     * 0x05 结束
     */
    private Integer washPhase;

    public D2_ByteArrayHumanMachineEvent() {}

    public D2_ByteArrayHumanMachineEvent(byte[] bytes) {
        workMode = ByteUtils.toUint8(bytes[0]);
        washPhase = ByteUtils.toUint8(bytes[1]);

        events = new ArrayList<>();
        if (workMode != null && workMode != 0)
            events.add(String.format("工作模式[%s:%s][", workMode, D2_ByteWorkMode.parse(workMode).getComment()));
        if (washPhase != null && washPhase != 0)
            events.add(String.format("洗涤阶段[%s:%s]", washPhase, D2_ByteWashPhase.parse(washPhase).getComment()));
    }

    @Override
    public String toString() {
        return String.format("{workMode=%s, washPhase=%s}", workMode, washPhase);
    }

    public Integer getWorkMode() { return workMode; }

    public void setWorkMode(Integer workMode) { this.workMode = workMode; }

    public Integer getWashPhase() { return washPhase; }

    public void setWashPhase(Integer washPhase) { this.washPhase = washPhase; }

    public List<String> getEvents() {
        return events;
    }
}
