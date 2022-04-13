package com.novo.framework.core.log;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@Inherited
public @interface LogPointcut {

    LogLevel logLevel() default LogLevel.IGNORABLE;

    String server() default "";
}
