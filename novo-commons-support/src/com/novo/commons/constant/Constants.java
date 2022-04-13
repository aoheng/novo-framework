package com.novo.commons.constant;


/**
 * 公共常量
 */
public class Constants {

    //私有密钥key：产测接口安全私钥
    public static final String FACTORY_TEST_KEY = "6884623sd982h5df45d1e8w6q12q85y1";
    //私有密钥key：浩泽接口安全私钥
    public static final String OZNER_KEY = "y89re2w56w2q6e412n484z4s8e32w6q9";
    //私有密钥key：appsdk专用安全私钥
    public static final String APP_SDK_KEY = "6e1da52ac4e145ba8c04aaec01b5ef67";

    //*****************************************************************************************************
    
    /****************************app***************************************/
    //app秘钥
    public static final String APP_SIGN_KEY = "6e1da52ac4e145ba8c04aaec01b58888";

    //公共云超管
    public static final String NOVO_SUPER_ADMIN = "SUPPERADMIN";
    public static final String YQ_ORG_CODE = "0001";

    //*****************************************************************************************************

    //短信验证码
  	public static final String CODE_SMS = "mobile_code:";
    
    
    //省市区
    public static final String ADDRESS = "address";       //存储到redis中省市区的key值
    public static final String PROVINCE = "province";     //省份
    public static final String CITY = "city";             //城市
    public static final String AREA = "area";             //区

    public static final String REDIS_TREE_VO_PROVINCE_LIST = "province_list";//省份
    public static final String REDIS_TREE_VO_CITY_LIST = "city_list";        //城市
    public static final String REDIS_TREE_VO_AREA_LIST = "county_list";      //区


    //******************************************资源中西的常量***********************************************************
    public static final int NO_CONSTANT_ONE = 1;
    public static final int NO_CONSTANT_TWO = 2;
    public static final int NO_CONSTANT_THREE = 3;
    public static final int NO_CONSTANT_FOUR = 4;
    public static final int NO_CONSTANT_FIVE = 5;
    public static final int NO_CONSTANT_SIX = 6;
    public static final int NO_CONSTANT_SEVEN = 7;
    public static final int NO_CONSTANT_EIGHT = 8;
    public static final int NO_CONSTANT_NINE = 9;
    
    //************************************工单类型*****************************************************************
    public static final String SERVICE_INSTALL = "100000000";//安装
    public static final String SERVICE_AFTERSALE = "123"; //滴恩售后 
    public static final String SERVICE_TJ = "123000001"; //滴恩售后  退机（123000001）
    public static final String SERVICE_YJ = "123000003"; //滴恩售后  移机（123000003）
    public static final String SERVICE_WX = "123000007"; //滴恩售后  维修（123000007）
    public static final String SERVICE_HX = "123000008"; //滴恩售后  换芯（123000008）
    
    public static final String SERVICE_NAME_INSTALL = "安装服务";//安装
    public static final String SERVICE_NAME_TJ = "退机服务"; //滴恩售后  移机（123000001）
    public static final String SERVICE_NAME_YJ = "移机服务"; //滴恩售后  移机（123000003）
    public static final String SERVICE_NAME_WX = "维修"; //滴恩售后  维修（123000007）
    public static final String SERVICE_NAME_HX = "更换滤芯"; //滴恩售后  换芯（123000008）
}
