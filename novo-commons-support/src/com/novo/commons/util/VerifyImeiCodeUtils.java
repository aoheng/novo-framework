package com.novo.commons.util;


import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 *  校验设备ImeiCode,规则：1.普通15位，2.MAC地址
 *  @Author:kemingheng
 *  @Date:2020/10/15
 */
public class VerifyImeiCodeUtils {


    /**
     * 校验设备ImeiCode
     * 规则：1.普通15位，2.MAC地址
     */
    public static boolean isImeiCode(String imeiCode){
        if (StringUtils.isBlank(imeiCode)) {
            return false;
        }
        //MAC地址正则校验
        if (imeiCode.contains(":")||imeiCode.contains("-")) {
            String regex = "((([a-f0-9]{2}:){5})|(([a-f0-9]{2}-){5}))[a-f0-9]{2}";
            return Pattern.matches(regex, imeiCode);
        }
        //1.普通15位
        if (imeiCode.length()!=15) {
            return false;
        }
        return true;
    }

   /* public static void main(String[] args) {
        String imeiCode="11:22:33:46:55:66";
        System.out.println("imeiCode="+imeiCode+":"+isImeiCode(imeiCode));
    }*/


}
