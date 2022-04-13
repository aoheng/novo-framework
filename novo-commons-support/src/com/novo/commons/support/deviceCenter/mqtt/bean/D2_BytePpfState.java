package com.novo.commons.support.deviceCenter.mqtt.bean;

/**
 * @author Aoheng on 2021/01/31.
 * 滤芯状态
 */
public class D2_BytePpfState {
   /* Bit0：0:不缺，1：缺净水芯；
    Bit1：0:不缺，1：缺软水芯；
    Bit2：0:不缺，1：缺净洁芯；
    Bit3：0:不缺，1：缺亮碟芯；*/

    /** 缺少净水芯 */
    private Boolean coreL1;
    /** 缺少软水芯 */
    private Boolean coreL2;
    /** 缺少净洁芯 */
    private Boolean coreL3;
    /** 缺少亮碟芯 */
    private Boolean coreL4;

    public D2_BytePpfState() {}

    public D2_BytePpfState(byte b) {
        int n = 0x01;
        coreL1 = (b & n) != 0;
        n = n << 1;
        coreL2 = (b & n) != 0;
        n = n << 1;
        coreL3 = (b & n) != 0;
        n = n << 1;
        coreL4 = (b & n) != 0;
    }

    @Override
    public String toString() {
        return String.format("{coreL1=%s, coreL2=%s, coreL3=%s, coreL4=%s}", coreL1, coreL2, coreL3, coreL4);
    }

    public Boolean getCoreL1() {
        return coreL1;
    }

    public void setCoreL1(Boolean coreL1) {
        this.coreL1 = coreL1;
    }

    public Boolean getCoreL2() {
        return coreL2;
    }

    public void setCoreL2(Boolean coreL2) {
        this.coreL2 = coreL2;
    }

    public Boolean getCoreL3() {
        return coreL3;
    }

    public void setCoreL3(Boolean coreL3) {
        this.coreL3 = coreL3;
    }

    public Boolean getCoreL4() {
        return coreL4;
    }

    public void setCoreL4(Boolean coreL4) {
        this.coreL4 = coreL4;
    }
}
