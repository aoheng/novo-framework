package com.novo.commons.support.thirdPartyAuth.wechat;

import java.io.Serializable;

/**
 * @author BinksRao on 2020/8/28
 */
public class WechatSysParam implements Serializable {
    private static final long serialVersionUID = 1L;

    /**app公众号id*/
    private String appId;
    /**app公众号秘钥*/
    private String secret;
    /**微信支付商户号*/
    private String mchId;
    private String wechatKey;
    /**app公众号组织代码*/
    private String orgCode;
    /**请求微信地址链接*/
    private String guideUri;
    /**请求微信扫一扫-签名*/
    private String signature;
    /**请求微信扫一扫-时间戳*/
    private String timestamp;
    /**请求微信扫一扫-随机串*/
    private String nonceStr;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getGuideUri() {
        return guideUri;
    }

    public void setGuideUri(String guideUri) {
        this.guideUri = guideUri;
    }

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getWechatKey() {
		return wechatKey;
	}

	public void setWechatKey(String wechatKey) {
		this.wechatKey = wechatKey;
	}

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }
}
