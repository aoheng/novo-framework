package com.novo.data.redis.config;

/**
 * @author Aoheng on 2021/01/30.
 * Redis常量
 */
public interface RedisContants {
    /** ------------------------ Mode  ----------------------------- */

    /**
     * 单机模式
     */
    String MODE_STANDALONE = "standalone";

    /**
     * 分片模式
     */
    String MODE_SHARDED = "sharded";

    /**
     * 哨兵模式
     */
    String MODE_SENTINEL = "sentinel";


    /** ------------------------ Key前缀  ----------------------------- */

    /**
     * 设备的在线状态的Key前缀
     */
    String KEY_PREFIX_DEVICE_HEARTBEAT = "dev.heartbeat";

    /**
     * 设备的在线状态的Key前缀
     */
    String KEY_PREFIX_DEVICE_ONLINE = "dev.online";

    /**
     * 设备的参数表的Key前缀
     */
    String KEY_PREFIX_DEVICE_PARAM_MAP = "dev.paramMap:";

    String KEY_PREFIX_USER_RES_MAP= "user.res:";

    /**
     * 设备的CliendId前缀
     */
    String KEY_PREFIX_DEVICE_CLIENT = "dev.client";

    /**
     * 设备的滤芯重置命令前缀
     */
    String KEY_PREFIX_DEVICE_CMD_PPF_RESET = "dev.cmd.ppfReset";

    /**
     * 设备的充值命令前缀
     */
    String KEY_PREFIX_DEVICE_CMD_RECHARGE = "dev.cmd.recharge";

    /**
     * 设备的基础信息前缀
     */
    String KEY_PREFIX_DEVICE_BASIC_INFO = "device:basicInfo:";

    /**
     * 设备事件的Key前缀
     */
    String KEY_PREFIX_DEVICE_EVENT = "device.event:";

    /**
     * 设备Session的Key前缀
     */
    String KEY_PREFIX_DEVICE_SESSION = "device.session:";

    /**
     * 设备实时信息的Key前缀
     */
    String KEY_PREFIX_DEVICE_REALTIME = "device.realTime:";

    /**
     * 设备服务信息的Key前缀
     */
    String KEY_PREFIX_DEVICE_SERVICE_INFO = "device.serviceInfo:";

    /**
     * 告警协议存入redis
     */
    String KEY_PREFIX_DEVICE_WARN = "device.warn:";

    /**
     * 设备未激活的Key前缀
     */
    String KEY_PREFIX_DEVICE_ACTIVATE = "device.activate:";

    /**
     * 设备未激活的Key前缀，tcp协议类型
     */
    String KEY_PREFIX_DEVICE_ACTIVATE_TCP = "tcp:";

    /**
     * 设备未激活的Key前缀，mqtt协议类型
     */
    String KEY_PREFIX_DEVICE_ACTIVATE_MQTT = "mqtt:";

    /**
     * 支付时保存订单支付金额，回调时删除
     */
    String KEY_PREFIX_ORDER_PAY = "order.serialno:";

    String KEY_PARAM_VERSION = "paramVersion";

    /** ------------------------ 过期时间  ----------------------------- */

    /**
     * 12小时的过期时间
     */
    int EXPIRE_HOUR_12 = 43200;

    /**
     * 1小时的过期时间
     */
    int EXPIRE_HOUR_1 = 3600;

    /**
     * 5分钟的过期时间
     */
    int EXPIRE_MIN_5 = 300;

    /**
     * 10分钟的过期时间
     */
    int EXPIRE_MIN_10 = 600;


    /** ------------------------ 地址redis  ----------------------------- */
    String KEY_PREFIX_ADDRESS_REDIS_VO = "address.redis.vo:";          //省市区vo
    String KEY_PREFIX_ADDRESS_REDIS_STRING = "address.redis.string:";  //省市区string，渠道商地址校验，如：广东省深圳市南山区
    String KEY_PREFIX_ADDRESS_REDIS_TREE = "address.redis.tree:";      //省市区树形结构
    String KEY_PREFIX_ADDRESS_REDIS_TREE_VO = "address.redis.tree.vo:";//省市区树形结构，province_list,county_list,city_list:["440100": "广州市","370200": "青岛市"]
    String ADDRESS = "address";                    //存储到redis中省市区的key值

    /** ------------------------ 天猫精灵授权操作  ----------------------------- */

    /** * 天猫精灵用户登录对应的code */
    String KEY_PREFIX_ALIGENIE_CODE = "aliGenie.code:";

    /******************token************************************/
    //novoyun accessToken
    String KEY_PREFIX_ACCESS_TOKEN = "iot.novoyun.access.token:";
    //novoyun refreshToken
    String KEY_PREFIX_REFRESH_TOKEN = "iot.novoyun.refresh.token:";
    //vivo refreshToken
    String KEY_PREFIX_ACCESS_TOKENCP = "iot.vivo.access.tokenCP:";
    //vivo openid和组织编码orgcode
    String KEY_PREFIX_OPENID_ORGCODE = "iot.vivo.openid.orgcode:";

    //活动手机认证码
    String KEY_PREFIX_SMS_MOBILE_CODE="mobile.code:";

}
