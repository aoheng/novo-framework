package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;

/**
 * @author Aoheng on 2020/04/09.
 * 温度模式（DN）
 */
public class D1_g_ByteArrayTempMode {

    /**
     * 模式
     * 4：高温可调
     * 3：中温可调
     * 2：固定高温
     * 1：固定中温
     * 0：自由手动
     */
    private Integer mode;
    /** 温度值 */
    private Integer temp;

    public D1_g_ByteArrayTempMode() {}

    public D1_g_ByteArrayTempMode(byte[] bytes) {
        mode = ByteUtils.toUint8(bytes[0]);
        temp = ByteUtils.toUint16(ByteUtils.subByteArray(bytes, 1, 2), ByteOrder.BIG_ENDIAN);
    }

    @Override
    public String toString() {
        return String.format("{mode=%s, temp=%s}", mode, temp);
    }

    public byte[] toBytes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(mode);
        try {
            baos.write(ByteUtils.uint16toBytes(temp, ByteOrder.BIG_ENDIAN));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

    public Integer getMode() { return mode; }

    public void setMode(Integer mode) { this.mode = mode; }

    public Integer getTemp() { return temp; }

    public void setTemp(Integer temp) { this.temp = temp; }
}
