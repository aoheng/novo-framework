package com.novo.data.redis;

import com.novo.data.redis.bean.DeviceCommand;
import com.novo.data.redis.bean.RedisSession;
import com.novo.data.redis.bean.RedisTsObject;
import com.novo.data.redis.bean.SessionDataType;
import com.novo.data.redis.config.RedisClient;
import com.novo.data.redis.config.RedisContants;
import com.novo.data.redis.config.RedisObject;
import com.novo.data.redis.util.SessionUtils;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.util.JacksonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.novo.data.redis.config.RedisContants.KEY_PREFIX_DEVICE_PARAM_MAP;
import static com.novo.data.redis.config.RedisContants.KEY_PREFIX_USER_RES_MAP;

public class NovoRedisTemplate extends AbstractRedisService implements RedisService {


    private static final Logger LOG = LoggerFactory.getLogger(NovoRedisTemplate.class);

    @Autowired
    private RedisClient redisClient;


    /**
     * ------------------------ Session  -----------------------------
     */

    @Override
    public void del(RedisSession session) {
        redisClient.del(SessionUtils.getKey(session));
    }

    @Override
    public void expire(RedisSession session, Integer expireSeconds) {
        redisClient.expire(SessionUtils.getKey(session), expireSeconds);
    }

    @Override
    public <T> T get(RedisSession session, Class<T> clazz) {
        String value = redisClient.get(SessionUtils.getKey(session));
        if (value == null) {
            return null;
        }
        return JacksonUtils.json2pojo(value, clazz);
    }

    @Override
    public <T> void set(final RedisSession session, T obj, Integer expireSeconds) {
        redisClient.set(SessionUtils.getKey(session), JacksonUtils.obj2json(obj));
        if (expireSeconds != null) {
            this.expire(session, expireSeconds);
        }
    }

    @Override
    public <T> void set(final RedisSession session, T obj) {
        this.set(session, obj, null);
    }

    /** ------------------------ 用户参数 ----------------------------- */
    /**
     * 删除用户资源Map
     */
    @Override
    public void removeUserResMap(String sessionId) {
        redisClient.del(KEY_PREFIX_USER_RES_MAP + sessionId);
    }

    /**
     * 设置用户资源Map
     */
    @Override
    public void setUserResMap(String sessionId, Map<String, String> paramMap, Integer expireSeconds) {
        redisClient.hmset(KEY_PREFIX_USER_RES_MAP + sessionId, paramMap);
        if(expireSeconds != null) {
            redisClient.expire(KEY_PREFIX_USER_RES_MAP + sessionId, expireSeconds);
        }
    }

    /**
     * 获取用户资源Map
     */
    @Override
    public Map<String, String> getUserResMap(String sessionId) {
        return redisClient.hgetAll(KEY_PREFIX_USER_RES_MAP + sessionId);
    }

    /**
     * 获取用户资源Map
     */
    @Override
    public List<String> getUserResMap(String sessionId, String... fields) {
        List<String> list = redisClient.hmget(KEY_PREFIX_USER_RES_MAP + sessionId, fields);
        if (list != null && list.stream().allMatch(Objects::isNull)) {
            return null;
        }
        return list;
    }

    /**
     * 是否存在用户资源Map
     */
    @Override
    public boolean isExistsUserResMap(String sessionId) {
        return redisClient.exists(KEY_PREFIX_USER_RES_MAP + sessionId);
    }

    /** ------------------------ 设备的心跳  ----------------------------- */
    /**
     * 设置设备心跳时间
     */
    @Override
    public void setDeviceHeartbeat(String imeiCode, long activeTimestamp) {
        redisClient.hset(RedisContants.KEY_PREFIX_DEVICE_HEARTBEAT, imeiCode, String.valueOf(activeTimestamp));
    }

    /**
     * 获取设备的心跳，返回最后心跳时间
     */
    @Override
    public Long getDeviceHeartbeat(String imeiCode) {
        String s = redisClient.hget(RedisContants.KEY_PREFIX_DEVICE_HEARTBEAT, imeiCode);
        if(s == null) {
            return null;
        }
        return Long.parseLong(s);
    }

    /** ------------------------ 设备的在线状态  ----------------------------- */

    /**
     * 设置设备在线
     */
    @Override
    public void setDeviceOnline(String imeiCode, long activeTimestamp) {
        redisClient.hset(RedisContants.KEY_PREFIX_DEVICE_ONLINE, imeiCode, String.valueOf(activeTimestamp));
    }

    /**
     * 获取设备在线，返回最后活动时间，若为NULl表示设备不在线
     */
    @Override
    public Long getDeviceOnline(String imeiCode) {
        String s = redisClient.hget(RedisContants.KEY_PREFIX_DEVICE_ONLINE, imeiCode);
        if (s == null) {
            return null;
        }
        return Long.parseLong(s);
    }

    /**
     * 移除设备在线
     */
    @Override
    public void removeDeviceOnline(String imeiCode) {
        redisClient.hdel(RedisContants.KEY_PREFIX_DEVICE_ONLINE, imeiCode);
    }

    /** ------------------------ 设备的ClientId  ----------------------------- */

    /**
     * 设置设备的ClientId
     */
    @Override
    public void setDeviceClientId(String imeiCode, String clientId) {
        redisClient.hset(RedisContants.KEY_PREFIX_DEVICE_CLIENT, imeiCode, clientId);
    }

    /**
     * 获取设备的ClientId
     */
    @Override
    public String getDeviceClientId(String imeiCode) {
        return redisClient.hget(RedisContants.KEY_PREFIX_DEVICE_CLIENT, imeiCode);
    }

    /**
     * 删除设备的ClientId
     */
    @Override
    public void removeDeviceClientId(String imeiCode) {
        redisClient.hdel(RedisContants.KEY_PREFIX_DEVICE_CLIENT, imeiCode);
    }

    /** ------------------------ 设备的参数MAP ----------------------------- */

    /**
     * 删除设备的参数MAP
     */
    @Override
    public void removeParamMap(String imeiCode) {
        redisClient.del(KEY_PREFIX_DEVICE_PARAM_MAP + imeiCode);
    }

    /**
     * 设置设备的参数MAP（单个）
     */
    @Override
    public void setDeviceParamMap(String imeiCode, String field, RedisTsObject value) {
        redisClient.hset(KEY_PREFIX_DEVICE_PARAM_MAP + imeiCode, field, JacksonUtils.obj2json(value));
    }

    /**
     * 设置设备的参数MAP（批量）
     */
    @Override
    public void setDeviceParamMap(String imeiCode, Map<String, RedisTsObject> paramMap) {
        Map<String, String> map = new HashMap<>();
        paramMap.forEach((k, v) -> map.put(k, JacksonUtils.obj2json(v)));
        redisClient.hmset(KEY_PREFIX_DEVICE_PARAM_MAP + imeiCode, map);
    }

    /**
     * 获取设备的参数MAP
     */
    @Override
    public Map<String, RedisTsObject> getDeviceParamMap(String imeiCode) {
        Map<String, String> map = redisClient.hgetAll(KEY_PREFIX_DEVICE_PARAM_MAP + imeiCode);
        Map<String, RedisTsObject> paramMap = new HashMap<>();
        map.forEach((k, v) -> paramMap.put(k, JacksonUtils.json2pojo(v, RedisTsObject.class)));
        return paramMap;
    }

    /**
     * 获取设备的参数MAP
     */
    @Override
    public Map<String, RedisTsObject> getDeviceParamMap(String imeiCode, String... fields) {
        List<String> vals = redisClient.hmget(KEY_PREFIX_DEVICE_PARAM_MAP + imeiCode, fields);
        Map<String, RedisTsObject> paramMap = new HashMap<>();
        for (int i = 0, max = fields.length; i < max; i++) {
            String field = fields[i];
            String json = vals.get(i);
            if (StringUtils.isNotBlank(json)) {
                paramMap.put(field, JacksonUtils.json2pojo(json, RedisTsObject.class));
            } else {
                paramMap.put(field, new RedisTsObject());
            }
        }
        return paramMap;
    }

    /** ------------------------ 设备基础信息  ----------------------------- */

    /**
     * 设置设备基础信息
     */
    @Override
    public void setDeviceBasicInfo(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_BASIC_INFO + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取设备基础信息
     */
    @Override
    public RedisObject getDeviceBasicInfo(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_BASIC_INFO + imeiCode);
    }

    /**
     * 删除设备基础信息
     */
    @Override
    public void removeDeviceBasicInfo(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_BASIC_INFO + imeiCode);
    }

    /**
     * 设置设备基础信息的过期时间
     */
    @Override
    public void expireDeviceBasicInfo(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_BASIC_INFO + imeiCode, expireSeconds);
    }

    /** ------------------------ 设备的Session  ----------------------------- */

    /**
     * 设置设备的Session
     */
    @Override
    public void setDeviceSession(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_SESSION + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取设备的Session
     */
    @Override
    public RedisObject getDeviceSession(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_SESSION + imeiCode);
    }

    /**
     * 删除设备的Session
     */
    @Override
    public void removeDeviceSession(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_SESSION + imeiCode);
    }

    /**
     * 设置Session过期时间
     */
    @Override
    public void expireDeviceSession(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_SESSION + imeiCode, expireSeconds);
    }

    /** ------------------------ 设备充值的命令  ----------------------------- */

    /**
     * 设置设备充值的命令
     */
    @Override
    public void setDeviceRechargeCommand(String imeiCode, DeviceCommand command) {
        redisClient.hset(RedisContants.KEY_PREFIX_DEVICE_CMD_RECHARGE, imeiCode, JacksonUtils.obj2json(command));
    }

    /**
     * 获取设备充值的命令
     */
    @Override
    public DeviceCommand getDeviceRechargeCommand(String imeiCode) {
        String json = redisClient.hget(RedisContants.KEY_PREFIX_DEVICE_CMD_RECHARGE, imeiCode);
        if (StringUtils.isBlank(json)) {
            return null;
        }
        DeviceCommand cmd = JacksonUtils.json2pojo(json, DeviceCommand.class);
        return cmd;
    }

    /**
     * 移除设备充值的命令
     */
    @Override
    public void removeDeviceRechargeCommand(String imeiCode) {
        redisClient.hdel(RedisContants.KEY_PREFIX_DEVICE_CMD_RECHARGE, imeiCode);
    }

    /**
     * 设置设备滤芯重置的命令
     */
    @Override
    public void setDevicePpfResetCommand(long msgId, DeviceCommand command) {
        redisClient.hset(RedisContants.KEY_PREFIX_DEVICE_CMD_PPF_RESET, msgId + "", JacksonUtils.obj2json(command));
    }

    /**
     * 获取设备滤芯重置的命令
     */
    @Override
    public DeviceCommand getDevicePpfResetCommand(long msgId) {
        String json = redisClient.hget(RedisContants.KEY_PREFIX_DEVICE_CMD_PPF_RESET, msgId + "");
        if (StringUtils.isBlank(json)) {
            return null;
        }

        DeviceCommand cmd = JacksonUtils.json2pojo(json, DeviceCommand.class);
        return cmd;
    }

    /**
     * 移除设备滤芯重置的命令
     */
    @Override
    public void removeDevicePpfResetCommand(long msgId) {
        redisClient.hdel(RedisContants.KEY_PREFIX_DEVICE_CMD_PPF_RESET, msgId + "");
    }

    /** ------------------------ 设备的实时信息 ----------------------------- */

    /**
     * 设置设备的实时信息
     */
    @Override
    public void setDeviceRealtime(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_REALTIME + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取设备的实时信息
     */
    @Override
    public RedisObject getDeviceRealtime(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_REALTIME + imeiCode);
    }

    /**
     * 删除设备的实时信息
     */
    @Override
    public void removeDeviceRealtime(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_REALTIME + imeiCode);
    }

    /**
     * 设置实时信息的过期时间
     */
    @Override
    public void expireDeviceRealtime(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_REALTIME + imeiCode, expireSeconds);
    }

    /** ------------------------ 设备的事件  ----------------------------- */

    /**
     * 设置设备的事件
     */
    @Override
    public void setDeviceEvent(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_EVENT + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取设备的事件
     */
    @Override
    public RedisObject getDeviceEvent(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_EVENT + imeiCode);
    }

    /**
     * 删除设备的事件
     */
    @Override
    public void removeDeviceREvent(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_EVENT + imeiCode);
    }

    /**
     * 设置设备的事件的过期时间
     */
    @Override
    public void expireDeviceEvent(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_EVENT + imeiCode, expireSeconds);
    }

    /** ------------------------ 设备的服务信息  ----------------------------- */

    /**
     * 删除设备的服务信息
     */
    @Override
    public void removeDeviceServiceInfo(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_SERVICE_INFO + imeiCode);
    }

    /**
     * 设置设备的服务信息的过期时间
     */
    @Override
    public void expireDeviceServiceInfo(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_SERVICE_INFO + imeiCode, expireSeconds);
    }

    /**
     * 获取设备的服务信息
     */
    @Override
    public RedisObject getDeviceServiceInfo(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_SERVICE_INFO + imeiCode);
    }

    /**
     * 设置设备的服务信息
     */
    @Override
    public void setDeviceServiceInfo(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_SERVICE_INFO + imeiCode, obj, expireSeconds);
    }


    /** ------------------------ 设备的告警信息 ----------------------------- */

    /**
     * 设置设备的实时信息
     */
    @Override
    public void setDeviceWarn(String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_WARN + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取设备的实时信息
     */
    @Override
    public RedisObject getDeviceWarn(String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_WARN + imeiCode);
    }

    /**
     * 删除设备的实时信息
     */
    @Override
    public void removeDeviceWarn(String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_WARN + imeiCode);
    }

    /**
     * 设置实时信息的过期时间
     */
    @Override
    public void expireDeviceWarn(String imeiCode, Integer expireSeconds) {
        expire(RedisContants.KEY_PREFIX_DEVICE_WARN + imeiCode, expireSeconds);
    }

    /** ------------------------ 未激活的设备信息 ----------------------------- */

    /**
     * 设置未激活的设备的信息
     */
    @Override
    public void setDeviceActivate(String protocolType, String imeiCode, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_DEVICE_ACTIVATE + protocolType + imeiCode, obj, expireSeconds);
    }

    /**
     * 获取未激活的设备的信息
     */
    @Override
    public RedisObject getDeviceActivate(String protocolType, String imeiCode) {
        return get(RedisContants.KEY_PREFIX_DEVICE_ACTIVATE + protocolType + imeiCode);
    }

    /**
     * 删除未激活的设备信息
     */
    @Override
    public void removeDeviceActivate(String protocolType, String imeiCode) {
        del(RedisContants.KEY_PREFIX_DEVICE_ACTIVATE + protocolType + imeiCode);
    }

    //*****************************************redis省市区************************************************************


    @Override
    public void setAddressRedis(String key, RedisObject obj, Integer expireSeconds) {
        set(key, obj, expireSeconds);
    }


    @Override
    public RedisObject getAddressRedis(String key) {
        return get(key);
    }


    /************************vivo token**********************************************/
    @Override
    public void setAccessToken(String openId, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_ACCESS_TOKEN + openId, obj, expireSeconds);
    }
    @Override
    public RedisObject getAccessToken(String openId) {
        return get(RedisContants.KEY_PREFIX_ACCESS_TOKEN + openId);
    }
    @Override
    public void removeAccessToken(String openId) {
        del(RedisContants.KEY_PREFIX_ACCESS_TOKEN + openId);
    }
    @Override
    public void setRefreshToken(String openId, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_REFRESH_TOKEN + openId, obj, expireSeconds);
    }
    @Override
    public RedisObject getRefreshToken(String openId) {
        return get(RedisContants.KEY_PREFIX_REFRESH_TOKEN + openId);
    }
    @Override
    public void removeRefreshToken(String openId) {
        del(RedisContants.KEY_PREFIX_REFRESH_TOKEN + openId);
    }

    @Override
    public void setAccessTokenCP(String openId, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_ACCESS_TOKENCP+ openId, obj, expireSeconds);
    }

    @Override
    public RedisObject getAccessTokenCP(String openId) {
        return get(RedisContants.KEY_PREFIX_ACCESS_TOKENCP + openId);
    }

    @Override
    public void removeAccessTokenCP(String openId) {
        del(RedisContants.KEY_PREFIX_ACCESS_TOKENCP + openId);
    }

    @Override
    public void setOrgCodeByOpenId(String openId, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_OPENID_ORGCODE+ openId, obj, expireSeconds);
    }

    @Override
    public RedisObject getOrgCodeByOpenId(String openId) {
        return get(RedisContants.KEY_PREFIX_OPENID_ORGCODE + openId);
    }

    @Override
    public void removeOrgCodeByOpenId(String openId) {
        del(RedisContants.KEY_PREFIX_OPENID_ORGCODE + openId);
    }

    @Override
    public void setSmsCodeByMobile(String mobile, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_SMS_MOBILE_CODE+ mobile, obj, expireSeconds);
    }

    @Override
    public RedisObject getSmsCodeByMobile(String mobile) {
        return get(RedisContants.KEY_PREFIX_SMS_MOBILE_CODE + mobile);
    }

    @Override
    public void removeSmsCodeByMobile(String mobile) {
        del(RedisContants.KEY_PREFIX_SMS_MOBILE_CODE + mobile);
    }


    @Override
    public <T> void reSet(T obj, String sessionId, Integer expireSeconds) {

        try {
            RedisSession loginOperatorRedis = new RedisSession(SessionDataType.USER, sessionId);
            redisClient.set(SessionUtils.getKey(loginOperatorRedis), JacksonUtils.obj2json(obj));
            if (expireSeconds != null) {
                this.expire(loginOperatorRedis, expireSeconds);
                LOG.info("终止redis的时间");
            }
            if (expireSeconds == null) {
                expireSeconds = new Integer(30 * 60 * 1000);
                this.expire(loginOperatorRedis, expireSeconds);
                LOG.info("重新设置redis时间");
            }
        } catch (Exception e) {
            LOG.error(e.getMessage());
            throw new SystemException();
        }

    }

    @Override
    public <T> void reSet(T obj, String sessionId) {
        this.reSet(obj, sessionId, null);
    }

    /** ------------------------ 删除该IMEI所有KEY  ----------------------------- */

    /**
     * 删除IMEI所有KEY
     */
    @Override
    public void removeDeviceKey(String imeiCode) {
        removeDeviceOnline(imeiCode);
        removeDeviceClientId(imeiCode);
        removeParamMap(imeiCode);
        removeDeviceBasicInfo(imeiCode);
        removeDeviceSession(imeiCode);
        removeDeviceRealtime(imeiCode);
        removeDeviceREvent(imeiCode);
        removeDeviceRechargeCommand(imeiCode);
    }

    @Override
    public void setUserResCodeRedis(String key, RedisObject obj, Integer expireSeconds) {
        set(key, obj, expireSeconds);
    }


    /** ------------------------ 天猫精灵授权操作  ----------------------------- */

    /**
     * 设置登录用户存的code
     */
    @Override
    public void setAliCustomerByCode(String code, RedisObject obj, Integer expireSeconds) {
        set(RedisContants.KEY_PREFIX_ALIGENIE_CODE + code, obj, expireSeconds);
    }

    /**
     * 获取登录用户存的code
     */
    @Override
    public RedisObject getAliCustomerByCode(String code) {
        return get(RedisContants.KEY_PREFIX_ALIGENIE_CODE + code);
    }

    /**
     * 删除登录用户存的code
     */
    @Override
    public void removeAliCustomerByCode(String code) {
        redisClient.del(RedisContants.KEY_PREFIX_ALIGENIE_CODE + code);
    }

    @Override
    public void removeAddress(String str) {
        redisClient.del(str);
    }

}
