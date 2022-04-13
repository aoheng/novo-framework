package com.novo.commons.support.deviceCenter.protocol;

/**
 * @author MickeyChen
 * @date 2020/5/10
 */
public class NbiotCallbackResultProtocol {

    private String deviceId;

    private String commandId;

    private Object result;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
