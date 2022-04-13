package com.novo.commons.support.deviceCenter.vo;

import java.io.Serializable;

/**
 * @author aoheng on 2021/01/315.
 */
public class DeviceBasicInfoVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    /** 设备生产管理号 */
    private String deviceSn;
    /** IMEI */
    private String imeiCode;
    /** 产品代码 */
    private Integer productCode;
    /** 机器型号 */
    private String model;
    /** 协议版本 */
    private String protVersion;
    /** 通讯协议id */
    private Long protocolId;
    /** 设备名称 */
    private String deviceName;

    public String getProtVersion() {
        return protVersion;
    }

    public void setProtVersion(String protVersion) {
        this.protVersion = protVersion;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDeviceSn() { return deviceSn; }

    public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
