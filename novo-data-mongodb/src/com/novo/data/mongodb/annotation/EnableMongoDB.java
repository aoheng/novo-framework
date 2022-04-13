package com.novo.data.mongodb.annotation;

import com.novo.data.mongodb.config.MongoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({MongoConfigure.class})
public @interface EnableMongoDB {

}
