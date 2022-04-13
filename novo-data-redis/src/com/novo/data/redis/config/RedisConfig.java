package com.novo.data.redis.config;

import com.novo.data.redis.NovoRedis;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import redis.clients.jedis.Protocol;

/**
 * @author Aoheng on 2021/01/30.
 */
@ConfigurationProperties(prefix = NovoRedis.config_prefix)
public class RedisConfig {

    private String mode;
    private String masterName;
    private String servers;
    private String password;
    private Integer database;
    private Integer timeout;
    private Integer maxPoolSize;
    private Integer maxPoolIdle;
    private Integer minPoolIdle;
    private Long maxPoolWaitMillis;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public Integer getTimeout() {
        return timeout == null ? Protocol.DEFAULT_TIMEOUT : timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public String getPassword() {
        return password == null || password.trim().length() == 0 ? null : password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDatabase() {
        return database == null ? Protocol.DEFAULT_DATABASE : database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    public Integer getMaxPoolSize() {
        return maxPoolSize == null ? GenericObjectPoolConfig.DEFAULT_MAX_TOTAL : maxPoolSize;
    }

    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public Integer getMaxPoolIdle() {
        return maxPoolIdle == null ? GenericObjectPoolConfig.DEFAULT_MAX_IDLE : maxPoolIdle;
    }

    public void setMaxPoolIdle(Integer maxPoolIdle) {
        this.maxPoolIdle = maxPoolIdle;
    }

    public Integer getMinPoolIdle() {
        return minPoolIdle == null ? GenericObjectPoolConfig.DEFAULT_MIN_IDLE : minPoolIdle;
    }

    public void setMinPoolIdle(Integer minPoolIdle) {
        this.minPoolIdle = minPoolIdle;
    }

    public Long getMaxPoolWaitMillis() {
        return maxPoolWaitMillis == null ? GenericObjectPoolConfig.DEFAULT_MAX_WAIT_MILLIS : maxPoolWaitMillis;
    }

    public void setMaxPoolWaitMillis(Long maxPoolWaitMillis) {
        this.maxPoolWaitMillis = maxPoolWaitMillis;
    }

    public Boolean getTestOnBorrow() {
        return testOnBorrow == null ? GenericObjectPoolConfig.DEFAULT_TEST_ON_BORROW : testOnBorrow;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public Boolean getTestOnReturn() {
        return testOnReturn == null ? GenericObjectPoolConfig.DEFAULT_TEST_ON_RETURN : testOnReturn;
    }

    public void setTestOnReturn(Boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }
}

