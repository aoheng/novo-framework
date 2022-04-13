package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 开关位（洗碗机）
 */
public class D2_ByteArraySwitchFlag {

    private List<String> events;
    /** 电源开关（0：关，1：开） */
    private Integer power;
    /** 保管开关（0：关，1：开） */
    private Integer storage;
    /** 预约开关（0：关，1：开） */
    private Integer booking;
    /** 童锁开关（0：关，1：开） */
    private Integer childLock;
    /** 水龙头图标显示（0：关，1：开） */
    private Integer tap;
    /** 门开关（0：关，1：开） */
    private Integer door;
    /** 启动/暂停 */
    private Integer runningPause;

    public D2_ByteArraySwitchFlag() {
    }

    public D2_ByteArraySwitchFlag(byte[] bytes) {
        byte b = bytes[bytes.length - 1];
        int n = 0x01;
        power = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        storage = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        booking = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        childLock = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        tap = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        door = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        runningPause = (b & n) != 0 ? 1 : 0;

        events = new ArrayList<>();
        if (power != null) {
            if (power.equals(1)) {
                events.add("电源开");
            } else {
                events.add("电源关");
            }
        }
        if (storage != null) {
            if (storage.equals(1)) {
                events.add("保管开");
            } else {
                events.add("保管关");
            }
        }
        if (booking != null) {
            if (booking.equals(1)) {
                events.add("预约开");
            } else {
                events.add("预约关");
            }
        }
        events.add("开");
        if (childLock != null) {
            if (childLock.equals(1)) {
                events.add("童锁开");
            } else {
                events.add("童锁关");
            }
        }
        if (tap != null) {
            if (tap.equals(1)) {
                events.add("龙头图标显示");
            } else {
                events.add("龙头图标关闭");
            }
        }
        if (door != null) {
            if (door.equals(1)) {
                events.add("门开");
            } else {
                events.add("门关");
            }
        }
        if (runningPause != null) {
            if (runningPause.equals(1)) {
                events.add("启动");
            } else {
                events.add("暂停");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("{power=%s, storage=%s, booking=%s, childLock=%s, tap=%s, door=%s, runningPause=%s}", power, storage, booking, childLock, tap, door, runningPause);
    }

    public List<String> getEvents() {
        return events;
    }

    public Integer getPower() { return power; }

    public void setPower(Integer power) { this.power = power; }

    public Integer getStorage() { return storage; }

    public void setStorage(Integer storage) { this.storage = storage; }

    public Integer getBooking() { return booking; }

    public void setBooking(Integer booking) { this.booking = booking; }

    public Integer getChildLock() { return childLock; }

    public void setChildLock(Integer childLock) { this.childLock = childLock; }

    public Integer getTap() { return tap; }

    public void setTap(Integer tap) { this.tap = tap; }

    public Integer getDoor() { return door; }

    public void setDoor(Integer door) { this.door = door; }

    public Integer getRunningPause() { return runningPause; }

    public void setRunningPause(Integer runningPause) { this.runningPause = runningPause; }
}
