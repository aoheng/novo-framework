package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.io.ByteArrayOutputStream;

/**
 * @author Aoheng on 2021/01/31.
 * TDS偏差校准（净水器）
 */
public class D1_c_ByteArrayTdsAdjust {
//    BYTE[0]:Tds调整使能及调整方向
//    Bit0：Tds1是否校准，0:不使能，1:使能
//    Bit1：Tds2是否校准，0:不使能，1:使能
//    Bit2：Tds1校准方向，0:反向，1:正向
//    Bit3：Tds2校准方向，0:反向，1:正向
//    BYTE[1]:Tds1调整百分比
//    BYTE[2]:Tds2调整百分比

    /** Tds1是否校准 */
    private Integer enableTd1;
    /** Tds2是否校准 */
    private Integer enableTd2;
    /** Tds1校准方向（0：反向 1：正向） */
    private Integer directionTd1;
    /** Tds2校准方向（0：反向 1：正向） */
    private Integer directionTd2;
    /** Tds1调整百分比 */
    private Integer td1;
    /** Tds2调整百分比 */
    private Integer td2;

    public D1_c_ByteArrayTdsAdjust() {}

    public D1_c_ByteArrayTdsAdjust(byte[] bytes) {
        byte b = bytes[0];
        int n = 0x01;
        enableTd1 = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        enableTd2 = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        directionTd1 = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        directionTd2 = (b & n) != 0 ? 1 : 0;
        td1 = ByteUtils.toUint8(bytes[1]);
        td2 = ByteUtils.toUint8(bytes[2]);
    }

    @Override
    public String toString() {
        return String.format("{enableTd1=%s, enableTd2=%s, directionTd1=%s, directionTd2=%s, td1=%s, td2=%s}", enableTd1, enableTd2, directionTd1, directionTd2, td1, td2);
    }

    public byte[] toBytes() {
        byte bit0 = (byte) (enableTd1.equals(1) ? 0x01 : 0x00);
        byte bit1 = (byte) (enableTd2.equals(1) ? 0x01 << 1 : 0x00);
        byte bit2 = (byte) (directionTd1.equals(1) ? 0x01 << 2 : 0x00);
        byte bit3 = (byte) (directionTd2.equals(1) ? 0x01 << 3 : 0x00);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write((byte) (bit3 & 0xff | bit2 & 0xff | bit1 & 0xff | bit0 & 0xff));
        baos.write(td1);
        baos.write(td2);

        return baos.toByteArray();
    }

    public Integer getEnableTd1() { return enableTd1; }

    public void setEnableTd1(Integer enableTd1) { this.enableTd1 = enableTd1; }

    public Integer getEnableTd2() { return enableTd2; }

    public void setEnableTd2(Integer enableTd2) { this.enableTd2 = enableTd2; }

    public Integer getDirectionTd1() { return directionTd1; }

    public void setDirectionTd1(Integer directionTd1) { this.directionTd1 = directionTd1; }

    public Integer getDirectionTd2() { return directionTd2; }

    public void setDirectionTd2(Integer directionTd2) { this.directionTd2 = directionTd2; }

    public Integer getTd1() { return td1; }

    public void setTd1(Integer td1) { this.td1 = td1; }

    public Integer getTd2() { return td2; }

    public void setTd2(Integer td2) { this.td2 = td2; }
}
