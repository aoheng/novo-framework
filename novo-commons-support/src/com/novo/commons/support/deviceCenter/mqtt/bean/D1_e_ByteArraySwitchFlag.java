package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（华迈云水机E1）
 */
public class D1_e_ByteArraySwitchFlag {

    private List<String> events;
    /** 运行状态（0：休眠，1：运行） */
    private Integer running;
    /** 水杯制水（0：停止制水，1：正在制水） */
    private Integer cupProduceWater;
    /** 压力罐制水（0：停止制水，1：正在制水） */
    private Integer tankProduceWater;
    /** 水值到期（0：未到期，1：到期） */
    private Integer expired;

    public D1_e_ByteArraySwitchFlag() {
    }

    public D1_e_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        running = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        cupProduceWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        tankProduceWater = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        expired = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (running != null && running.equals(1))
            events.add("正在运行");
        if (cupProduceWater != null && cupProduceWater.equals(1))
            events.add("水杯制水");
        if (tankProduceWater != null && tankProduceWater.equals(1))
            events.add("压力罐制水");
        if (expired != null && expired.equals(1))
            events.add("到期");
    }

    @Override
    public String toString() {
        return String.format("{running=%s, cupProduceWater=%s, tankProduceWater=%s, expired=%s}", running, cupProduceWater, tankProduceWater, expired);
    }

    public Integer getRunning() { return running; }

    public void setRunning(Integer running) { this.running = running; }

    public Integer getCupProduceWater() { return cupProduceWater; }

    public void setCupProduceWater(Integer cupProduceWater) { this.cupProduceWater = cupProduceWater; }

    public Integer getTankProduceWater() { return tankProduceWater; }

    public void setTankProduceWater(Integer tankProduceWater) { this.tankProduceWater = tankProduceWater; }

    public Integer getExpired() { return expired; }

    public void setExpired(Integer expired) { this.expired = expired; }

    public List<String> getEvents() {
        return events;
    }
}
