package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/01/31.
 */
public class ProductVO {

    private Integer deviceType;
    private Integer productCode;
    private String productName;
    private String model;
    private String factoryPassword;
    private String productPassword;

    public ProductVO() {

    }

    public ProductVO(Integer deviceType, Integer productCode, String productName, String model, String factoryPassword, String productPassword) {
        this.deviceType = deviceType;
        this.productCode = productCode;
        this.productName = productName;
        this.model = model;
        this.factoryPassword = factoryPassword;
        this.productPassword = productPassword;
    }

    public Integer getDeviceType() { return deviceType; }

    public void setDeviceType(Integer deviceType) { this.deviceType = deviceType; }

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getProductName() { return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getFactoryPassword() { return factoryPassword; }

    public void setFactoryPassword(String factoryPassword) { this.factoryPassword = factoryPassword; }

    public String getProductPassword() { return productPassword; }

    public void setProductPassword(String productPassword) { this.productPassword = productPassword; }
}