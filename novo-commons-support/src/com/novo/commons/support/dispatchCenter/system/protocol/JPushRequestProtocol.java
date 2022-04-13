package com.novo.commons.support.dispatchCenter.system.protocol;

/**
 * @author of Aoheng
 * @TODO 极光推送请求协议
 * @date 2020-04-26 13:51
 **/

public class JPushRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**
     * 极光注册id
     */
    private String registrationId;
    /**
     * 极光注册id集合
     */
    String[] registrationIds;
    /**
     * 类型（滤芯）
     */
    private String type;
    /**
     * 天数
     */
    private Integer days;

    public String getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
    public String[] getRegistrationIds() {
        return registrationIds;
    }
    public void setRegistrationIds(String[] registrationIds) {
        this.registrationIds = registrationIds;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
}
