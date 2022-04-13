package com.novo.commons.support.resources.vo;

import com.novo.commons.enums.ValueType;

import java.io.Serializable;

/**
 * 系统参数配置
 * @author mark_lu
 * 2020年1月15日
 */
public class SysconfigVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;//名称

    private String keyName;

    /**
     * 配置值
     */
    private String value;

    /**
     * 值类型
     */
    private ValueType valueType;

    private String orgCode;

    /**
     * 参数描述
     */
    private String sysDesc;

    //*****************************************************************************************************


    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }


}
