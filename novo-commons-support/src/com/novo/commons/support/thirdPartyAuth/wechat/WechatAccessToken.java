package com.novo.commons.support.thirdPartyAuth.wechat;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/8/28
 */
public class WechatAccessToken implements Serializable {
    private static final long serialVersionUID = 1L;

    /**接口调用凭证*/
    private String access_token;
    /**access_token接口调用凭证超时时间，单位（秒）*/
    private String expiresIn;
    /**用户刷新access_token*/
    private String refresh_token;
    /**授权用户唯一标识*/
    private String openid;
    /**用户授权的作用域，使用逗号（,）分隔*/
    private String scope;
    /**当且仅当该移动应用已获得该用户的userinfo授权时，才会出现该字段*/
    private String unionid;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
