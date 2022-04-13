package com.novo.commons.support.deviceCenter.constans;

/**
 * @author Aoheng on 2020/11/3.
 */
public interface ModelSnType {

    String T1_TEST = "OZNR-A123_0001_01";
    String T1_YQJP_PRODUCTION = "OZNR-A123_0001_00";
    String T1_OZNER_PRODUCTION = "OZNR-T1_0001_00";
    @Deprecated
    String MQTT_TEST = "01";
    @Deprecated
    String MQTT_PRODUCTION = "00";

    String FACTORY_TEST_PROD = "0";
    String FACTORY_TEST_TEST = "1";
    String FACTORY_TEST_DEV = "2";
    String FACTORY_TEST_PRE = "9";

    String YQJP_CLOUD_PROD = "3";
    String YQJP_CLOUD_TEST = "4";
    String YQJP_CLOUD_DEV = "5";
    String YQJP_CLOUD_PRE = "a";

    String NOVO_CLOUD_PROD = "6";
    String NOVO_CLOUD_TEST = "7";
    String NOVO_CLOUD_DEV = "8";
    String NOVO_CLOUD_PRE = "b";

    String OZNER_FACTORY_TEST_PROD = "h";
    String OZNER_FACTORY_TEST_TEST = "i";
    String OZNER_FACTORY_TEST_DEV = "j";
    String OZNER_FACTORY_TEST_PRE = "k";

    String OZNER_CLOUD_PROD = "l";
    String OZNER_CLOUD_TEST = "m";
    String OZNER_CLOUD_DEV = "n";
    String OZNER_CLOUD_PRE = "o";

    /** 转换到产测环境代码 */
    static String transformToFactoryTest(String originalModelSn) {
        if (ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn))
            return ModelSnType.FACTORY_TEST_PROD;
        if (ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn))
            return ModelSnType.FACTORY_TEST_PRE;
        if (ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn))
            return ModelSnType.FACTORY_TEST_TEST;
        if (ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn))
            return ModelSnType.FACTORY_TEST_DEV;

        throw new UnsupportedOperationException("不支持的modelSn转换：" + originalModelSn);
    }

    /** 转换到浩泽产测环境代码 */
    static String transformToOznerFactoryTest(String originalModelSn) {
        if (ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_FACTORY_TEST_PROD;
        if (ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_FACTORY_TEST_PRE;
        if (ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_FACTORY_TEST_TEST;
        if (ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_FACTORY_TEST_DEV;

        throw new UnsupportedOperationException("不支持的modelSn转换：" + originalModelSn);
    }

    /** 转换到伊泉云环境代码 */
    static String transformToYqjpCloud(String originalModelSn) {
        if (ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PROD.equalsIgnoreCase(originalModelSn))
            return ModelSnType.YQJP_CLOUD_PROD;
        if (ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PRE.equalsIgnoreCase(originalModelSn))
            return ModelSnType.YQJP_CLOUD_PRE;
        if (ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_TEST.equalsIgnoreCase(originalModelSn))
            return ModelSnType.YQJP_CLOUD_TEST;
        if (ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_DEV.equalsIgnoreCase(originalModelSn))
            return ModelSnType.YQJP_CLOUD_DEV;

        throw new UnsupportedOperationException("不支持的modelSn转换：" + originalModelSn);
    }

    /** 转换到公共云环境代码 */
    static String transformToNovoCloud(String originalModelSn) {
        if (ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PROD.equalsIgnoreCase(originalModelSn))
            return ModelSnType.NOVO_CLOUD_PROD;
        if (ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_PRE.equalsIgnoreCase(originalModelSn))
            return ModelSnType.NOVO_CLOUD_PRE;
        if (ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_TEST.equalsIgnoreCase(originalModelSn))
            return ModelSnType.NOVO_CLOUD_TEST;
        if (ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.YQJP_CLOUD_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.NOVO_CLOUD_DEV.equalsIgnoreCase(originalModelSn))
            return ModelSnType.NOVO_CLOUD_DEV;

        throw new UnsupportedOperationException("不支持的modelSn转换：" + originalModelSn);
    }

    /** 转换到浩泽私有云环境代码 */
    static String transformToOznerCloud(String originalModelSn) {
        if (ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PROD.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PROD.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_CLOUD_PROD;
        if (ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PRE.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_PRE.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_CLOUD_PRE;
        if (ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_TEST.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_TEST.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_CLOUD_TEST;
        if (ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_FACTORY_TEST_DEV.equalsIgnoreCase(originalModelSn)
                || ModelSnType.OZNER_CLOUD_DEV.equalsIgnoreCase(originalModelSn))
            return ModelSnType.OZNER_CLOUD_DEV;

        throw new UnsupportedOperationException("不支持的modelSn转换：" + originalModelSn);
    }

    /** 是否伊泉产测环境 */
    static boolean isFactoryTest(String modelSn) {
        return ModelSnType.FACTORY_TEST_PROD.equalsIgnoreCase(modelSn)
                || ModelSnType.FACTORY_TEST_PRE.equalsIgnoreCase(modelSn)
                || ModelSnType.FACTORY_TEST_TEST.equalsIgnoreCase(modelSn)
                || ModelSnType.FACTORY_TEST_DEV.equalsIgnoreCase(modelSn);
    }

    /** 是否浩泽产测环境 */
    static boolean isOznerFactoryTest(String modelSn) {
        return ModelSnType.OZNER_FACTORY_TEST_PROD.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_FACTORY_TEST_PRE.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_FACTORY_TEST_TEST.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_FACTORY_TEST_DEV.equalsIgnoreCase(modelSn);
    }

    /** 是否伊泉云环境 */
    static boolean isYqjpCloud(String modelSn) {
        return ModelSnType.YQJP_CLOUD_PROD.equalsIgnoreCase(modelSn)
                || ModelSnType.YQJP_CLOUD_PRE.equalsIgnoreCase(modelSn)
                || ModelSnType.YQJP_CLOUD_TEST.equalsIgnoreCase(modelSn)
                || ModelSnType.YQJP_CLOUD_DEV.equalsIgnoreCase(modelSn);
    }

    /** 是否公共云环境 */
    static boolean isNovoCloud(String modelSn) {
        return ModelSnType.NOVO_CLOUD_PROD.equalsIgnoreCase(modelSn)
                || ModelSnType.NOVO_CLOUD_PRE.equalsIgnoreCase(modelSn)
                || ModelSnType.NOVO_CLOUD_TEST.equalsIgnoreCase(modelSn)
                || ModelSnType.NOVO_CLOUD_DEV.equalsIgnoreCase(modelSn);
    }

    /** 是否浩泽私有云环境 */
    static boolean isOznerCloud(String modelSn) {
        return ModelSnType.OZNER_CLOUD_PROD.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_CLOUD_PRE.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_CLOUD_TEST.equalsIgnoreCase(modelSn)
                || ModelSnType.OZNER_CLOUD_DEV.equalsIgnoreCase(modelSn);
    }
}
