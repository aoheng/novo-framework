package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:19 2020/05/10
 */
public enum CategoryType {

    ROOT_CATEGORY("根分类"),
    CHILD_CATEGORY("子分类");

    private String text;

    private CategoryType(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

//    private String value;
//
//    CategoryType(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    @Override
//    public String toString() {
//        return this.value;
//    }
}