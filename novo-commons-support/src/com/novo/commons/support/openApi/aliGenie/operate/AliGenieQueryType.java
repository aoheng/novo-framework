package com.novo.commons.support.openApi.aliGenie.operate;

import com.novo.commons.constant.AliGenieCons;

import java.util.Arrays;

/**
 * 与天猫精灵的参数必须一致
 * @author MickeyChen
 * @date 2020/12/24
 */
public enum AliGenieQueryType {


    QUERY(AliGenieCons.PARAMS_HEADER_QUERY_NAME_QUERY,
            null, AliGenieCons.PARAMS_HEADER_QUERY_NAME_QUERY_RESPONSE),

    /** 剩余洗涤时间 */
    LEFT_TIME(AliGenieCons.PARAMS_HEADER_QUERY_NAME_LEFTTIME,
            "washRemainTime", AliGenieCons.PARAMS_HEADER_QUERY_NAME_LEFTTIME_RESPONSE),



    ;

    private String aliQueryType;
    private String redisKey;
    private String successResponseType;

    AliGenieQueryType(String aliQueryType, String redisKey, String successResponseType) {
        this.aliQueryType = aliQueryType;
        this.redisKey = redisKey;
        this.successResponseType = successResponseType;
    }

    /** 获取阿里操作类的正确相应类型，不存在返回null */
    public static String getResponseType(String aliControlType) {
        for (AliGenieQueryType cons : AliGenieQueryType.values()) {
            if (aliControlType.equals(cons.getAliQueryType())) {
                return cons.getSuccessResponseType();
            }
        }
        return null;
    }

    public String getAliQueryType() {
        return aliQueryType;
    }

    public void setAliQueryType(String aliQueryType) {
        this.aliQueryType = aliQueryType;
    }

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

    public String getSuccessResponseType() {
        return successResponseType;
    }

    public void setSuccessResponseType(String successResponseType) {
        this.successResponseType = successResponseType;
    }
}
