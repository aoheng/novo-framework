package com.novo.data.cos.bean;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.sign.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aoheng on 2021/01/30 2021/01/314.
 */
@Configuration
@EnableConfigurationProperties(CosConfig.class)
@ConditionalOnProperty(prefix = "qcloud.cos", value = "appId", matchIfMissing = true)
public class CosAutoConfiguration {

    @Autowired
    private CosConfig config;

    @Bean
    public Credentials credentials() {
        Credentials credentials = new Credentials(config.getAppId(), config.getSecretId(), config.getSecretKey());
        return credentials;
    }

    @Bean
    public COSClient cosClient(Credentials credentials) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setRegion(config.getRegion());
        COSClient cosClient = new COSClient(clientConfig, credentials);
        return cosClient;
    }
}
