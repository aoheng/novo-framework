package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/11/8.
 * gprs信号强度
 */
public class ByteGprs {

    /*无服务信号的数值：99
    一格信号的数值范围：“0-5”
    二格信号的数值范围：“6-11”
    三格信号的数值范围：“12-17”
    四格信号的数值范围：“18-23”
    五格信号的数值范围：“23-31”*/

    /** CSQ原始值 */
    private Integer csq;
    /** 信号强度（0-5） */
    private Integer signal;

    public ByteGprs() {
    }

    public ByteGprs(byte b) {
        this.csq = ByteUtils.toUint8(b);
        resolveSignal(this.csq);
    }

    public ByteGprs(int b) {
        this.csq = b;
        resolveSignal(this.csq);
    }

    /** 信号强度换算 */
    private void resolveSignal(int originalVal) {
        if (originalVal >= 0 && originalVal <= 5)
            signal = 1;
        else if (originalVal >= 6 && originalVal <= 11)
            signal = 2;
        else if (originalVal >= 12 && originalVal <= 17)
            signal = 3;
        else if (originalVal >= 18 && originalVal <= 23)
            signal = 4;
        else if (originalVal >= 23 && originalVal <= 31)
            signal = 5;
        else
            signal = 0;
    }

    @Override
    public String toString() {
        return String.format("{csq=%s, signal=%s}", csq, signal);
    }

    public Integer getCsq() {
        return csq;
    }

    public void setCsq(Integer csq) {
        this.csq = csq;
        resolveSignal(this.csq);
    }

    public Integer getSignal() {
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
    }
}
