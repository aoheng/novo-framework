package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author RaoYongBin on 2020/5/24
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldDetail {

    /**
     * 在显示列表中的标题栏中的中文列名
     */
    String name();
    /**
     * 传给前台的字段名=实体类中字段名
     */
    String fieldName();
    /**
     * 字段值的数据类型
     */
    String type() default "String";

}
