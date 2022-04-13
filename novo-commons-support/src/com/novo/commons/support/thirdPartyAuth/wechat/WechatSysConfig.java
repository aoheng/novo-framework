package com.novo.commons.support.thirdPartyAuth.wechat;

/**
 * @author BinksRao on 2020/8/30
 */
public interface WechatSysConfig {

    /**网站应用appid*/
    String WX_WEB_APPID = "WX_WEB_APPID";
    /**网站应用secret*/
    String WX_WEB_SECRET = "WX_WEB_SECRET";
    
    /**公众号appid*/
    String WECHAT_APPID = "WECHAT_APPID";
    /**公众号secret*/
    String WECHAT_SECRET = "WECHAT_SECRET";

    String WECHAT_KEY="WECHAT_KEY";
    /**商户号**/
    String WECHAT_MCHID = "WECHAT_MCHID";
    
    /**移动应用appid*/
    String WX_APP_APPID = "WX_APP_APPID";
    /**移动应用secret*/
    String WX_APP_SECRET = "WX_APP_SECRET";
    //微信公众号名称
    String WECHAT_ACCOUNT_NAME = "WECHAT_ACCOUNT_NAME";
    //微信公众号文章biz
    String WECHAT_ACCOUNT_BIZ = "WECHAT_ACCOUNT_BIZ";

    /**网站应用微信系统参数redis缓存key*/
    String REDIS_WX_SYSPARAM_KEY_WEB = "wechat_sysparam_web_";
    /**移动应用微信系统参数redis缓存key*/
    String REDIS_WX_SYSPARAM_KEY_APP = "wechat_sysparam_app_";
    
    
    
    /*****************浩优推送******************/
    //appKey
  	String HOYO_APPKEY = "HOYO_APPKEY";
    //appSecret
  	String HOYO_APPSECRET = "HOYO_APPSECRET";
    //付款对象
	String HOYO_PAYER = "HOYO_PAYER";
	//支付方式
	String HOYO_PAYWAY = "HOYO_PAYWAY";
	//工单来源ID
	String HOYO_SOURCE = "HOYO_SOURCE";
	//合作方ID
	String HOYO_ENTERPRISEID = "HOYO_ENTERPRISEID";
	//品牌ID
	String HOYO_COMPANYID = "HOYO_COMPANYID";
	//支付状态
	String HOYO_PAYSTATE = "HOYO_PAYSTATE";
	
	
	/*****************分时租赁支付URL******************/
	//分时租赁支付URL
	String PAY_URL = "PAY_URL";
	
	
	
}
