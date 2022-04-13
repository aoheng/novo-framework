package com.novo.data.mongodb.annotation;

import com.novo.data.mongodb.config.MultipleMongoAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author Aoheng on 2021/01/30 2020/03/22.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration({MultipleMongoAutoConfiguration.class})
public @interface EnableMultipleMongo {

}
