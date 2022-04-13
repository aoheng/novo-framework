package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;

/**
 * 协议消息解析字段类型
 * @author BinksRao on 2020/6/27
 */
public class ProtocolFieldTypeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**字段类型名称*/
    private String typeName;
    /**字段类型说明*/
    private String typeDesc;
    /**字段类型步长*/
    private Integer stepLength;
    /**字段基本类型（0：基本类型，1：自定义类型）*/
    private Integer baseStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Integer getStepLength() {
        return stepLength;
    }

    public void setStepLength(Integer stepLength) {
        this.stepLength = stepLength;
    }

    public Integer getBaseStatus() {
        return baseStatus;
    }

    public void setBaseStatus(Integer baseStatus) {
        this.baseStatus = baseStatus;
    }
}
