package com.novo.commons.support.thirdPartyAuth.wechat;

/**
 * @author BinksRao on 2020/8/30
 */
public interface WechatConstant {

    String orgCode = "orgCode";
    String appId = "appId";
    String secret = "secret";
    String code = "code";
    String openId = "openId";
    String sourceType = "sourceType";
    String mobile = "mobile";
    String signCode = "signCode";
    String redirectUri = "redirectUri";

    /**请求来源--网站应用*/
    Integer WC_SOURCE_TYPE_WEB = 1;
    /**请求来源--移动应用APP*/
    Integer WC_SOURCE_TYPE_APP = 2;
    /**请求来源--公众号*/
    Integer WC_SOURCE_TYPE_PUB = 3;
}
