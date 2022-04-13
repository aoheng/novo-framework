package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/11/2.
 * 切换环境VO（开发专用）
 **/
public class SwitchEnvVO {

    private String imeiCode;
    /**
     * 0-产测生产
     * 1-产测测试
     * 2-产测开发
     * 3-伊泉云生产
     * 4-伊泉云测试
     * 5-伊泉云开发
     * 6-公共云开发
     * 7-公共云测试
     * 8-公共云开发
     * 9-产测预发布
     * a-伊泉云预发布
     * b-公共云预发布
     * h-浩泽产测生产
     * i-浩泽产测测试
     * j-浩泽产测开发
     * k-浩泽产测预发布
     * l-浩泽私有云生产
     * m-浩泽私有云测试
     * n-浩泽私有云开发
     * o-浩泽私有云预发布
     */
    private String envCode;

    private Integer productCode;

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getEnvCode() { return envCode; }

    public void setEnvCode(String envCode) { this.envCode = envCode;}
}
