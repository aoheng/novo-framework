package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * 与天猫精灵配置的参数必须一致
 * @author MickeyChen
 * @date 2020/12/19
 */
public enum AliGenieOperateType {

    /** 开机 */
    POWER_ON("开机", "power1"),

    /** 关机 */
    POWER_OFF("关机", "power0"),

    /** 运行 */
    RUNNING("运行", "running1"),

    /** 暂停 */
    PAUSE("暂停", "running0"),

    /** 童锁开 */
    CHILD_LOCK_ON("童锁打开", "childlock1"),

    /** 童锁关 */
    CHILD_LOCK_OFF("童锁关闭", "childlock0"),

    /** 节能洗 */
    MODE_REDUCE("节能", "mode1"),

    /** 强力洗 */
    MODE_FORCE("强力", "mode2"),

    /** 日常洗 */
    MODE_NORMAL("日常", "mode3"),

    /** 快速洗 */
    MODE_QUICK("快速", "mode4"),

    /** 奶瓶洗 */
    MODE_BOTTLE("奶瓶", "mode5"),

    /** 瓜果洗 */
    MODE_FRUIT("瓜果", "mode6"),

    /** 自清洁洗 */
    MODE_OWN("自清洁", "mode7"),

    /** 自定义 */
    MODE_CUSTOM("自定义", "mode8"),

    /** 智能洗 */
    MODE_SMART("智能", "mode9"),

    ;

    private String operateChnType;
    private String operateValType;

    AliGenieOperateType(String operateChnType, String operateValType) {
        this.operateChnType = operateChnType;
        this.operateValType = operateValType;
    }

    /** 是否存在枚举，不存在返回null */
    public static String getExistKey(String operateChnType) {
        for (AliGenieOperateType cons : AliGenieOperateType.values()) {
            if (operateChnType.indexOf(cons.getOperateChnType()) != -1) {
                return cons.getOperateValType();
            }
        }
        return null;
    }

    public String getOperateChnType() {
        return operateChnType;
    }

    public void setOperateChnType(String operateChnType) {
        this.operateChnType = operateChnType;
    }

    public String getOperateValType() {
        return operateValType;
    }

    public void setOperateValType(String operateValType) {
        this.operateValType = operateValType;
    }
}
