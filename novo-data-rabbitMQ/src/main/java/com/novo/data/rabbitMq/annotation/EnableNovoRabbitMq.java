package com.novo.data.rabbitMq.annotation;

import com.novo.data.rabbitMq.config.RabbitMqAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author Aoheng on 2021/01/30 2020/02/07.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration({RabbitMqAutoConfiguration.class})
public @interface EnableNovoRabbitMq {

}
