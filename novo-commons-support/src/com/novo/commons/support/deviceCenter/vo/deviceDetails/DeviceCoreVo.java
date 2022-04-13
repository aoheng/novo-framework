package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;

/**设备滤芯（5根）
 * @Author:kemingheng
 * @Date:2020/1/10
 */
public class DeviceCoreVo implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String CORER1PERCENT="coreR1Percent";
    public static final String CORER2PERCENT="coreR2Percent";
    public static final String CORER3PERCENT="coreR3Percent";
    public static final String CORER4PERCENT="coreR4Percent";
    public static final String CORER5PERCENT="coreR5Percent";

    private Integer coreR1Percent;  //滤芯A剩余百分比
    private Integer coreR2Percent;  //滤芯B剩余百分比
    private Integer coreR3Percent;  //滤芯C剩余百分比
    private Integer coreR4Percent;  //滤芯D剩余百分比
    private Integer coreR5Percent;  //滤芯E剩余百分比

    public Integer getCoreR1Percent() {
        return coreR1Percent;
    }

    public DeviceCoreVo setCoreR1Percent(Integer coreR1Percent) {
        this.coreR1Percent = coreR1Percent;
        return this;
    }

    public Integer getCoreR2Percent() {
        return coreR2Percent;
    }

    public DeviceCoreVo setCoreR2Percent(Integer coreR2Percent) {
        this.coreR2Percent = coreR2Percent;
        return this;
    }

    public Integer getCoreR3Percent() {
        return coreR3Percent;
    }

    public DeviceCoreVo setCoreR3Percent(Integer coreR3Percent) {
        this.coreR3Percent = coreR3Percent;
        return this;
    }

    public Integer getCoreR4Percent() {
        return coreR4Percent;
    }

    public DeviceCoreVo setCoreR4Percent(Integer coreR4Percent) {
        this.coreR4Percent = coreR4Percent;
        return this;
    }

    public Integer getCoreR5Percent() {
        return coreR5Percent;
    }

    public DeviceCoreVo setCoreR5Percent(Integer coreR5Percent) {
        this.coreR5Percent = coreR5Percent;
        return this;
    }
}
