package com.novo.commons.support.deviceCenter.constans;

/**
 * @author MickeyChen
 * @date 2020/1/16
 */
public interface HardwareType {

    int SPIGOT_FIRM = 1;//龙头
    int MAIN_FIRM = 2;//主板模块或通讯模块
    int CTRL_FIRM = 3;//控制板或单片机
    @Deprecated
    int GSM_FIRM = 4;//GSM模块
    int SCREEN_FIRM = 5;//显示板
    int CONSUMABEL_FIRM = 6;//耗材板

    String HT_SPIGOT = "龙头";
    String HT_MAIN = "主板模块";
    String HT_CTRL = "控制板";
    String HT_GSM = "GSM模块";
    String HT_SCREEN = "显示板";
    String HT_CONSUMABEL = "耗材板";
}
