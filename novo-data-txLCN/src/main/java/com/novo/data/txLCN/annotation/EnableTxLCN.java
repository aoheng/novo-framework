package com.novo.data.txLCN.annotation;

import com.novo.data.txLCN.config.TxLCNAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author Aoheng on 2020/11/29.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ImportAutoConfiguration({TxLCNAutoConfiguration.class})
public @interface EnableTxLCN {

}
