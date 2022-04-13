package com.novo.commons.support.deviceCenter.constans;

/**
 * @author MickeyChen
 * @date 2020/7/30
 */
public enum BusWashingDishPpfType {

    /* 31是净水芯，32是软水芯，33是净洁芯，34是亮洁芯，35是清洗剂，36是快干剂 */

//    /** 清洗剂 */
//    Integer CORE1 = 35;
//
//    /** 快干剂 */
//    Integer CORE2 = 36;
//
//    /** 净水芯 */
//    Integer CORE3 = 31;
//
//    /** 软水芯 */
//    Integer CORE4 = 32;
//
//    /** 净洁芯 */
//    Integer CORE5 = 33;
//
//    /** 亮洁芯 */
//    Integer CORE6 = 34;
//
//    /** 浩喜滤芯添加唯一标识，防止编码过短与其他厂商相同 */
//    String FILTER_PREFIX = "hx_filter_";

    /** 31是净水芯 */
    C1(31, "3"),

    /** 32是软水芯 */
    C2(32, "4"),

    /** 33是净洁芯 */
    C3(33, "5"),

    /** 334是亮洁芯 */
    C4(34, "6"),

    /** 35是清洗剂 */
    C5(35, "7"),

    /** 36是快干剂 */
    C6(36, "8"),

    FILTER_KEY(-1,"hx_filter_");

    private Integer deviceFilterType;
    private String rebateType;

    BusWashingDishPpfType(Integer deviceFilterType, String rebateType) {
        this.deviceFilterType = deviceFilterType;
        this.rebateType = rebateType;
    }

    /** 是否存在枚举，不存在返回error */
    public static String getExistKey(Integer code) {
        for (BusWashingDishPpfType cons : BusWashingDishPpfType.values()) {
            if (code.equals(cons.getDeviceFilterType())) {
                return cons.getRebateType();
            }
        }
        return null;
    }

    public Integer getDeviceFilterType() {
        return deviceFilterType;
    }

    public void setDeviceFilterType(Integer deviceFilterType) {
        this.deviceFilterType = deviceFilterType;
    }

    public String getRebateType() {
        return rebateType;
    }

    public void setRebateType(String rebateType) {
        this.rebateType = rebateType;
    }
}
