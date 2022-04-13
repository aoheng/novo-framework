package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 元件组
 */
public class D2_ByteComs {

    /*
      0001为1：主控板
      0010为1：显示板
      0100为1：耗材板
      1000为1：2G模块
    */

    /** 主控板 */
    private Boolean ctrl = false;
    /** 显示板 */
    private Boolean screen = false;
    /** 耗材板 */
    private Boolean consumable = false;
    /** 2G模块 */
    private Boolean gsm = false;

    public D2_ByteComs() {

    }

    public D2_ByteComs(byte b) {
        int n = 0x01;
        ctrl = (b & n) != 0;
        n = n << 1;
        screen = (b & n) != 0;
        n = n << 1;
        consumable = (b & n) != 0;
        n = n << 1;
        gsm = (b & n) != 0;
    }

    @Override
    public String toString() {
        return String.format("{ctrl=%s, screen=%s, consumable=%s, gsm=%s}", ctrl, screen, consumable, gsm);
    }

    public byte toByte() {
        byte bit0 = (byte) (ctrl ? 0x01 : 0x00);
        byte bit1 = (byte) (screen ? 0x01 << 1 : 0x00);
        byte bit2 = (byte) (consumable ? 0x01 << 2 : 0x00);
        byte bit3 = (byte) (gsm ? 0x01 << 3 : 0x00);
        return (byte) (bit3 & 0xff | bit2 & 0xff | bit1 & 0xff | bit0 & 0xff);
    }

    public Boolean getCtrl() { return ctrl; }

    public void setCtrl(Boolean ctrl) { this.ctrl = ctrl; }

    public Boolean getScreen() { return screen; }

    public void setScreen(Boolean screen) { this.screen = screen; }

    public Boolean getConsumable() { return consumable; }

    public void setConsumable(Boolean consumable) { this.consumable = consumable; }

    public Boolean getGsm() { return gsm; }

    public void setGsm(Boolean gsm) { this.gsm = gsm; }
}
