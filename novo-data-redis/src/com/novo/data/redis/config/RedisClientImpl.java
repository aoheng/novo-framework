package com.novo.data.redis.config;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import redis.clients.jedis.*;
import redis.clients.util.Pool;

import java.util.*;

/**
 * @author Aoheng on 2021/01/30 2021/01/313.
 */
@Component
public class RedisClientImpl implements RedisClient {

    private final static Logger LOG = LoggerFactory.getLogger(RedisClientImpl.class);

    private RedisConfig redisConfig;
    private Pool<?> jedisPool;

    public RedisClientImpl(RedisConfig cfg) {
        this.redisConfig = cfg;
        this.jedisPool = buildJedisPool(cfg);
    }

    private JedisPoolConfig buildJedisPoolConfig(RedisConfig cfg) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(cfg.getMaxPoolSize());
        config.setMaxIdle(cfg.getMaxPoolIdle());
        config.setMinIdle(cfg.getMinPoolIdle());
        config.setMaxWaitMillis(cfg.getMaxPoolWaitMillis());
        config.setTestOnBorrow(cfg.getTestOnBorrow());
        config.setTestOnReturn(cfg.getTestOnReturn());
        return config;
    }

    private Pool<?> buildJedisPool(RedisConfig props) {
        if (StringUtils.isBlank(props.getMode())) {
            throw new NullPointerException("未配置Redis运行模式");
        }
        JedisPoolConfig poolConfig = buildJedisPoolConfig(props);
        switch (props.getMode().toLowerCase()) {
            case RedisContants.MODE_STANDALONE:
                return getJedisPool(poolConfig);
            case RedisContants.MODE_SENTINEL:
                return getJedisSentinelPool(poolConfig);
            case RedisContants.MODE_SHARDED:
                return getShardedJedisPool(poolConfig);
            default:
                throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    private JedisPool getJedisPool(JedisPoolConfig poolConfig) {
        JedisPool pool;
        if (redisConfig.getServers().lastIndexOf(":") == -1) {
            pool = new JedisPool(poolConfig, redisConfig.getServers(), Protocol.DEFAULT_PORT, redisConfig.getTimeout(), redisConfig.getPassword(), redisConfig.getDatabase(), null);
        } else {
            HostAndPort hap = HostAndPort.parseString(redisConfig.getServers());
            pool = new JedisPool(poolConfig, hap.getHost(), hap.getPort(), redisConfig.getTimeout(), redisConfig.getPassword(), redisConfig.getDatabase(), null);
        }
        return pool;
    }

    private JedisSentinelPool getJedisSentinelPool(JedisPoolConfig jedisPoolConfig) {
        String[] ss;
        Set<String> sentinels = new HashSet<>();
        ss = StringUtils.split(redisConfig.getServers(), ",");
        if (ss == null || ss.length == 0) {
            throw new NullPointerException("找不到有效的Redis服务器地址");
        }
        for (int i = 0; i < ss.length; i++) {
            String s = ss[i];
            if (!StringUtils.isBlank(s)) {
                sentinels.add(s);
            }
        }
        return new JedisSentinelPool(redisConfig.getMasterName(), sentinels, jedisPoolConfig, redisConfig.getTimeout(), redisConfig.getPassword(), redisConfig.getDatabase());
    }

    private ShardedJedisPool getShardedJedisPool(JedisPoolConfig jedisPoolConfig) {
        String[] ss;
        List<JedisShardInfo> shards = new ArrayList<>();
        ss = StringUtils.split(redisConfig.getServers(), ",");
        if (ss == null || ss.length == 0) {
            throw new NullPointerException("找不到有效的Redis服务器地址");
        }
        for (String s : ss) {
            if (!StringUtils.isBlank(s)) {
                if (s.lastIndexOf(":") == -1) {
                    shards.add(new JedisShardInfo(s, Protocol.DEFAULT_PORT, redisConfig.getTimeout()));
                } else {
                    HostAndPort hap = HostAndPort.parseString(s);
                    shards.add(new JedisShardInfo(hap.getHost(), hap.getPort(), redisConfig.getTimeout()));
                }
            }
        }
        return new ShardedJedisPool(jedisPoolConfig, shards);
    }

    /** 查询所有匹配的KEY */
    @Override
    public Set<String> keys(String pattern) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.keys(pattern);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.keys(pattern);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 遍历 */
    @Override
    public ScanResult<String> scan(String cursor) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.scan(cursor);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.scan(cursor);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 遍历 */
    @Override
    public ScanResult<String> scan(String cursor, ScanParams scanParams) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.scan(cursor, scanParams);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.scan(cursor, scanParams);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 为指定的 key 设置值及其过期时间。如果 key 已经存在， SETEX 命令将会替换旧的值。 */
    @Override
    public void setex(String key, int expireSeconds, String value) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.setex(key, expireSeconds, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.setex(key, expireSeconds, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.setex(key, expireSeconds, value);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 指定的 key 不存在时，为 key 设置指定的值 */
    @Override
    public void setnx(String key, String value) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.setnx(key, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.setnx(key, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.setnx(key, value);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** set */
    @Override
    public void set(String key, String value) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.set(key, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.set(key, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.set(key, value);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 根据key，获取字符串 */
    @Override
    public String get(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.get(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.get(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.get(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** hmset */
    @Override
    public void hmset(String key, Map<String, String> map) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.hmset(key, map);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.hmset(key, map);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.hmset(key, map);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** hmget */
    @Override
    public List<String> hmget(String key, String... fields) {
        List<String> result;
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                result = jedis.hmget(key, fields);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                result = jedis.hmget(key, fields);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                result = jedis.hmget(key, fields);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }

        return result;
    }

    /** hset */
    @Override
    public void hset(String key, String field, String value) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.hset(key, field, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.hset(key, field, value);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.hset(key, field, value);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 根据key和field，获取字符串 */
    @Override
    public String hget(String key, String field) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hget(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hget(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hget(key, field);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 查询指定Map的所有KEY */
    @Override
    public Set<String> hkeys(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hkeys(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hkeys(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hkeys(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 根据key获取Map */
    @Override
    public Map<String, String> hgetAll(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hgetAll(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hgetAll(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hgetAll(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 遍历指定MAP */
    @Override
    public ScanResult<Map.Entry<String, String>> hscan(String key, String cursor) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 遍历指定MAP */
    @Override
    public ScanResult<Map.Entry<String, String>> hscan(String key, String cursor, ScanParams scanParams) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor, scanParams);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor, scanParams);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hscan(key, cursor, scanParams);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 设置key生命时长 */
    @Override
    public void expire(String key, int seconds) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.expire(key, seconds);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.expire(key, seconds);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.expire(key, seconds);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 删除 */
    @Override
    public void del(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.del(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.del(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.del(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 删除 */
    @Override
    public void hdel(String key, String field) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                jedis.hdel(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                jedis.hdel(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                jedis.hdel(key, field);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 是否存在 */
    @Override
    public boolean exists(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.exists(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.exists(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.exists(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 是否存在 */
    @Override
    public boolean hexists(String key, String field) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.hexists(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.hexists(key, field);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.hexists(key, field);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 将 key 中储存的数字值加1 */
    @Override
    public long incr(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.incr(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.incr(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.incr(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 将 key 中储存的数字值加指定增量 */
    @Override
    public long incr(String key, long increment) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.incrBy(key, increment);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.incrBy(key, increment);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.incrBy(key, increment);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 将 key 中储存的数字值减1 */
    @Override
    public long decr(String key) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.decr(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.decr(key);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.decr(key);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 将 key 中储存的数字值减指定减量 */
    @Override
    public long decrBy(String key, long decrement) {
        if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SHARDED)) {
            try (ShardedJedis jedis = ((ShardedJedisPool) jedisPool).getResource()) {
                return jedis.decrBy(key, decrement);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_SENTINEL)) {
            try (Jedis jedis = ((JedisSentinelPool) jedisPool).getResource()) {
                return jedis.decrBy(key, decrement);
            }
        } else if (redisConfig.getMode().equalsIgnoreCase(RedisContants.MODE_STANDALONE)) {
            try (Jedis jedis = ((JedisPool) jedisPool).getResource()) {
                return jedis.decrBy(key, decrement);
            }
        } else {
            throw new UnsupportedOperationException("不支持的Redis运行模式");
        }
    }

    /** 获取连接池 */
    @Override
    public Pool<?> getJedisPool() { return jedisPool; }
}
