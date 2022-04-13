package com.novo.framework.core.sign;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 网关签名校验
 * @Author: 奥亨[aoheng.ke@tuya.com]
 * @Date: 2020/12/29 15:09
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
@Inherited
public @interface SignValidate {



}
