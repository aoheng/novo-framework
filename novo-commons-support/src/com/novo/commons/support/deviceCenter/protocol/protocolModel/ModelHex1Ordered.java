package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import com.novo.commons.util.excel.annotation.TitleCell;

/**
 * 16进制有序
 * @author RaoYongBin on 2020/5/4
 */
public class ModelHex1Ordered extends ProtocolFieldModel {
    private static final long serialVersionUID = 1L;

    /**单元归类*/
    @TitleCell(name = "单元归类", column = 1)
    private String unitType;

    /**名称*/
    @TitleCell(name = "名称", column = 2)
    private String fieldName;

    /**描述*/
    @TitleCell(name = "描述", column = 2)
    private String desc;

    /**字段类型*/
    @TitleCell(name = "字段类型", column = 5)
    private String fieldType;

    /**起始位置*/
    @TitleCell(name = "起始位", column = 3, type = Integer.class)
    private Integer startPos;

    /**长度*/
    @TitleCell(name = "长度", column = 4, type = Integer.class)
    private Integer dataLen;

    /**读写模式*/
    @TitleCell(name = "读写模式", column = 2)
    private String readType;

    /**英文名称*/
    @TitleCell(name = "英文名称", column = 6)
    private String engName;

    /**说明*/
    @TitleCell(name = "说明", column = 7)
    private String instruction;

    public Integer getStartPos() {
        return startPos;
    }

    public void setStartPos(Integer startPos) {
        this.startPos = startPos;
    }

    public Integer getDataLen() {
        return dataLen;
    }

    public void setDataLen(Integer dataLen) {
        this.dataLen = dataLen;
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
        } else if (null == this.startPos) {
            return false;
        } else if (null == this.dataLen ) {
            return false;
        } else if (null == this.fieldType || "".equals(this.fieldType)) {
            return false;
        } else if (null == this.engName || "".equals(this.engName)) {
            return false;
        }
        return true;
    }
}
