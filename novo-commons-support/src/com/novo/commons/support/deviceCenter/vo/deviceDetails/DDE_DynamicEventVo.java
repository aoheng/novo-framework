package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author RaoYongBin on 2020/5/26
 */
public class DDE_DynamicEventVo {

    /** 上报时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间",fieldName = "currentTime",type = "date")
    private Date currentTime;

    /** 事件 */
    @FieldDetail(name = "事件",fieldName = "events")
    private List<String> events;


    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
