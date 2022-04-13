package com.novo.data.cos.annotation;

import com.novo.data.cos.bean.CosAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author Aoheng on 2021/01/30 2021/01/313.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration({CosAutoConfiguration.class})
public @interface EnableQCloudCOS {

}
