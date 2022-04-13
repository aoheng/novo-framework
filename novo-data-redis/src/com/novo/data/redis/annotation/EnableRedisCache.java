package com.novo.data.redis.annotation;

import com.novo.data.redis.config.RedisCacheAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author Aoheng on 2021/01/30.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration({RedisCacheAutoConfiguration.class})
public @interface EnableRedisCache {

}
