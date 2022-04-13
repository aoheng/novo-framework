package com.novo.commons.support.deviceCenter.constans;

/**
 * @author BinksRao on 2020/8/14
 */
public interface UniversalCommandType {

    /** 踢下线 */
    String KICK = "kick";

    /** 切换环境 */
    String SWITCH_ENV = "switchEnv";

    /** 切换环境 */
    String NOTIFY_OTA_UPDATE = "notifyOtaUpdate";

    /** 查询 */
    String QUERY = "query";

    /** 查询动态周期 */
    String QUERY_DYNAMIC_CYCLE = "queryDynamicCycle";

    /** 电源开机 */
    String POWER = "power";

    /** 下发水值 */
    String EXPIRE_TIME = "deviceExpireTime";

    /** 滤芯重置 */
    String PPF_RESET = "ppfRest";

    /** 重启 */
    String RESTART = "restart";

    /** 充值 */
    String RECHARGE = "recharge";

    /** 锁机 */
    String LOCK_MACHINE = "lockMachine";

    /** 推播媒体 */
    String SEND_MEDIA="sendMedia";

    /** D1 =========================================================================================== */

    /** 出水开机 */
    String FLOW_WATER_SWITCH = "flowWater";

    /** 臭氧开机 */
    String OZONE_SWITCH = "ozoneSwitch";

    /** 水量模式控制 */
    String WATER_MODE = "waterMode";

    /** D1_b_c =========================================================================================== */

    /** 电源开关定时 */
    String POWER_PLAN_TIME = "powerPlanTime";

    /** 加热开关 */
    String HEATING_SWITCH = "heatingSwitch";

    /** 加热定时 */
    String HEATING_PLAN_TIME = "heatingPlanTime";

    /** 温度模式 */
    String TEMP_MODE = "tempMode";

    /** 制冷开关 */
    String COOLING_SWITCH = "coolingSwitch";

    /** TDS采集开关 */
    String TDS_COLLECT_SWITCH = "tdsCollectSwitch";

    /** D2 =========================================================================================== */

    /** 保管（新风）开关（洗碗机） */
    String STORAGE_SWITCH = "storageSwitch";

    /** 工作模式切换开关 */
    String WORK_MODE_SWITCH = "workModeSwitch";

    /** 启动暂停开机 */
    String RUNNING_PAUSE_SWITCH = "runningPauseSwitch";

    /** 童锁开机 */
    String CHILD_LOCK_SWITCH = "childLockSwitch";

    /** D3 =========================================================================================== */

    /** 出风模式切换开关 */
    String WIND_MODE_SWITCH = "windModeSwitch";

}
