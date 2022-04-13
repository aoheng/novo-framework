package com.novo.web.annotation;

import com.novo.web.hystrix.HystrixConfig;
import com.novo.web.webconfig.WebConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({WebConfig.class, HystrixConfig.class})
public @interface WebConfigurer{

}
