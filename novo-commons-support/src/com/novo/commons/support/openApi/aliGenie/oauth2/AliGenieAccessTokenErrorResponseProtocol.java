package com.novo.commons.support.openApi.aliGenie.oauth2;

/**
 * @author MickeyChen
 * @date 2020/12/12
 */
public class AliGenieAccessTokenErrorResponseProtocol {

    private String error;
    private String error_description;

    public AliGenieAccessTokenErrorResponseProtocol(String error, String error_description) {
        this.error = error;
        this.error_description = error_description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }
}
