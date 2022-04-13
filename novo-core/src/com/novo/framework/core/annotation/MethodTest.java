package com.novo.framework.core.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface MethodTest {
	
	String value() default "";
	
	RequestType type() default RequestType.GET;
	
	String params();
}
