package com.novo.framework.core.protocol;

public enum DefinitionDataScope {
    PERSON("个人"), DEPARTMENT("部门"), COMPANY("公司");

    private String desc;

    private DefinitionDataScope(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
