package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.nio.ByteOrder;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯详细信息（净水器）
 */
public class D1_ByteArrayPpfDetails {

    /*BYTE[0-3]:滤芯A剩余容量（公升）
    BYTE[4-7]:滤芯B剩余容量（公升）
    BYTE[5-8]:滤芯C剩余容量（公升）
    BYTE[9]:滤芯A百分比
    BYTE[10]:滤芯B百分比
    BYTE[11]:滤芯C百分比
    BYTE[12-15]:滤芯A剩余时间
    BYTE[16-19]:滤芯B剩余时间
    BYTE[20-23]:滤芯C剩余时间*/

    /** 滤芯A剩余容量（公升） */
    private Integer coreR1;
    /** 滤芯B剩余容量（公升） */
    private Integer coreR2;
    /** 滤芯C剩余容量（公升） */
    private Integer coreR3;
    /** 滤芯A剩余容量（百分比） */
    private Integer coreR1Percent;
    /** 滤芯B剩余容量（百分比） */
    private Integer coreR2Percent;
    /** 滤芯C剩余容量（百分比） */
    private Integer coreR3Percent;
    /** 滤芯A剩余时间（秒） */
    private Long coreR1Lifetime;
    /** 滤芯B剩余时间（秒） */
    private Long coreR2Lifetime;
    /** 滤芯C剩余时间（秒） */
    private Long coreR3Lifetime;

    public D1_ByteArrayPpfDetails() {}

    public D1_ByteArrayPpfDetails(byte[] bytes) {
        coreR1 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 0, 2), ByteOrder.BIG_ENDIAN);
        coreR2 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 2, 2), ByteOrder.BIG_ENDIAN);
        coreR3 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 4, 2), ByteOrder.BIG_ENDIAN);

        coreR1Percent = ByteUtils.toUint8(bytes[6]);
        coreR2Percent = ByteUtils.toUint8(bytes[7]);
        coreR3Percent = ByteUtils.toUint8(bytes[8]);

        coreR1Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 9, 4), ByteOrder.BIG_ENDIAN);
        coreR2Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 13, 4), ByteOrder.BIG_ENDIAN);
        coreR3Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 17, 4), ByteOrder.BIG_ENDIAN);
    }

    @Override
    public String toString() {
        return String.format("{coreR1=%s, coreR2=%s, coreR3=%s, coreR1Percent=%s, coreR2Percent=%s, coreR3Percent=%s, coreR1Lifetime=%s, coreR2Lifetime=%s, coreR3Lifetime=%s}", coreR1, coreR2, coreR3, coreR1Percent, coreR2Percent, coreR3Percent, coreR1Lifetime, coreR2Lifetime, coreR3Lifetime);
    }

    public Integer getCoreR1() { return coreR1; }

    public void setCoreR1(Integer coreR1) { this.coreR1 = coreR1; }

    public Integer getCoreR2() { return coreR2; }

    public void setCoreR2(Integer coreR2) { this.coreR2 = coreR2; }

    public Integer getCoreR3() { return coreR3; }

    public void setCoreR3(Integer coreR3) { this.coreR3 = coreR3; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public Integer getCoreR2Percent() { return coreR2Percent; }

    public void setCoreR2Percent(Integer coreR2Percent) { this.coreR2Percent = coreR2Percent; }

    public Integer getCoreR3Percent() { return coreR3Percent; }

    public void setCoreR3Percent(Integer coreR3Percent) { this.coreR3Percent = coreR3Percent; }

    public Long getCoreR1Lifetime() { return coreR1Lifetime; }

    public void setCoreR1Lifetime(Long coreR1Lifetime) { this.coreR1Lifetime = coreR1Lifetime; }

    public Long getCoreR2Lifetime() { return coreR2Lifetime; }

    public void setCoreR2Lifetime(Long coreR2Lifetime) { this.coreR2Lifetime = coreR2Lifetime; }

    public Long getCoreR3Lifetime() { return coreR3Lifetime; }

    public void setCoreR3Lifetime(Long coreR3Lifetime) { this.coreR3Lifetime = coreR3Lifetime; }
}
