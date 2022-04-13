package com.novo.web.annotation;

import com.novo.web.handler.UnifiedExceptionHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(UnifiedExceptionHandler.class)
public @interface WebExceptionHandler {

}
