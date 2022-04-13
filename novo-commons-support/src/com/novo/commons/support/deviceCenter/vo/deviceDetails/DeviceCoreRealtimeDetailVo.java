package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/7/9
 */
public class DeviceCoreRealtimeDetailVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 滤芯名称 */
    private String name;
    /** 描述 */
    private String desc;
    /** 说明 */
    private String title;
    /** 滤芯剩余百分比 */
    private Integer percent = 0;
    /** 服务工作天数 */
    private Long days = 0l;

    public DeviceCoreRealtimeDetailVo() {
    }

    public DeviceCoreRealtimeDetailVo(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
