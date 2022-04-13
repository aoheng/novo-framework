package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import java.util.Map;

/**
 * @author MickeyChen
 * @date 2020/12/17
 */
public class ActionVO {

    private String name;
    private Map<String, String> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
