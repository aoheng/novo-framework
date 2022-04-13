package com.novo.commons.support.deviceCenter.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author BinksRao on 2020/7/28
 */
public class ProtocolFunctionRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**功能名称*/
    private String funcName;
    /**功能标识*/
    private String funcCode;
    /**功能类型*/
    private Integer funcType;
    /**数据模型名称*/
    private String modelName;
    /**数据模型标识*/
    private String modelCode;
    /**PC页面模版url*/
    private String pcUrl;
    /**移动页面模版url*/
    private String mobileUrl;
    /**功能字段*/
    private String fieldIds;
    /**功能字段*/
    private List<Long> fieldIdList;
    /**协议id*/
    private Long protocolId;
    /**移动端开关*/
    private Boolean mobileOn;
    /**状态(true：启用，false：禁用)*/
    private Boolean dataStatus;
    /**是否创建mongo*/
    private Integer mongoCreated;

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getPcUrl() {
        return pcUrl;
    }

    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getFieldIds() {
        return fieldIds;
    }

    public void setFieldIds(String fieldIds) {
        this.fieldIds = fieldIds;
    }

    public Boolean getMobileOn() {
        return mobileOn;
    }

    public void setMobileOn(Boolean mobileOn) {
        this.mobileOn = mobileOn;
    }

    public List<Long> getFieldIdList() {
        return fieldIdList;
    }

    public void setFieldIdList(List<Long> fieldIdList) {
        this.fieldIdList = fieldIdList;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getMongoCreated() {
        return mongoCreated;
    }

    public void setMongoCreated(Integer mongoCreated) {
        this.mongoCreated = mongoCreated;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }
}
