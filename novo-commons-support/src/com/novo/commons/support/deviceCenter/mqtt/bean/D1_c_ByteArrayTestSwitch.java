package com.novo.commons.support.deviceCenter.mqtt.bean;

import java.io.ByteArrayOutputStream;

/**
 * @author Aoheng on 2021/01/31.
 * TDS偏差校准（净水器）
 */
public class D1_c_ByteArrayTestSwitch {

//    0：无效
//    BIT0：启动tds采集
//    BIT1：启动手动排空
//    BIT2：启动热烫测试

    /** tds采集 */
    private Integer tdsCollect = 0;
    /** 手动排空 */
    private Integer handDrain = 0;
    /** 热烫测试 */
    private Integer hotTest = 0;

    public D1_c_ByteArrayTestSwitch() {}

    public D1_c_ByteArrayTestSwitch(Integer testSwitch) {
        if (testSwitch.equals(0))
            this.tdsCollect = 0;
        if (testSwitch.equals(1)) {
            this.tdsCollect = 1;
        }
        if (testSwitch.equals(2)) {
            this.handDrain = 1;
        }
        if (testSwitch.equals(3)) {
            this.hotTest = 1;
        }
    }

    public D1_c_ByteArrayTestSwitch(byte[] bytes) {

    }


    @Override
    public String toString() {
        return String.format("{tdsCollect=%s, handDrain=%s, hotTest=%s}", tdsCollect, handDrain, hotTest);
    }

    public byte[] toBytes() {
        byte bit0 = (byte) (tdsCollect.equals(1) ? 0x01 : 0x00);
        byte bit1 = (byte) (handDrain.equals(1) ? 0x01 << 1 : 0x00);
        byte bit2 = (byte) (hotTest.equals(1) ? 0x01 << 2 : 0x00);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write((byte) (bit2 & 0xff | bit1 & 0xff | bit0 & 0xff));
        return baos.toByteArray();
    }

    public Integer getTdsCollect() {
        return tdsCollect;
    }

    public void setTdsCollect(Integer tdsCollect) {
        this.tdsCollect = tdsCollect;
    }

    public Integer getHandDrain() {
        return handDrain;
    }

    public void setHandDrain(Integer handDrain) {
        this.handDrain = handDrain;
    }

    public Integer getHotTest() {
        return hotTest;
    }

    public void setHotTest(Integer hotTest) {
        this.hotTest = hotTest;
    }
}
