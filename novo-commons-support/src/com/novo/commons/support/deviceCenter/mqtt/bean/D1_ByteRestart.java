package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 元件组
 */
public class D1_ByteRestart {
    /*
      0001为1：通讯板
      0010为1：主控板
    */

    /** 通讯板 */
    private Boolean gsm = false;
    /** 主控板 */
    private Boolean ctrl = false;
    public D1_ByteRestart() {

    }


    public D1_ByteRestart(byte b) {
        int n = 0x01;
        gsm = (b & n) != 0;
        n = n << 1;
        ctrl = (b & n) != 0;
    }

    @Override
    public String toString() {
        return String.format("{gsm=%s, ctrl=%s}", gsm, ctrl);
    }

    public byte toByte() {
        byte bit0 = (byte) (gsm ? 0x01 : 0x00);
        byte bit1 = (byte) (ctrl ? 0x01 << 1 : 0x00);
        return (byte) (bit1 & 0xff | bit0 & 0xff);
    }

    public Boolean getCtrl() { return ctrl; }

    public void setCtrl(Boolean ctrl) { this.ctrl = ctrl; }

    public Boolean getGsm() { return gsm; }

    public void setGsm(Boolean gsm) { this.gsm = gsm; }
}
