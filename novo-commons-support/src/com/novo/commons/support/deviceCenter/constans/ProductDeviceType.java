package com.novo.commons.support.deviceCenter.constans;

import java.util.Arrays;

/**
 * 根据产品编码查找是什么类型设备
 * 本来应该数据库维护，可数据库存在bussiness_product与device_product使用混乱，很有问题。
 * @author MickeyChen
 * @date 2020/12/26
 */
public enum ProductDeviceType {

    D1_WATER_CLEANER(new Integer[]{
            ProductCodeType.T1,
            ProductCodeType.T2,
            ProductCodeType.M1,
            ProductCodeType.LUXURY_GOLD_1,
            ProductCodeType.T2S,
            ProductCodeType.LUXURY_GOLD_2,
            ProductCodeType.BETTY,
            ProductCodeType.THREE_WATER,
            ProductCodeType.MINI_M4,
            ProductCodeType.A6G,
            ProductCodeType.ONE_POINT_FIVE,
            ProductCodeType.WATER_CHIP,
            ProductCodeType.VAMIA,
            ProductCodeType.NBIOT_T2,
            ProductCodeType.OZNER_SECOND[0],
            ProductCodeType.OZNER_SECOND[1],
            ProductCodeType.OZNER_SECOND[2],
            ProductCodeType.OZNER_SECOND[3],
            ProductCodeType.YCZ_CT6_S1_HWP,
            ProductCodeType.SKY_WORTH,
            ProductCodeType.COLONY_IMPROVE,
            ProductCodeType.DN_WATER_CLEANER[0],
            ProductCodeType.DN_WATER_CLEANER[1],
            ProductCodeType.DN_WATER_CLEANER[2],
            ProductCodeType.DN_WATER_CLEANER[3],
            ProductCodeType.DN_WATER_CLEANER[4],
            ProductCodeType.DN_WATER_CLEANER[5],
    }, DeviceType.D1_WATER_CLEANER),

    D2_DISH_WASHER(new Integer[]{
            ProductCodeType.W1,
            ProductCodeType.C1,
            ProductCodeType.HAO_XI_WASHING_DISH[0],
            ProductCodeType.HAO_XI_WASHING_DISH[1],
            ProductCodeType.HAO_XI_WASHING_DISH[2],
            ProductCodeType.HAO_XI_WASHING_DISH[3],
            ProductCodeType.HAO_XI_WASHING_DISH[4],
            ProductCodeType.HAO_XI_WASHING_DISH[5],
            ProductCodeType.HAO_XI_WASHING_DISH[6],
            ProductCodeType.HAO_XI_WASHING_DISH[7],
            ProductCodeType.HAO_XI_WASHING_DISH[8],
            ProductCodeType.HAO_XI_WASHING_DISH[9],
    }, DeviceType.D2_DISH_WASHER),

    ;

    private Integer[] productCode;
    private Integer deviceType;


    ProductDeviceType(Integer[] productCode, Integer deviceType) {
        this.productCode = productCode;
        this.deviceType = deviceType;
    }

    public static Integer getDeviceType(Integer productCode) {
        for (ProductDeviceType cons : ProductDeviceType.values()) {
            if (Arrays.asList(cons.getProductCode()).contains(productCode)) {
                return cons.getDeviceType();
            }
        }
        return -1;
    }

    public Integer[] getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer[] productCode) {
        this.productCode = productCode;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }
}
