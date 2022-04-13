package com.novo.data.txLCN.config;

import com.codingapi.tx.annotation.TxTransaction;
import com.codingapi.tx.config.service.TxManagerTxUrlService;
import com.codingapi.tx.netty.service.TxManagerHttpRequestService;
import com.novo.data.txLCN.TxManagerHttpRequestServiceImpl;
import com.novo.data.txLCN.TxManagerTxUrlServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aoheng on 2020/11/29.
 */
@Configuration
@ConditionalOnProperty(prefix = "txLCN", name = "managerUrl")
public class TxLCNAutoConfiguration {

    @Value("${txLCN.managerUrl}")
    private String txUrl;

    @Bean
    @ConditionalOnClass(TxTransaction.class)
    public TxManagerTxUrlService txManagerTxUrlService() {
        return new TxManagerTxUrlServiceImpl(txUrl);
    }

    @Bean
    @ConditionalOnClass(TxTransaction.class)
    public TxManagerHttpRequestService txManagerHttpRequestService() {
        return new TxManagerHttpRequestServiceImpl();
    }
}
