package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.io.ByteArrayOutputStream;

/**
 * @author Aoheng on 2020/11/2.
 * 保管功能
 */
public class D2_ByteArrayStorage {

    private Boolean storage = false;
    private Integer mins = 0;
    private Integer hours = 0;

    public byte[] toBytes() {
//        if (getTotalMins() == 0)
//            storage = false;

        if (!storage) {
            mins = 0;
            hours = 0;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(storage ? 0x01 : 0x00);
        baos.write(mins);
        baos.write(hours);

        return baos.toByteArray();
    }

    public D2_ByteArrayStorage() {
    }

    public D2_ByteArrayStorage(byte[] bytes) {
        this.storage = bytes[0] == 0;
        if (!storage) {
            mins = 0;
            hours = 0;
        }
    }

    public Boolean getStorage() {
        return storage;
    }

    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    public Integer getMins() {
        return mins;
    }

    public void setMins(Integer mins) {
        this.mins = mins;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;/**/
    }

    public int getTotalMins() {
        int h = hours == null ? 0 : hours;
        int m = mins == null ? 0 : mins;
        int totalMins = h * 60 + m;
        return totalMins;
    }

    @Override
    public String toString() {
        return "{" +
                "storage=" + storage +
                ", mins=" + mins +
                ", hours=" + hours +
                '}';
    }
}
