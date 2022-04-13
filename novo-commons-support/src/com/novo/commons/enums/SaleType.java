package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 10:17 2020/03/02
 */
public enum SaleType {

    RENTAL(0,"租赁"),

    SALE(1,"售卖");

    private static String rental="RENTAL";
    private static String sale="SALE";

    private int index;
    private String value;

    SaleType(int index,String value) {
        this.index = index;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getIndex(){
        return index;
    }
    public static PicType valueOf(int index) {
        for (PicType picType : PicType.values()) {
            if (picType.getIndex() == index) {
                return picType;
            }
        }
        return null;
    }
}