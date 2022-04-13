package com.novo.commons.support.maintance.request;

import com.novo.commons.support.maintance.SignVo;

/**
 * @author MickeyChen
 * @date 2020/01/29
 */
public class FactoryInterfaceRequest extends SignVo {


    public static final String my_field_deviceSn = "deviceSn";
    public static final String my_field_imeiCode = "imeiCode";
    public static final String my_field_orgCode = "orgCode";
    private static final long serialVersionUID = 2588346963685401847L;
    private Integer productCode;
    private String model;
    private String deviceSn;
    private String imeiCode;
    private String ccid;
    private String hardwareSn;
    private Integer hardwareType;
    private String zmportUser;
    private String hardware;
    private String orgCode;

    public String getOrgCode() { return orgCode; }

    public void setOrgCode(String orgCode) { this.orgCode = orgCode; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getDeviceSn() { return deviceSn; }

    public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getCcid() { return ccid; }

    public void setCcid(String ccid) { this.ccid = ccid; }

    public String getHardwareSn() { return hardwareSn; }

    public void setHardwareSn(String hardwareSn) { this.hardwareSn = hardwareSn; }

    public Integer getHardwareType() { return hardwareType; }

    public void setHardwareType(Integer hardwareType) { this.hardwareType = hardwareType; }

    public String getZmportUser() { return zmportUser; }

    public void setZmportUser(String zmportUser) { this.zmportUser = zmportUser; }

    public String getHardware() { return hardware; }

    public void setHardware(String hardware) { this.hardware = hardware; }
}
