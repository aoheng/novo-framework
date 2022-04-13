package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * 协议消息字段
 * @author BinksRao on 2020/7/4
 */
public class ProtocolMessageFieldRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**字段名*/
    private String fieldName;
    /**字段描述*/
    private String fieldDesc;
    /**字段类型id*/
    private Long fieldTypeId;
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
    /**字段所属消息类型id*/
    private Long tokenId;

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

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
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
}
