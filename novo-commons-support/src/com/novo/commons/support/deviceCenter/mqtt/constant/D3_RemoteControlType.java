package com.novo.commons.support.deviceCenter.mqtt.constant;

/**
 * @author Aoheng on 2020/12/20.
 */
public interface D3_RemoteControlType {

    String POWER_OFF = "power0";
    String POWER_ON = "power1";
    /** 出风模式：AUTO */
    String WIND_MODE_0 = "windMode0";
    /** 出风模式：静音 */
    String WIND_MODE_1 = "windMode1";
    /** 出风模式：强风 */
    String WIND_MODE_2 = "windMode2";
    /** 童锁开 */
    String CHILD_LOCK_ON = "childlock1";
    /** 童锁关 */
    String CHILD_LOCK_OFF = "childlock0";
    String RESTART = "restart";
    String LOCK_MACHINE_OFF = "lockMachine0";
    String LOCK_MACHINE_ON = "lockMachine1";
    String PPF_RESET = "ppfReset";
    String FACTORY_TEST = "factoryTest";
}
