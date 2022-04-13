package com.novo.data.redis.config;

import com.novo.data.redis.NovoRedis;
import com.novo.data.redis.NovoRedisTemplate;
import com.novo.data.redis.RedisHealthIndicator;
import com.novo.data.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import redis.clients.jedis.Jedis;

/**
 * @author aoheng on 2021/01/314.
 */
@Configuration
@EnableConfigurationProperties(RedisConfig.class)
@ConditionalOnProperty(prefix = NovoRedis.config_prefix, value = "mode", matchIfMissing = true)
public class RedisCacheAutoConfiguration {

    @Autowired
    private RedisConfig redisConfig;

    @Bean
    @ConditionalOnClass(Jedis.class)
    @ConditionalOnMissingBean(RedisClient.class)
    public RedisClient redisClient() {
        return new RedisClientImpl(redisConfig);
    }

    @Bean
    @ConditionalOnBean(RedisClient.class)
    public RedisService redisService() {
        return new NovoRedisTemplate();
    }

    @Bean
    @Primary
    @ConditionalOnEnabledHealthIndicator("redis")
    public HealthIndicator redisHealthIndicator() {
        return new RedisHealthIndicator();
    }
}
