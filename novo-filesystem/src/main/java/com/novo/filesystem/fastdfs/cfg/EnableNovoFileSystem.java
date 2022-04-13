/**
 * 
 */
package com.novo.filesystem.fastdfs.cfg;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description <br>
 * @author aoheng
 * @date 2020年3月28日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DelegateFileSystemConfiguration.class)
public @interface EnableNovoFileSystem {

}
