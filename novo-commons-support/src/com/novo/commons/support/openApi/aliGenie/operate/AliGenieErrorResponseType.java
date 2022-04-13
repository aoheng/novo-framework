package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * 与天猫精灵的参数必须一致
 * @author MickeyChen
 * @date 2020/12/24
 */
public enum AliGenieErrorResponseType {

    INVALIDATE_CONTROL_ORDER("INVALIDATE_CONTROL_ORDER", "invalidate control order"),
    SERVICE_ERROR("INVALIDATE_CONTROL_ORDER", null),
    DEVICE_NOT_SUPPORT_FUNCTION("DEVICE_NOT_SUPPORT_FUNCTION", "device not support"),
    INVALIDATE_PARAMS("INVALIDATE_PARAMS", "invalidate params"),
    DEVICE_IS_NOT_EXIST("DEVICE_IS_NOT_EXIST", "device is not exist"),
    IOT_DEVICE_OFFLINE("IOT_DEVICE_OFFLINE", "device is offline"),
    ACCESS_TOKEN_INVALIDATE("INVALIDATE_PARAMS", "access_token is invalidate"),


    ;

    private String errorCode;
    private String message;

    AliGenieErrorResponseType(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
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
