package com.novo.commons.support.openApi.aliGenie.operate;

import com.novo.commons.constant.AliGenieCons;
import com.novo.commons.support.deviceCenter.mqtt.constant.D2_RemoteControlType;

import java.util.Arrays;

/**
 * 与天猫精灵的参数必须一致
 * @author MickeyChen
 * @date 2020/12/21
 */
public enum AliGenieControlType {

    /** 开机 */
    POWER_ON(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_TURNON, null,
            D2_RemoteControlType.POWER_ON, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_TURNON_RESPONSE, null),

    /** 关机 */
    POWER_OFF(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_TURNOFF, null,
            D2_RemoteControlType.POWER_OFF, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_TURNOFF_RESPONSE, false),

    /** 运行 */
    RUNNING(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_PLAY, null,
            D2_RemoteControlType.RUNNING, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_PLAY_RESPONSE, null),
    /** 运行 */
    RUN(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_RUN,
            D2_RemoteControlType.RUNNING, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, null),

    /** 暂停 */
    PAUSE(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_PAUSE, null,
            D2_RemoteControlType.PAUSE, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_PAUSE_RESPONSE, null),

    /** 童锁开 */
    CHILD_LOCK_ON(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_CHILDLOCK,
            D2_RemoteControlType.CHILD_LOCK_ON, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, null),

    /** 童锁关 */
    CHILD_LOCK_OFF(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_CANCELMODE, AliGenieCons.CONTROL_NAME_CANCALMODE_CHILDLOCK,
            D2_RemoteControlType.CHILD_LOCK_OFF, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, null),

    /** 节能洗 */
    MODE_REDUCE(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_ENERGYSAVE,
            D2_RemoteControlType.WORK_MODE_1, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 强力洗 */
    MODE_FORCE(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_POWER,
            D2_RemoteControlType.WORK_MODE_2, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 日常洗 */
    MODE_NORMAL(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_NORMAL,
            D2_RemoteControlType.WORK_MODE_3, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 快速洗 */
    MODE_QUICK(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_QUICK,
            D2_RemoteControlType.WORK_MODE_4, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 奶瓶洗 */
    MODE_BOTTLE(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_BOTTLE,
            D2_RemoteControlType.WORK_MODE_5, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 瓜果洗 */
    MODE_FRUIT(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_FRUIT,
            D2_RemoteControlType.WORK_MODE_6, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 自清洁洗 */
    MODE_OWN(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_OWN,
            D2_RemoteControlType.WORK_MODE_7, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 自定义 */
    MODE_CUSTOM(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_CUSTOM,
            D2_RemoteControlType.WORK_MODE_8, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    /** 智能洗 */
    MODE_SMART(AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE, AliGenieCons.CONTROL_NAME_SETMODE_SMART,
            D2_RemoteControlType.WORK_MODE_9, AliGenieCons.PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE, true),

    ;

    private String aliControlType;
    private String[] valueLikes;
    private String novoControlType;
    private String successResponseType;
    private Boolean modeTypeStatus;

    AliGenieControlType(String aliControlType, String[] valueLikes, String novoControlType,
                        String successResponseType, Boolean modeTypeStatus) {
        this.aliControlType = aliControlType;
        this.valueLikes = valueLikes;
        this.novoControlType = novoControlType;
        this.successResponseType = successResponseType;
        this.modeTypeStatus = modeTypeStatus;
    }

    /** 获取novo操作类的类型，不存在返回null */
    public static String getNovoType(String aliControlType, String valueLike) {
        for (AliGenieControlType cons : AliGenieControlType.values()) {
            if (aliControlType.equals(cons.getAliControlType())) {
                if (cons.getValueLikes() != null) {
                    if (Arrays.asList(cons.getValueLikes()).contains(valueLike)) {
                        return cons.getNovoControlType();
                    }
                } else {
                    return cons.getNovoControlType();
                }
            }
        }
        return null;
    }

    /** 根据novo操作类型，查找是否是操作模式 */
    public static Boolean isModeChange(String novoControlType) {
        for (AliGenieControlType cons : AliGenieControlType.values()) {
            if (novoControlType.equals(cons.getNovoControlType())) {
                return cons.getModeTypeStatus();
            }
        }
        return null;
    }

    /** 获取阿里操作类的正确相应类型，不存在返回null */
    public static String getResponseType(String novoControlType) {
        for (AliGenieControlType cons : AliGenieControlType.values()) {
            if (novoControlType.equals(cons.getAliControlType())) {
                    return cons.getSuccessResponseType();
            }
        }
        return null;
    }

    public String getAliControlType() {
        return aliControlType;
    }

    public void setAliControlType(String aliControlType) {
        this.aliControlType = aliControlType;
    }

    public String[] getValueLikes() {
        return valueLikes;
    }

    public void setValueLikes(String[] valueLikes) {
        this.valueLikes = valueLikes;
    }

    public String getNovoControlType() {
        return novoControlType;
    }

    public void setNovoControlType(String novoControlType) {
        this.novoControlType = novoControlType;
    }

    public String getSuccessResponseType() {
        return successResponseType;
    }

    public void setSuccessResponseType(String successResponseType) {
        this.successResponseType = successResponseType;
    }

    public Boolean getModeTypeStatus() {
        return modeTypeStatus;
    }

    public void setModeTypeStatus(Boolean modeTypeStatus) {
        this.modeTypeStatus = modeTypeStatus;
    }
}
