package com.novo.commons.support.openApi.aliGenie.oauth2;

/**
 * @author MickeyChen
 * @date 2020/12/12
 */
public class AliGenieAccessTokenSuccessResponseProtocol {

    private String access_token;
    private String refresh_token;
    private Long expires_in;

    public AliGenieAccessTokenSuccessResponseProtocol(String access_token, String refresh_token, Long expires_in) {
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.expires_in = expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public Long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in;
    }
}
