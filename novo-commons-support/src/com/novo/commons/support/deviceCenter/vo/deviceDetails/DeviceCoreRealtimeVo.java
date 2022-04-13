package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/7/9
 */
public class DeviceCoreRealtimeVo implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String MERTERING="meteringMode";
    public static final String USED_MERTRING="usedMeteringMode";

    /** 设备编号 */
    private String deviceSn;
    /** imei */
    private String imeiCode;
    /** 产品代码 */
    private Integer productCode;
    /** 净化前原水TDS值 */
    private Integer td1 = 0;
    /** 净化后纯水TDS值 */
    private Integer td2 = 0;
    /** 滤芯信息集合 */
    private List<DeviceCoreRealtimeDetailVo> coreDetails;
    /** 服务剩余天数 */
    private Long margin;
    /** 服务到期时间 */
    private String dueTime;
    /** gprs信号强度 */
    private Integer sgt = 0;
    /** 机器故障 */
    private String errors;
    /** 详情数据 */
    private Object dynamicData;
    /** 是否售卖 */
    private Integer saleType;
    /** 洗碗机型号具有的功能模式 */
    private WashModelInfo washModelInfo;
    /** 设备名称 */
    private String deviceName;
    /** 商品图片 */
    private String productPic;
    /** 是否在线（0：不在线，1：在线）*/
    private Integer onlineStatus;
    //总次数
    private Long meteringMode;
    //已使用次数
    private Long usedMeteringMode;
    //计量模式：4：时间，5：壶数
    private Integer chargeMode;
    //设备真实到期时间
    private String deviceExpireTime;
    //运营商名称
    private String operatorName;
    //运营商电话
    private String operatorMobile;
    //客户名称
    private String customerName;


    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public List<DeviceCoreRealtimeDetailVo> getCoreDetails() {
        return coreDetails;
    }

    public void setCoreDetails(List<DeviceCoreRealtimeDetailVo> coreDetails) {
        this.coreDetails = coreDetails;
    }

    public Integer getTd1() {
        return td1;
    }

    public void setTd1(Integer td1) {
        this.td1 = td1;
    }

    public Integer getTd2() {
        return td2;
    }

    public void setTd2(Integer td2) {
        this.td2 = td2;
    }

    public Long getMargin() {
        return margin;
    }

    public void setMargin(Long margin) {
        this.margin = margin;
    }

    public Integer getSgt() {
        return sgt;
    }

    public void setSgt(Integer sgt) {
        this.sgt = sgt;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Object getDynamicData() {
        return dynamicData;
    }

    public void setDynamicData(Object dynamicData) {
        this.dynamicData = dynamicData;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public WashModelInfo getWashModelInfo() {
        return washModelInfo;
    }

    public void setWashModelInfo(WashModelInfo washModelInfo) {
        this.washModelInfo = washModelInfo;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public Long getMeteringMode() {
        return meteringMode;
    }

    public DeviceCoreRealtimeVo setMeteringMode(Long meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }

    public Long getUsedMeteringMode() {
        return usedMeteringMode;
    }

    public DeviceCoreRealtimeVo setUsedMeteringMode(Long usedMeteringMode) {
        this.usedMeteringMode = usedMeteringMode;
        return this;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public DeviceCoreRealtimeVo setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public String getDeviceExpireTime() {
        return deviceExpireTime;
    }

    public DeviceCoreRealtimeVo setDeviceExpireTime(String deviceExpireTime) {
        this.deviceExpireTime = deviceExpireTime;
        return this;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public DeviceCoreRealtimeVo setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    public String getOperatorMobile() {
        return operatorMobile;
    }

    public DeviceCoreRealtimeVo setOperatorMobile(String operatorMobile) {
        this.operatorMobile = operatorMobile;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public DeviceCoreRealtimeVo setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
