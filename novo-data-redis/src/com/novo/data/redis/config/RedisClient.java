package com.novo.data.redis.config;

import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;
import redis.clients.util.Pool;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Aoheng on 2021/01/30 2020/02/05.
 */
public interface RedisClient {

    /** 查询所有匹配的KEY */
    Set<String> keys(String pattern);

    /** 遍历 */
    ScanResult<String> scan(String cursor);

    /** 遍历 */
    ScanResult<String> scan(String cursor, ScanParams scanParams);

    /** 为指定的KEY设置值及其过期时间。如果 KEY 已经存在， SETEX 命令将会替换旧的值。 */
    void setex(String key, int expireSeconds, String value);

    /** 指定的KEY不存在时，为KEY设置指定的值 */
    void setnx(String key, String value);

    /** set */
    void set(String key, String value);

    /** 根据KEY，获取字符串 */
    String get(String key);

    /** hmset */
    void hmset(String key, Map<String, String> map);

    /** hmget */
    List<String> hmget(String key, String... fields);

    /** hset */
    void hset(String key, String field, String value);

    /** 根据KEY和field，获取字符串 */
    String hget(String key, String field);

    /** 查询指定Map的所有KEY */
    Set<String> hkeys(String key);

    /** 根据KEY获取Map */
    Map<String, String> hgetAll(String key);

    /** 遍历指定MAP */
    ScanResult<Map.Entry<String, String>> hscan(String key, String cursor);

    /** 遍历指定MAP */
    ScanResult<Map.Entry<String, String>> hscan(String key, String cursor, ScanParams scanParams);

    /** 设置KEY生命时长 */
    void expire(String key, int seconds);

    /** 删除 */
    void del(String key);

    /** 删除 */
    void hdel(String key, String field);

    /** 是否存在 */
    boolean exists(String key);

    /** 是否存在 */
    boolean hexists(String key, String field);

    /** 将KEY中储存的数字值加1 */
    long incr(String key);

    /** 将KEY中储存的数字值加指定增量 */
    long incr(String key, long increment);

    /** 将KEY中储存的数字值减1 */
    long decr(String key);

    /** 将KEY中储存的数字值减指定减量 */
    long decrBy(String key, long decrement);

    /** 获取连接池 */
    Pool<?> getJedisPool();
}
