package com.novo.commons.enums;

/**
 * 充值类型：时间充值（time）,计量数量充值(number)
 * @Author:kemingheng
 * @Date:2020/8/7
 */
public enum RechargeType {

    TIME("时间充值","time"),
    NUMBER("壶数充值","number");

    public static final String TYPE_TIME = "time";
    public static final String TYPE_NUMBER = "number";

    // 成员变量
    private String name;
    private String index;

    // 构造方法
    private RechargeType(String name, String index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(Integer index) {
        for (RechargeType c : RechargeType.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public RechargeType setName(String name) {
        this.name = name;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public RechargeType setIndex(String index) {
        this.index = index;
        return this;
    }
}
