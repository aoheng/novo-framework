package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;

/**
 * 全量字段表
 * @author BinksRao on 2020/7/18
 */
public class ProtocolWholeFieldVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**字段名*/
    private String fieldName;
    /**字段描述*/
    private String fieldDesc;
    /**字段类型id*/
    private Long fieldTypeId;
    /**字段类型名称*/
    private String fieldTypeName;
    /**字段解析类型(0,基本类型;1,自定义结构体)*/
    private Integer resolveType;
    /**结构体基础类型（1:bit,2:byte）*/
    private Integer structureType;
    /**结构体总长度*/
    private Integer structureLength;
    /**字段解析规则*/
    private String resolveRule;
    /**字段读写模式; 0:只读，1:只写，2:可读可写*/
    private Integer readType;
    /**字段参数Id*/
    private String paramId;
    /**字段协议id*/
    private Long protocolId;
    /**字段于表单中的显示方式（1:input,2:select）*/
    private Integer formType;
    /**字段默认值*/
    private String defaultValue;
    /**字段值类型的枚举参数*/
    private String formParam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public Long getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(Long fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    public Integer getResolveType() {
        return resolveType;
    }

    public void setResolveType(Integer resolveType) {
        this.resolveType = resolveType;
    }

    public Integer getStructureType() {
        return structureType;
    }

    public void setStructureType(Integer structureType) {
        this.structureType = structureType;
    }

    public Integer getStructureLength() {
        return structureLength;
    }

    public void setStructureLength(Integer structureLength) {
        this.structureLength = structureLength;
    }

    public String getResolveRule() {
        return resolveRule;
    }

    public void setResolveRule(String resolveRule) {
        this.resolveRule = resolveRule;
    }

    public Integer getReadType() {
        return readType;
    }

    public void setReadType(Integer readType) {
        this.readType = readType;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getFieldTypeName() {
        return fieldTypeName;
    }

    public void setFieldTypeName(String fieldTypeName) {
        this.fieldTypeName = fieldTypeName;
    }

    public Integer getFormType() {
        return formType;
    }

    public void setFormType(Integer formType) {
        this.formType = formType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getFormParam() {
        return formParam;
    }

    public void setFormParam(String formParam) {
        this.formParam = formParam;
    }
}
