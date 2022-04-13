package com.novo.commons.support.deviceCenter.mqtt.constant;

/**
 * @author Aoheng on 2020/12/20.
 */
public interface D2_RemoteControlType {
    /** 关机 */
    String POWER_OFF = "power0";
    /** 开机 */
    String POWER_ON = "power1";
    /** 保管关（新风关） */
    String STORAGE_OFF = "storage0";
    /** 保管开（新风开） */
    String STORAGE_ON = "storage1";
    /** 工作模式：空档 */
    String WORK_MODE_0 = "mode0";
    /** 工作模式：节能 */
    String WORK_MODE_1 = "mode1";
    /** 工作模式：强力 */
    String WORK_MODE_2 = "mode2";
    /** 工作模式：日常 */
    String WORK_MODE_3 = "mode3";
    /** 工作模式：快速 */
    String WORK_MODE_4 = "mode4";
    /** 工作模式：奶瓶洗 */
    String WORK_MODE_5 = "mode5";
    /** 工作模式：果蔬洗 */
    String WORK_MODE_6 = "mode6";
    /** 工作模式：自清洁 */
    String WORK_MODE_7 = "mode7";
    /** 工作模式：自定义 */
    String WORK_MODE_8 = "mode8";
    /** 工作模式：智能洗 */
    String WORK_MODE_9 = "mode9";
    /** 运行 */
    String RUNNING = "running1";
    /** 暂停 */
    String PAUSE = "running0";
    /** 童锁开 */
    String CHILD_LOCK_ON = "childlock1";
    /** 童锁关 */
    String CHILD_LOCK_OFF = "childlock0";
    /** 滤芯复位 */
    String PPF_RESET = "ppfReset";
    /** 重启 */
    String RESTART = "restart";
}
