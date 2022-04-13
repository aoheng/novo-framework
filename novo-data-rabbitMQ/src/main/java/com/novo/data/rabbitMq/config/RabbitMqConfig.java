package com.novo.data.rabbitMq.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Aoheng on 2021/01/30 2020/03/06.
 */
@ConfigurationProperties(prefix = "spring.rabbitmq")
public class RabbitMqConfig {

    private String addresses;
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Boolean publisherConfirms;
    private String virtualHost;

    public String getAddresses() { return addresses; }

    public void setAddresses(String addresses) { this.addresses = addresses; }

    public String getHost() { return host; }

    public void setHost(String host) { this.host = host; }

    public Integer getPort() { return port; }

    public void setPort(Integer port) { this.port = port; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Boolean getPublisherConfirms() { return publisherConfirms; }

    public void setPublisherConfirms(Boolean publisherConfirms) { this.publisherConfirms = publisherConfirms; }

    public String getVirtualHost() { return virtualHost; }

    public void setVirtualHost(String virtualHost) { this.virtualHost = virtualHost; }
}
