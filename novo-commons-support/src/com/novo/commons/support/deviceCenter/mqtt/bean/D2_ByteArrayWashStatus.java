package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.math.BigDecimal;

/**
 * @author Aoheng on 2021/01/31.
 * 洗涤状态
 */
public class D2_ByteArrayWashStatus {
   /* BYTE[0]:上次洗涤总耗水量小数位（单位L）；
    BYTE[1]:上次洗涤总耗水量整数位（单位L）；
    BYTE[2]:本次洗涤的耗电量小数位（单位千瓦时：KWH）（数据为0时为无效值，无效值时不显示）
    BYTE[3]:本次洗涤的耗电量整数位（单位千瓦时：KWH）（数据为0时为无效值，无效值时不显示）
    BYTE[4]:实际洗涤耗时(单位min) （数据为0时为无效值，无效值时不显示）
    BYTE[5]:本次洗涤进水耗时（单位min）（数据为0时为无效值，无效值时不显示）
    BYTE[6]:上次洗涤结束时的洗碗机内温度（）
    BYTE[7]:预洗浊度判定值（数据为0时为无效值，无效值时不显示）
    BYTE[8]:主洗浊度判定值（数据为0时为无效值）
    BYTE[9]:漂洗结束时的浊度值（数据为0时为无效值）*/

    /** 上次洗涤总耗水量（单位L） */
    private BigDecimal lastWaterConsume;
    /** 本次洗涤的耗电量（单位千瓦时：KWH） */
    private BigDecimal powerConsume;
    /** 本次洗涤耗时（单位min） */
    private Integer timeConsume;
    /** 本次洗涤进水耗时（单位min） */
    private Integer inflowTimeConsume;
    /** 上次洗涤结束时的洗碗机内温度 */
    private Integer lastTempOnEnd;
    /** 预洗浊度判定值 */
    private Integer readyWashTurbidityVal;
    /** 主洗浊度判定值 */
    private Integer mainWashTurbidityVal;
    /** 漂洗结束的浑浊度 */
    private Integer endWashTurbidity;

    public D2_ByteArrayWashStatus() {}

    public D2_ByteArrayWashStatus(byte[] bytes) {
        lastWaterConsume = new BigDecimal(String.format("%s.%s", ByteUtils.toUint8(bytes[1]), ByteUtils.toUint8(bytes[0])));

        powerConsume = new BigDecimal(String.format("%s.%s", ByteUtils.toUint8(bytes[3]), ByteUtils.toUint8(bytes[2])));

        timeConsume = ByteUtils.toUint8(bytes[4]);

        inflowTimeConsume = ByteUtils.toUint8(bytes[5]);

        lastTempOnEnd = ByteUtils.toUint8(bytes[6]);

        readyWashTurbidityVal = ByteUtils.toUint8(bytes[7]);

        mainWashTurbidityVal = ByteUtils.toUint8(bytes[8]);

        endWashTurbidity = ByteUtils.toUint8(bytes[9]);
    }

    @Override
    public String toString() {
        return String.format("{lastWaterConsume=%s, powerConsume=%s, timeConsume=%s, inflowTimeConsume=%s, lastTempOnEnd=%s, readyWashTurbidityVal=%s, mainWashTurbidityVal=%s, endWashTurbidity=%s}", lastWaterConsume, powerConsume, timeConsume, inflowTimeConsume, lastTempOnEnd, readyWashTurbidityVal, mainWashTurbidityVal, endWashTurbidity);
    }

    public BigDecimal getLastWaterConsume() {
        return lastWaterConsume;
    }

    public void setLastWaterConsume(BigDecimal lastWaterConsume) {
        this.lastWaterConsume = lastWaterConsume;
    }

    public BigDecimal getPowerConsume() {
        return powerConsume;
    }

    public void setPowerConsume(BigDecimal powerConsume) {
        this.powerConsume = powerConsume;
    }

    public Integer getTimeConsume() {
        return timeConsume;
    }

    public void setTimeConsume(Integer timeConsume) {
        this.timeConsume = timeConsume;
    }

    public Integer getInflowTimeConsume() {
        return inflowTimeConsume;
    }

    public void setInflowTimeConsume(Integer inflowTimeConsume) {
        this.inflowTimeConsume = inflowTimeConsume;
    }

    public Integer getLastTempOnEnd() {
        return lastTempOnEnd;
    }

    public void setLastTempOnEnd(Integer lastTempOnEnd) {
        this.lastTempOnEnd = lastTempOnEnd;
    }

    public Integer getReadyWashTurbidityVal() {
        return readyWashTurbidityVal;
    }

    public void setReadyWashTurbidityVal(Integer readyWashTurbidityVal) {
        this.readyWashTurbidityVal = readyWashTurbidityVal;
    }

    public Integer getMainWashTurbidityVal() {
        return mainWashTurbidityVal;
    }

    public void setMainWashTurbidityVal(Integer mainWashTurbidityVal) {
        this.mainWashTurbidityVal = mainWashTurbidityVal;
    }

    public Integer getEndWashTurbidity() {
        return endWashTurbidity;
    }

    public void setEndWashTurbidity(Integer endWashTurbidity) {
        this.endWashTurbidity = endWashTurbidity;
    }
}
