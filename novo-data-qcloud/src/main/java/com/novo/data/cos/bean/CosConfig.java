package com.novo.data.cos.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Aoheng on 2021/01/30 2020/12/13.
 */
@ConfigurationProperties(prefix = "qcloud.cos")
public class CosConfig {

    public static String BUCKET_NOVO;
    /** 续费二维码路径 */
    public static String PATH_RENEW_QRCODE;
    private Long appId;
    private String secretId;
    private String secretKey;
    private String region;

    public Long getAppId() { return appId; }

    public void setAppId(Long appId) { this.appId = appId; }

    public String getRegion() { return region; }

    public void setRegion(String region) { this.region = region; }

    public String getSecretId() { return secretId; }

    public void setSecretId(String secretId) { this.secretId = secretId; }

    public String getSecretKey() { return secretKey; }

    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    @Value("${qcloud.cos.bucket.novoyun.name}")
    public void setBucketNovo(String bucket) {
        BUCKET_NOVO = bucket;
    }

    @Value("${qcloud.cos.bucket.novoyun.path.renewQrcode}")
    public void setPathQrcode(String path) {
        PATH_RENEW_QRCODE = path;
    }
}
