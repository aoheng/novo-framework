package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯复位（洗碗机）
 */
public class D2_BytePpfReset {

   /*
    0001： 净水芯
    0010： 软水芯
    0100： 净洁芯
    1000： 亮碟芯
    */

    /** 净水芯 */
    private Boolean core1 = false;
    /** 软水芯 */
    private Boolean core2 = false;
    /** 净洁芯 */
    private Boolean core3 = false;
    /** 亮碟芯 */
    private Boolean core4 = false;

    public D2_BytePpfReset() {}

    public D2_BytePpfReset(byte b) {
        int n = 0x01;
        core1 = (b & n) != 0;
        n = n << 1;
        core2 = (b & n) != 0;
        n = n << 1;
        core3 = (b & n) != 0;
        n = n << 1;
        core4 = (b & n) != 0;
    }

    @Override
    public String toString() {
        return "{" +
                "core1=" + core1 +
                ", core2=" + core2 +
                ", core3=" + core3 +
                ", core4=" + core4 +
                '}';
    }

    public byte toByte() {
        byte bit0 = (byte) (core1 ? 0x01 : 0x00);
        byte bit1 = (byte) (core2 ? 0x01 << 1 : 0x00);
        byte bit2 = (byte) (core3 ? 0x01 << 2 : 0x00);
        byte bit3 = (byte) (core4 ? 0x01 << 3 : 0x00);
        return (byte) (bit3 & 0xff | bit2 & 0xff | bit1 & 0xff | bit0 & 0xff);
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

    public Boolean getCore3() {
        return core3;
    }

    public void setCore3(Boolean core3) {
        this.core3 = core3;
    }

    public Boolean getCore4() {
        return core4;
    }

    public void setCore4(Boolean core4) {
        this.core4 = core4;
    }
}
