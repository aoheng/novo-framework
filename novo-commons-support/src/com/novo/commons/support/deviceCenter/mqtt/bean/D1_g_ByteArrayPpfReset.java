package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯详细信息（DN）
 */
public class D1_g_ByteArrayPpfReset {

    /** 净水芯剩余容量 */
    private Integer coreR1;

    /*BYTE[0]:净水芯剩余容量
      BYTE[1]:软水芯剩余容量
      BYTE[2]:净洁芯剩余容量
      BYTE[3]:亮碟芯剩余容量*/
    /** 软水芯剩余容量 */
    private Integer coreR2;
    /** 净洁芯剩余容量 */
    private Integer coreR3;
    /** 亮碟芯剩余容量 */
    private Integer coreR4;

    public D1_g_ByteArrayPpfReset() {}

    public D1_g_ByteArrayPpfReset(byte[] bytes) {
        coreR1 = ByteUtils.toUint8(bytes[0]);
        coreR2 = ByteUtils.toUint8(bytes[1]);
        coreR3 = ByteUtils.toUint8(bytes[2]);
        coreR4 = ByteUtils.toUint8(bytes[3]);
    }

    @Override
    public String toString() {
        return String.format("{coreR1=%s, coreR2=%s, coreR3=%s, coreR4=%s}", coreR1, coreR2, coreR3, coreR4);
    }

    public Integer getCoreR1() {
        return coreR1;
    }

    public void setCoreR1(Integer coreR1) {
        this.coreR1 = coreR1;
    }

    public Integer getCoreR2() {
        return coreR2;
    }

    public void setCoreR2(Integer coreR2) {
        this.coreR2 = coreR2;
    }

    public Integer getCoreR3() {
        return coreR3;
    }

    public void setCoreR3(Integer coreR3) {
        this.coreR3 = coreR3;
    }

    public Integer getCoreR4() {
        return coreR4;
    }

    public void setCoreR4(Integer coreR4) {
        this.coreR4 = coreR4;
    }
}
