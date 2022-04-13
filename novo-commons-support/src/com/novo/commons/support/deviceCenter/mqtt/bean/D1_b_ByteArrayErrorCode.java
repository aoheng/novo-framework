package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D1_b_ByteArrayErrorCode {

    private List<String> errors;

    public D1_b_ByteArrayErrorCode() {}

    public D1_b_ByteArrayErrorCode(byte[] bytes) {
        errors = new ArrayList<>();

        byte b = bytes[0];
        int n = 0x01;
        if ((b & n) != 0)
            errors.add("放水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("制水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("加热错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("制冷错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("流量错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("进水错误");


        b = bytes[1];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("超温保护故障");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("T1传感器故障保护");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("T2传感器故障保护");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("温度传感器故障/干烧故障/NTC错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("低水位电极故障/高低水位接反/液位开关异常");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("溢水/漏水故障");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("发热管故障/不加热");

        b = bytes[2];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("时间同步错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RS-485错误/UART通信异常");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("断网时间错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("滤芯堵塞");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("刷卡错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RFID模块异常");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RTC异常");
    }

    @Override
    public String toString() {
        if (errors == null || errors.size() == 0)
            return "NONE";
        else
            return StringUtils.join(errors, "，");
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
