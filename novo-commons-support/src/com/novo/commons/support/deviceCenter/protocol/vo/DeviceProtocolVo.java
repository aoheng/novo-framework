package com.novo.commons.support.deviceCenter.protocol.vo;

import com.novo.commons.support.deviceCenter.protocol.protocolModel.ProtocolMqttTopicVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 设备协议
 * @author mark_lu
 * 2020年1月24日
 */
public class DeviceProtocolVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**协议名称*/
    private String protName;
    /**协议版本*/
    private String protVersion;
    /**数据传输类型; 1:16进制有序，2:16进制无序，3:json*/
    private Integer transferType;//hex json
    /**协议描述*/
    private String protDesc;
    /**协议类型；1：MQTT*/
    private Integer protType;
    /**基础协议标识；1:基础协议 不可更改, 2:扩展协议 可修改*/
    private Integer protBaseType;
    /**消息类型token步长(只针对hex解析)*/
    private Integer tokenLength;
    /**消息字段参数id步长(只针对参数解析)*/
    private Integer paramLength;
    /**协议包含的主题*/
    private List<ProtocolMqttTopicVo> topicVoList;
    /**创建时间*/
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date createTime;
    /**启用状态(true：启用，false：禁用)*/
    private Boolean dataStatus;
    /**组织代码*/
    private String orgCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProtocolMqttTopicVo> getTopicVoList() {
        return topicVoList;
    }

    public void setTopicVoList(List<ProtocolMqttTopicVo> topicVoList) {
        this.topicVoList = topicVoList;
    }

    public String getProtName() {
        return protName;
    }

    public void setProtName(String protName) {
        this.protName = protName;
    }

    public String getProtVersion() {
        return protVersion;
    }

    public void setProtVersion(String protVersion) {
        this.protVersion = protVersion;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getProtDesc() {
        return protDesc;
    }

    public void setProtDesc(String protDesc) {
        this.protDesc = protDesc;
    }

    public Integer getProtType() {
        return protType;
    }

    public void setProtType(Integer protType) {
        this.protType = protType;
    }

    public Integer getProtBaseType() {
        return protBaseType;
    }

    public void setProtBaseType(Integer protBaseType) {
        this.protBaseType = protBaseType;
    }

    public Integer getTokenLength() {
        return tokenLength;
    }

    public void setTokenLength(Integer tokenLength) {
        this.tokenLength = tokenLength;
    }

    public Integer getParamLength() {
        return paramLength;
    }

    public void setParamLength(Integer paramLength) {
        this.paramLength = paramLength;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
