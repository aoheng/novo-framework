package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯复位（净水器）
 */
public class D1_e_BytePpfReset {

    /** 滤芯A（CC） */
    private Boolean core1 = false;
    /** 滤芯B（RO） */
    private Boolean core2 = false;

    public D1_e_BytePpfReset() {}

    public D1_e_BytePpfReset(byte b) {
        int n = 0x01;
        core1 = (b & n) != 0;
        n = n << 1;
        core2 = (b & n) != 0;
    }

    @Override
    public String toString() {
        return "{" +
                "core1=" + core1 +
                ", core2=" + core2 +
                '}';
    }

    public byte toByte() {
        byte bit0 = (byte) (core1 ? 0x01 : 0x00);
        byte bit1 = (byte) (core2 ? 0x01 << 1 : 0x00);
        return (byte) (bit1 & 0xff | bit0 & 0xff);
    }

    public Boolean getCore1() {
        return core1;
    }

    public void setCore1(Boolean core1) {
        this.core1 = core1;
    }

    public Boolean getCore2() {
        return core2;
    }

    public void setCore2(Boolean core2) {
        this.core2 = core2;
    }
}
