package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import com.novo.commons.support.openApi.aliGenie.operate.AliGenieErrorResponseType;

/**
 * @author MickeyChen
 * @date 2020/12/21
 */
public class ControlErrorResponseVO {

    private String deviceId;
    private String errorCode;
    private String message;

    public void writeMessage(AliGenieErrorResponseType responseType) {
        this.errorCode = responseType.getErrorCode();
        this.message = responseType.getMessage();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
