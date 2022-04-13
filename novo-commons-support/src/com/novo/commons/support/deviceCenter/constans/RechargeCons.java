package com.novo.commons.support.deviceCenter.constans;

/**
 * @author MickeyChen
 * @date 2020/3/14
 */
public interface RechargeCons {

    int NO_SEND_STATUS = 0;
    int SUCCESS_STATUS = 1;
    int FAIL_STATUS = 2;

    String ACTION_NAME_SEND_RECHARGE = "sendRecharge";

    String ACTION_NAME_REMOVE_RECHARGE = "removeRecharge";

    String ACTION_NAME_RESTART = "restart";

    String ACTION_NAME_HEATING_SWITCH = "heatingSwitch";

    String ACTION_NAME_HEATING_PLAN_TIME = "heatingPlanTime";

    String ACTION_NAME_TEMP_MODE = "tempMode";

    String ACTION_NAME_WATER_MODE = "waterMode";

    String ACTION_NAME_QUERY_DYNAMIC_CYCLE = "queryDynamicCycle";

    String ACTION_NAME_COOLING_SWITCH = "coolingSwitch";

    String ACTION_NAME_POWER_SWITCH = "powerSwitch";

    String ACTION_NAME_RESET_FILTER = "resetFilter";
}
