package com.novo.data.mybatis.annotation;

import com.novo.data.mybatis.config.DruidConfig;
import com.novo.data.mybatis.config.DruidSource;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({DruidConfig.class,DruidSource.class})
public @interface NovoMybatis {

}
