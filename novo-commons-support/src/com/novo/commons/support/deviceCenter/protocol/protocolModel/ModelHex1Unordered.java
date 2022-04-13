package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import com.novo.commons.util.excel.annotation.TitleCell;

/**
 * 16进制无序
 * @author RaoYongBin on 2020/5/4
 */
public class ModelHex1Unordered extends ProtocolFieldModel {
    private static final long serialVersionUID = 1L;

    /**单元归类*/
    @TitleCell(name = "单元归类", column = 1)
    private String unitType;

    /**名称*/
    @TitleCell(name = "名称", column = 2)
    private String fieldName;

    /**参数ID*/
    @TitleCell(name = "参数ID", column = 3)
    private String paramId;

    /**长度*/
    @TitleCell(name = "长度", column = 4, type = Integer.class)
    private Integer dataLen;

    /**数据类型*/
    @TitleCell(name = "数据类型", column = 5)
    private String fieldType;

    /**英文名称*/
    @TitleCell(name = "英文名称", column = 6)
    private String engName;

    /**说明*/
    @TitleCell(name = "说明", column = 7)
    private String instruction;

    public Integer getDataLen() {
        return dataLen;
    }

    public void setDataLen(Integer dataLen) {
        this.dataLen = dataLen;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public boolean check() {
        if (null == this.unitType || "".equals(this.unitType)) {
            return false;
        } else if (null == this.fieldName || "".equals(this.fieldName)) {
            return false;
        } else if (null == this.paramId || "".equals(this.paramId)) {
            return false;
        } else if (null == this.dataLen) {
            return false;
        } else if (null == this.fieldType || "".equals(this.fieldType)) {
            return false;
        } else if (null == this.engName || "".equals(this.engName)) {
            return false;
        }
        return true;
    }
}
