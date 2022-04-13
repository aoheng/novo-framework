package com.novo.web.annotation;

import com.novo.web.aspect.RequestVaildAspectHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Import(RequestVaildAspectHandler.class)
public @interface RequestVaildHandler {

}
