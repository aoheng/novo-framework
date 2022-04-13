package com.novo.data.redis;

import com.novo.data.redis.config.RedisClient;
import com.novo.data.redis.config.RedisObject;
import com.novo.framework.core.util.JacksonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aoheng on 2021/01/30.
 */
public abstract class AbstractRedisService {

    @Autowired
    private RedisClient redisClient;

    /** 删除 */
    protected void del(String key) {
        redisClient.del(key);
    }

    /** 设置过期时间 */
    protected void expire(String key, Integer expireSeconds) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("redis设置过期失败，key不能为空");
        }
        redisClient.expire(key, expireSeconds);
    }

    /** 获取 */
    protected RedisObject get(String key) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("redis获取值失败，key不能为空");
        }

        String json = redisClient.get(key);
        if (StringUtils.isBlank(json)) {
            return null;
        }

        RedisObject obj = JacksonUtils.json2pojo(json, RedisObject.class);
        return obj;
    }

    /** 设置 */
    protected void set(String key, RedisObject obj, Integer expireSeconds) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("redis设置值失败，key不能为空");
        }

        String json = JacksonUtils.obj2json(obj);
        redisClient.set(key, json);

        if (expireSeconds != null) {
            expire(key, expireSeconds);
        }
    }

    /** 是否存在 */
    protected boolean exists(String key) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("redis获取值失败，key不能为空");
        }

        return redisClient.exists(key);
    }
}
