package com.novo.commons.support.deviceCenter.constans;

/**
 * 与天猫精灵配置的参数必须一致
 * @author MickeyChen
 * @date 2020/12/19
 */
public enum WashdisherModeType {


    /** 童锁开 */
    CHILD_LOCK_ON("childlock1", "童锁开"),

    /** 童锁关 */
    CHILD_LOCK_OFF("childlock0", "童锁关"),

    /** 节能洗 */
    MODE_REDUCE("mode1", "节能模式"),

    /** 强力洗 */
    MODE_FORCE("mode2", "强力模式"),

    /** 日常洗 */
    MODE_NORMAL("mode3", "日常模式"),

    /** 快速洗 */
    MODE_QUICK("mode4", "快速模式"),

    /** 奶瓶洗 */
    MODE_BOTTLE("mode5", "奶瓶模式"),

    /** 瓜果洗 */
    MODE_FRUIT("mode6", "瓜果模式"),

    /** 自清洁洗 */
    MODE_OWN("mode7", "自清洁模式"),

    /** 自定义 */
    MODE_CUSTOM("mode8", "自定义模式"),

    /** 智能洗 */
    MODE_SMART("mode9", "智能模式"),

    ;

    private String modeType;
    private String modeValType;

    WashdisherModeType(String modeType, String modeValType) {
        this.modeType = modeType;
        this.modeValType = modeValType;
    }

    public static String getModeValName(String modeType) {
        for (WashdisherModeType cons : WashdisherModeType.values()) {
            if (modeType.equals(cons.getModeType())) {
                return cons.getModeValType();
            }
        }
        return null;
    }

    public String getModeType() {
        return modeType;
    }

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    public String getModeValType() {
        return modeValType;
    }

    public void setModeValType(String modeValType) {
        this.modeValType = modeValType;
    }
}
