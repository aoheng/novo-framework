package com.novo.commons.support.deviceCenter.constans;

/**
 * @author Aoheng on 2021/01/31.
 */
public interface CommandType {

    /** 踢下线 */
    String KICK = "kick";

    /** 切换环境 */
    String SWITCH_ENV = "switchEnv";

    /** OTA升级 */
    String NOTIFY_OTA_UPDATE = "notifyOtaUpdate";

    /** 查询 */
    String QUERY = "query";

    /** 查询动态周期 */
    String QUERY_DYNAMIC_CYCLE = "queryDynamicCycle";

    /** 运行开关 */
    String RUNNING_SWITCH = "runningSwitch";

    /** 电源开关 */
    String POWER_SWITCH = "powerSwitch";

    /** 滤芯重置 */
    String PPF_RESET = "ppfReset";

    /** 设置滤芯百分比 */
    String SET_PPF_NUM = "setPpfNum";

    /** 重启 */
    String RESTART = "restart";

    /** 充值 */
    String RECHARGE = "recharge";

    /** 锁机 */
    String LOCK_MACHINE = "lockMachine";

    /** 推播媒体 */
    String SEND_MEDIA = "sendMedia";

    /** 推播文字 */
    String SEND_TEXT = "sendText";

    /** 计费模式 */
    String CHARGE_MODE = "chargeMode";

    /** D1 =========================================================================================== */

    /** 出水开机 */
    String FLOW_WATER_SWITCH = "flowSwitch";

    /** 臭氧开机 */
    String OZONE_SWITCH = "ozoneSwitch";

    /** 水量模式控制 */
    String WATER_MODE = "waterMode";

    /** 自定义加热温度 */
    String HEATING_TEMP = "heatingTemp";

    /** 自定义滤芯值 */
    String PPF_CUSTOM = "ppfCustom";

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

    /** ChildCup =========================================================================================== */

    /** 设置休眠时间 */
    String SET_SLEEP_TIME = "setSleepTime";

    /** 设置电子围栏 */
    String SET_FENCE = "setFence";

    /** 设置Led显示类型 */
    String SET_LED_TYPE = "setLedType";

    /** 系统参数 =========================================================================================== */

    /** 刷新缓存 */
    String REFRESH_CACHE = "refreshCache";
}
