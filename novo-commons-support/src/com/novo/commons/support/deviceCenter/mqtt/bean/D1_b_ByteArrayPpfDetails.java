package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.nio.ByteOrder;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯详细信息（净水器）
 */
public class D1_b_ByteArrayPpfDetails {

    /** 滤芯A剩余容量（公升） */
    private Integer coreR1;
    /** 滤芯B剩余容量（公升） */
    private Integer coreR2;
    /** 滤芯C剩余容量（公升） */
    private Integer coreR3;
    /** 滤芯D剩余容量（公升） */
    private Integer coreR4;
    /** 滤芯E剩余容量（公升） */
    private Integer coreR5;
    /** 滤芯A剩余容量（百分比） */
    private Integer coreR1Percent;
    /** 滤芯B剩余容量（百分比） */
    private Integer coreR2Percent;
    /** 滤芯C剩余容量（百分比） */
    private Integer coreR3Percent;
    /** 滤芯D剩余容量（百分比） */
    private Integer coreR4Percent;
    /** 滤芯E剩余容量（百分比） */
    private Integer coreR5Percent;
    /** 滤芯A剩余时间（秒） */
    private Long coreR1Lifetime;
    /** 滤芯B剩余时间（秒） */
    private Long coreR2Lifetime;
    /** 滤芯C剩余时间（秒） */
    private Long coreR3Lifetime;
    /** 滤芯4剩余时间（秒） */
    private Long coreR4Lifetime;
    /** 滤芯5剩余时间（秒） */
    private Long coreR5Lifetime;

    public D1_b_ByteArrayPpfDetails() {}

    public D1_b_ByteArrayPpfDetails(byte[] bytes) {
        coreR1 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 0, 2), ByteOrder.BIG_ENDIAN);
        coreR2 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 2, 2), ByteOrder.BIG_ENDIAN);
        coreR3 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 4, 2), ByteOrder.BIG_ENDIAN);
        coreR4 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 6, 2), ByteOrder.BIG_ENDIAN);
        coreR5 = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 8, 2), ByteOrder.BIG_ENDIAN);

        coreR1Percent = ByteUtils.toUint8(bytes[10]);
        coreR2Percent = ByteUtils.toUint8(bytes[11]);
        coreR3Percent = ByteUtils.toUint8(bytes[12]);
        coreR4Percent = ByteUtils.toUint8(bytes[13]);
        coreR5Percent = ByteUtils.toUint8(bytes[14]);

        coreR1Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 15, 4), ByteOrder.BIG_ENDIAN);
        coreR2Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 19, 4), ByteOrder.BIG_ENDIAN);
        coreR3Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 23, 4), ByteOrder.BIG_ENDIAN);
        coreR4Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 27, 4), ByteOrder.BIG_ENDIAN);
        coreR5Lifetime = ByteUtils.toUint32(ByteUtils.subByteArray(bytes, 31, 4), ByteOrder.BIG_ENDIAN);
    }

    @Override
    public String toString() {
        return String.format("{coreR1=%s, coreR2=%s, coreR3=%s, coreR4=%s, coreR5=%s, coreR1Percent=%s, coreR2Percent=%s, coreR3Percent=%s, coreR4Percent=%s, coreR5Percent=%s, coreR1Lifetime=%s, coreR2Lifetime=%s, coreR3Lifetime=%s, coreR4Lifetime=%s, coreR5Lifetime=%s}", coreR1, coreR2, coreR3, coreR4, coreR5, coreR1Percent, coreR2Percent, coreR3Percent, coreR4Percent, coreR5Percent, coreR1Lifetime, coreR2Lifetime, coreR3Lifetime, coreR4Lifetime, coreR5Lifetime);
    }

    public Integer getCoreR1() { return coreR1; }

    public void setCoreR1(Integer coreR1) { this.coreR1 = coreR1; }

    public Integer getCoreR2() { return coreR2; }

    public void setCoreR2(Integer coreR2) { this.coreR2 = coreR2; }

    public Integer getCoreR3() { return coreR3; }

    public void setCoreR3(Integer coreR3) { this.coreR3 = coreR3; }

    public Integer getCoreR4() { return coreR4; }

    public void setCoreR4(Integer coreR4) { this.coreR4 = coreR4; }

    public Integer getCoreR5() { return coreR5; }

    public void setCoreR5(Integer coreR5) { this.coreR5 = coreR5; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public Integer getCoreR2Percent() { return coreR2Percent; }

    public void setCoreR2Percent(Integer coreR2Percent) { this.coreR2Percent = coreR2Percent; }

    public Integer getCoreR3Percent() { return coreR3Percent; }

    public void setCoreR3Percent(Integer coreR3Percent) { this.coreR3Percent = coreR3Percent; }

    public Integer getCoreR4Percent() { return coreR4Percent; }

    public void setCoreR4Percent(Integer coreR4Percent) { this.coreR4Percent = coreR4Percent; }

    public Integer getCoreR5Percent() { return coreR5Percent; }

    public void setCoreR5Percent(Integer coreR5Percent) { this.coreR5Percent = coreR5Percent; }

    public Long getCoreR1Lifetime() { return coreR1Lifetime; }

    public void setCoreR1Lifetime(Long coreR1Lifetime) { this.coreR1Lifetime = coreR1Lifetime; }

    public Long getCoreR2Lifetime() { return coreR2Lifetime; }

    public void setCoreR2Lifetime(Long coreR2Lifetime) { this.coreR2Lifetime = coreR2Lifetime; }

    public Long getCoreR3Lifetime() { return coreR3Lifetime; }

    public void setCoreR3Lifetime(Long coreR3Lifetime) { this.coreR3Lifetime = coreR3Lifetime; }

    public Long getCoreR4Lifetime() { return coreR4Lifetime; }

    public void setCoreR4Lifetime(Long coreR4Lifetime) { this.coreR4Lifetime = coreR4Lifetime; }

    public Long getCoreR5Lifetime() { return coreR5Lifetime; }

    public void setCoreR5Lifetime(Long coreR5Lifetime) { this.coreR5Lifetime = coreR5Lifetime; }
}
