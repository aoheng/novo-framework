package com.novo.commons.support.deviceCenter.vo.nbiot;

/**
 * @author MickeyChen
 * @date 2020/5/7
 */
public class Services {

    private String serviceId;
    private String serviceType;
    private ServicesData data;
    private String eventTime;
    private String serviceInfo;


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ServicesData getData() {
        return data;
    }

    public void setData(ServicesData data) {
        this.data = data;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }
}
