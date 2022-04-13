package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.HexUtils;
import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D2_ByteArrayErrorCode {

    private List<String> errors;
    private List<Integer> codes;

    public D2_ByteArrayErrorCode() {}

    public D2_ByteArrayErrorCode(byte[] bytes, boolean isC1) {
        errors = new ArrayList<>();
        codes = new ArrayList<>();

        for (byte b : bytes) {
            codes.add((int) b);
        }

        if (isC1) {//商务洗碗机
            switch (bytes[0]) {
                case 0x00:
                    break;
                case 0x01:
                    errors.add("主洗水位异常");
                    break;
                case 0x02:
                    errors.add("漂洗高水位异常");
                    break;
                case 0x03:
                    errors.add("漂洗低水位异常");
                    break;
                case 0x05:
                    errors.add("加热异常（主洗腔）");
                    break;
                case 0x06:
                    errors.add("加热异常（漂洗腔）");
                    break;
                case 0x07:
                    errors.add("热敏电阻开路/短路（主洗腔）");
                    break;
                case 0x08:
                    errors.add("热敏电阻开路/短路（漂洗腔）");
                    break;
                case 0x09:
                    errors.add("防伪异常");
                    break;
                default:
                    String str = String.format("未定义的错误代码#0（%s）", HexUtils.bytes2HexStr(new byte[]{bytes[0]}));
                    errors.add(str);
                    break;
            }
        } else {
            switch (bytes[0]) {
                case 0x00:
                    break;
                case 0x01:
                    errors.add("溢流报警");
                    break;
                case 0x02:
                    errors.add("进水异常");
                    break;
                case 0x03:
                    errors.add("门电机/门开关故障");
                    break;
                case 0x04:
                    errors.add("耗材更换报警");
                    break;
                case 0x05:
                    errors.add("BLDC故障");
                    break;
                case 0x06:
                    errors.add("加热异常");
                    break;
                case 0x07:
                    errors.add("热敏电阻开路/短路");
                    break;
                case 0x08:
                    errors.add("耗材模块漏水报警");
                    break;
                case 0x09:
                    errors.add("防伪异常");
                    break;
                default:
                    String str = String.format("未定义的错误代码#0（%s）", HexUtils.bytes2HexStr(new byte[]{bytes[0]}));
                    errors.add(str);
                    break;
            }
        }
        switch (bytes[1]) {
            case 0x00:
                break;
            case 0x01:
                errors.add("缺少净水芯");
                break;
            case 0x02:
                errors.add("缺少软水芯");
                break;
            case 0x03:
                errors.add("缺少净洁芯");
                break;
            case 0x04:
                errors.add("缺少亮碟芯");
                break;
            case 0x05:
                errors.add("缺水报警");
                break;
            default:
                String str = String.format("未定义的错误代码#1（%s）", HexUtils.bytes2HexStr(new byte[]{bytes[1]}));
                errors.add(str);
                break;
        }
    }

    @Override
    public String toString() {
        if (errors == null || errors.size() == 0)
            return "NONE";
        else
            return StringUtils.join(errors, "，");
    }

    public List<Integer> getCodes() { return codes; }

    public void setCodes(List<Integer> codes) { this.codes = codes; }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
