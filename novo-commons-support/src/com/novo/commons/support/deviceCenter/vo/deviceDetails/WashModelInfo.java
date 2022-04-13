package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;

/**
 * 洗碗机-功能是否可用
 *
 * @author BinksRao on 2020/10/22
 */
public class WashModelInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    //电源
    private Boolean power = true;
    //暂停启动
    private Boolean runningPause = true;
    //童锁
    private Boolean childLock = false;
    //新风
    private Boolean storage = false;
    //工作模式：空档
    private Boolean mode0 = false;
    //工作模式：节能
    private Boolean mode1 = false;
    //工作模式：强力
    private Boolean mode2 = false;
    //工作模式：日常
    private Boolean mode3 = false;
    //工作模式：快速
    private Boolean mode4 = false;
    //工作模式：奶瓶洗
    private Boolean mode5 = false;
    //工作模式：果蔬洗
    private Boolean mode6 = false;
    //工作模式：自清洁
    private Boolean mode7 = false;
    //工作模式：智能洗
    private Boolean mode9 = false;
    //门状态提示
    //private Boolean door = false;
    //水龙头提示
    //private Boolean tap = false;
    //浊度判断
    //private Boolean turbidity = false;

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Boolean getRunningPause() {
        return runningPause;
    }

    public void setRunningPause(Boolean runningPause) {
        this.runningPause = runningPause;
    }

    public Boolean getChildLock() {
        return childLock;
    }

    public void setChildLock(Boolean childLock) {
        this.childLock = childLock;
    }

    public Boolean getStorage() {
        return storage;
    }

    public void setStorage(Boolean storage) {
        this.storage = storage;
    }

    public Boolean getMode0() {
        return mode0;
    }

    public void setMode0(Boolean mode0) {
        this.mode0 = mode0;
    }

    public Boolean getMode1() {
        return mode1;
    }

    public void setMode1(Boolean mode1) {
        this.mode1 = mode1;
    }

    public Boolean getMode2() {
        return mode2;
    }

    public void setMode2(Boolean mode2) {
        this.mode2 = mode2;
    }

    public Boolean getMode3() {
        return mode3;
    }

    public void setMode3(Boolean mode3) {
        this.mode3 = mode3;
    }

    public Boolean getMode4() {
        return mode4;
    }

    public void setMode4(Boolean mode4) {
        this.mode4 = mode4;
    }

    public Boolean getMode5() {
        return mode5;
    }

    public void setMode5(Boolean mode5) {
        this.mode5 = mode5;
    }

    public Boolean getMode6() {
        return mode6;
    }

    public void setMode6(Boolean mode6) {
        this.mode6 = mode6;
    }

    public Boolean getMode7() {
        return mode7;
    }

    public void setMode7(Boolean mode7) {
        this.mode7 = mode7;
    }

    public Boolean getMode9() {
        return mode9;
    }

    public void setMode9(Boolean mode9) {
        this.mode9 = mode9;
    }

    /*public Boolean getDoor() {
        return door;
    }

    public void setDoor(Boolean door) {
        this.door = door;
    }

    public Boolean getTap() {
        return tap;
    }

    public void setTap(Boolean tap) {
        this.tap = tap;
    }

    public Boolean getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(Boolean turbidity) {
        this.turbidity = turbidity;
    }*/
}
