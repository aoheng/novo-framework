package com.novo.framework.core.page;

import java.lang.annotation.*;

/**
 * 分页标注
 * @author aoheng
 * @description <br>
 * @date 2020年6月22日
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Pageable {

}
