package com.novo.commons.support.deviceCenter.protocol.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author BinksRao on 2020/9/10
 */
public class DevicePpfAuthenticationVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**绑定设备编号*/
    private String deviceSn;
    /**设备类型：1-净水器 2-洗碗机*/
    private Integer deviceType;
    /**滤芯编码*/
    private String ppfSn;
    /**滤芯类型*/
    private String ppfType;
    /**防伪key*/
    private String antifakeKey;
    /**使用状态*/
    private Integer useNum;
    /**重置成功时间*/
    private String resetSuccessTime;
    /**创建时间*/
    //@JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;
    /**剩余百分比*/
    private Integer percent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getPpfSn() {
        return ppfSn;
    }

    public void setPpfSn(String ppfSn) {
        this.ppfSn = ppfSn;
    }

    public String getPpfType() {
        return ppfType;
    }

    public void setPpfType(String ppfType) {
        this.ppfType = ppfType;
    }

    public String getAntifakeKey() {
        return antifakeKey;
    }

    public void setAntifakeKey(String antifakeKey) {
        this.antifakeKey = antifakeKey;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getResetSuccessTime() {
        return resetSuccessTime;
    }

    public void setResetSuccessTime(String resetSuccessTime) {
        this.resetSuccessTime = resetSuccessTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
