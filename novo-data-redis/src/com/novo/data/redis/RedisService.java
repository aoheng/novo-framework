package com.novo.data.redis;

import com.novo.data.redis.bean.DeviceCommand;
import com.novo.data.redis.bean.RedisSession;
import com.novo.data.redis.bean.RedisTsObject;
import com.novo.data.redis.config.RedisObject;

import java.util.List;
import java.util.Map;

public interface RedisService {


    /** ------------------------ Session  ----------------------------- */
    /**
     * 删除
     */
    void del(RedisSession session);

    /**
     * 设置过期时间
     */
    void expire(RedisSession session, Integer expireSeconds);

    /**
     * 获取
     */
    <T> T get(RedisSession session, Class<T> clazz);

    /**
     * 设置
     */
    <T> void set(RedisSession session, T obj, Integer expireSeconds);

    <T> void set(RedisSession session, T obj);

    /** ------------------------ 用户参数 ----------------------------- */

    /**
     * 删除用户资源Map
     */
    void removeUserResMap(String sessionId);

    /**
     * 设置用户资源Map
     */
    void setUserResMap(String sessionId, Map<String, String> paramMap, Integer expireSeconds);

    /**
     * 获取用户资源Map
     */
    Map<String, String> getUserResMap(String sessionId);

    /**
     * 获取用户资源Map
     */
    List<String> getUserResMap(String sessionId, String... fields);

    /**
     * 是否存在用户资源Map
     */
    boolean isExistsUserResMap(String sessionId);


    /** ------------------------ 设备的心跳  ----------------------------- */

    /**
     * 设置设备心跳时间
     */
    void setDeviceHeartbeat(String imeiCode, long activeTimestamp);

    /**
     * 获取设备的心跳，返回最后心跳时间
     */
    Long getDeviceHeartbeat(String imeiCode);

    /** ------------------------ 设备的在线状态  ----------------------------- */

    /**
     * 设置设备在线
     */
    void setDeviceOnline(String imeiCode, long activeTimestamp);

    /**
     * 获取设备在线，返回最后活动时间，若为NULl表示设备不在线
     */
    Long getDeviceOnline(String imeiCode);

    /**
     * 移除设备在线
     */
    void removeDeviceOnline(String imeiCode);

    /** ------------------------ 设备的ClientId  ----------------------------- */

    /**
     * 设置设备的ClientId
     */
    void setDeviceClientId(String imeiCode, String clientId);

    /**
     * 获取设备的ClientId
     */
    String getDeviceClientId(String imeiCode);

    /**
     * 删除设备的ClientId
     */
    void removeDeviceClientId(String imeiCode);

    /** ------------------------ 设备的参数MAP ----------------------------- */

    /**
     * 删除设备的参数MAP
     */
    void removeParamMap(String imeiCode);

    /**
     * 设置设备的参数MAP（单个）
     */
    void setDeviceParamMap(String imeiCode, String field, RedisTsObject value);

    /**
     * 设置设备的参数MAP（批量）
     */
    void setDeviceParamMap(String imeiCode, Map<String, RedisTsObject> paramMap);

    /**
     * 获取设备的参数MAP
     */
    Map<String, RedisTsObject> getDeviceParamMap(String imeiCode);

    /**
     * 获取设备的参数MAP
     */
    Map<String, RedisTsObject> getDeviceParamMap(String imeiCode, String... fields);

    /** ------------------------ 设备基础信息  ----------------------------- */

    /**
     * 设置设备基础信息
     */
    void setDeviceBasicInfo(String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取设备基础信息
     */
    RedisObject getDeviceBasicInfo(String imeiCode);

    /**
     * 删除设备基础信息
     */
    void removeDeviceBasicInfo(String imeiCode);

    /**
     * 设置设备基础信息的过期时间
     */
    void expireDeviceBasicInfo(String imeiCode, Integer expireSeconds);

    /** ------------------------ 设备的Session  ----------------------------- */

    /**
     * 设置设备的Session
     */
    void setDeviceSession(String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取设备的Session
     */
    RedisObject getDeviceSession(String imeiCode);

    /**
     * 删除设备的Session
     */
    void removeDeviceSession(String imeiCode);

    /**
     * 设置设备的Session过期时间
     */
    void expireDeviceSession(String imeiCode, Integer expireSeconds);

    /** ------------------------ 设备的命令  ----------------------------- */

    /**
     * 设置设备充值的命令
     */
    void setDeviceRechargeCommand(String imeiCode, DeviceCommand command);

    /**
     * 获取设备充值的命令
     */
    DeviceCommand getDeviceRechargeCommand(String imeiCode);

    /**
     * 移除设备充值的命令
     */
    void removeDeviceRechargeCommand(String imeiCode);

    /**
     * 设置设备滤芯重置的命令
     */
    void setDevicePpfResetCommand(long msgId, DeviceCommand command);

    /**
     * 获取设备滤芯重置的命令
     */
    DeviceCommand getDevicePpfResetCommand(long msgId);

    /**
     * 移除设备滤芯重置的命令
     */
    void removeDevicePpfResetCommand(long msgId);

    /** ------------------------ 设备的实时信息 ----------------------------- */

    /**
     * 设置设备的实时信息
     */
    void setDeviceRealtime(String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取设备的实时信息
     */
    RedisObject getDeviceRealtime(String imeiCode);

    /**
     * 删除设备的实时信息
     */
    void removeDeviceRealtime(String imeiCode);

    /**
     * 设置设备的实时信息的过期时间
     */
    void expireDeviceRealtime(String imeiCode, Integer expireSeconds);

    /** ------------------------ 设备的事件  ----------------------------- */

    /**
     * 设置设备的事件
     */
    void setDeviceEvent(String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取设备的事件
     */
    RedisObject getDeviceEvent(String imeiCode);

    /**
     * 删除设备的事件
     */
    void removeDeviceREvent(String imeiCode);

    /**
     * 设置设备的事件的过期时间
     */
    void expireDeviceEvent(String imeiCode, Integer expireSeconds);

    /** ------------------------ 设备的服务信息  ----------------------------- */

    /**
     * 删除设备的服务信息
     */
    void removeDeviceServiceInfo(String imeiCode);

    /**
     * 设置设备的服务信息的过期时间
     */
    void expireDeviceServiceInfo(String imeiCode, Integer expireSeconds);

    /**
     * 获取设备的服务信息
     */
    RedisObject getDeviceServiceInfo(String imeiCode);

    /**
     * 设置设备的服务信息
     */
    void setDeviceServiceInfo(String imeiCode, RedisObject obj, Integer expireSeconds);

    /** ------------------------ 设备的告警信息  ----------------------------- */

    /**
     * 设置设备的告警信息
     */
    void setDeviceWarn(String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取设备的告警信息
     */
    RedisObject getDeviceWarn(String imeiCode);

    /**
     * 删除设备的告警信息
     */
    void removeDeviceWarn(String imeiCode);

    /**
     * 设置设备的告警信息的过期时间
     */
    void expireDeviceWarn(String imeiCode, Integer expireSeconds);

    /** ------------------------ 未激活的设备信息  ----------------------------- */

    /**
     * 设置未激活的设备的信息
     */
    void setDeviceActivate(String protocolType, String imeiCode, RedisObject obj, Integer expireSeconds);

    /**
     * 获取未激活的设备的信息
     */
    RedisObject getDeviceActivate(String protocolType, String imeiCode);

    /**
     * 删除未激活的设备信息
     */
    void removeDeviceActivate(String protocolType, String imeiCode);


    //************************************省市区*****************************************************************

    /**
     * 设置对象，过期时间
     */
    void setAddressRedis(String key, RedisObject obj, Integer expireSeconds);

    /**
     * 根据key获取value值
     */
    RedisObject getAddressRedis(String key);


    //**************************************渠道商设置operatorId覆盖原redis信息***************************************

    /**
     * 覆盖原redis的信息
     */
    <T> void reSet(T obj, String sessionId, Integer expireSeconds);

    <T> void reSet(T obj, String sessionId);

    /** ------------------------ 删除该IMEI所有KEY  ----------------------------- */

    /** 删除IMEI所有KEY */
    void removeDeviceKey(String imeiCode);

    /**
     * 设置对象，过期时间
     */
    void setUserResCodeRedis(String key, RedisObject obj, Integer expireSeconds);

    /** ------------------------ 天猫精灵授权操作  ----------------------------- */

    /** 设置登录用户存的code */
    void setAliCustomerByCode(String code, RedisObject obj, Integer expireSeconds);

    /** 获取登录用户存的code */
    RedisObject getAliCustomerByCode(String code);

    /** 删除登录用户存的code */
    void removeAliCustomerByCode(String code);

    void removeAddress(String str);

    /*************novoyun AccessToken******************/
    void setAccessToken(String openId, RedisObject obj, Integer expireSeconds);
    /** 获取token */
    RedisObject getAccessToken(String openId);
    /** 删除token*/
    void removeAccessToken(String openId);
   /**************vivo refreshToken************/
    void setRefreshToken(String openId, RedisObject obj, Integer expireSeconds);
    /** 获取token */
    RedisObject getRefreshToken(String openId);
    /** 删除token*/
    void removeRefreshToken(String openId);

    /**************vivo accessTokenCP******************************/
    /**设置***/
    void setAccessTokenCP(String openId, RedisObject obj, Integer expireSeconds);
    /** 获取token */
    RedisObject getAccessTokenCP(String openId);
    /** 删除token*/
    void removeAccessTokenCP(String openId);
    /**设置***/
    void setOrgCodeByOpenId(String openId, RedisObject obj, Integer expireSeconds);
    /** 获取token */
    RedisObject getOrgCodeByOpenId(String openId);
    /** 删除token*/
    void removeOrgCodeByOpenId(String openId);

    //**********************************短信发送*******************************************************************
    /*********************短信认证码**************************************/
    //根据key设置value
    void setSmsCodeByMobile(String mobile, RedisObject obj, Integer expireSeconds);
    //根据key获取value值
    RedisObject getSmsCodeByMobile(String mobile);
    /** 删除短信*/
    void removeSmsCodeByMobile(String mobile);


}
