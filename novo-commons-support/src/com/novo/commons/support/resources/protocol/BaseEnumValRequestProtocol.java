package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 数据字典---枚举值请求协议
 * @date 2020-06-26 11:17
 **/

public class BaseEnumValRequestProtocol extends PaginationRequestProtocol {
    public static final String my_field_enumName = "enumName";

    private Long id;
    /**
     * 修改人id
     */
    private Long modifierId;

    /**
     * 值名称
     */
    private String valueName;

    /**
     * 值编号
     */
    private String valueCode;

    /**
     * 父项,依赖
     */
    private Long parentId;

    /**
     * 枚举表(父表id)
     */
    private Long enumId;


    private String enumName;


    /**
     * 备注描述
     */
    private String remark;

    //*****************************************************************************************************


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getEnumId() {
        return enumId;
    }

    public void setEnumId(Long enumId) {
        this.enumId = enumId;
    }
}
