package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 16:31 2020/05/11
 */
public enum PicType {

    DROPDOWN(0,"下拉"), HOME(1,"首页"), DETAIL(2,"详情"),CAROUSEL(3,"轮播图");

    private int index;
    private String value;

    PicType(int index,String value) {
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