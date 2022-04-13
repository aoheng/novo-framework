package com.novo.commons.support.deviceCenter.constans;

/**
 * @author MickeyChen
 * @date 2020/4/17
 */
public interface ProductCodeType {

    /** T1净水器 */
    Integer T1 = 0;

    /** T2净水器 */
    Integer T2 = 1;

    /** W1洗碗机 */
    Integer W1 = 2;

    /** M1厨上净水器 */
    Integer M1 = 3;

    /** A1空气净化器 */
    Integer A1 = 4;

    /** 土豪金JZY-A2B3 */
    @Deprecated
    Integer LUXURY_GOLD_1 = 5;

    /** T2S净水器 */
    Integer T2S = 6;

    /** 土豪金JZY-A2B3-HBWG */
    Integer LUXURY_GOLD_2 = 7;

    /** 碧丽HZA06-364A */
    Integer BETTY = 8;

    /** 三出水HZA06-370A */
    Integer THREE_WATER = 9;

    /** MINI厨上纯水机M4 */
    Integer MINI_M4 = 10;

    /** 净水器A6G */
    Integer A6G = 11;

    /** 1.5代机JZY-A1XB */
    Integer ONE_POINT_FIVE = 12;

    /** 商用洗碗机C1 */
    Integer C1 = 13;

    /** 水芯片YCZ-CT6-X2(HWP) */
    Integer WATER_CHIP = 14;

    /** 华迈物云机E1 */
    Integer VAMIA = 15;

    /** NB水机，YCZ-CT6-X5 */
    Integer NBIOT_T2 = 16;

    /** 儿童保温杯 */
    Integer CHILDREN_CUP = 17;

    /** 浩泽二代机 */
    Integer[] OZNER_SECOND = {18,19,20,21};

    /** 厨上YCZ-CT6-S1(HWP) */
    Integer YCZ_CT6_S1_HWP = 22;

    /** 浩喜洗碗机 */
    Integer[] HAO_XI_WASHING_DISH = {23,24,25,26,27,28,29,30,31,32};

    /** 创维净水器 */
    Integer SKY_WORTH = 33;

    /** 菌落改进机JZY-A1XB-A8(HBSJ) */
    Integer COLONY_IMPROVE = 34;

    /** NOVO-BOT物联网盒子 */
    Integer[] NOVO_BOT = {35,42};

    /** DN的一堆净水器 */
    Integer[] DN_WATER_CLEANER = {36,37,38,39,40,41};

    /**正则物云机，采用华迈水机指令**/
    Integer ZHENZE_VAMIA = 43;

    /**HR-A1-GS1广视汇净水器**/
    Integer HR_A1_GS1=45;
}
