package com.novo.data.mongodb.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Aoheng on 2021/01/30 2020/02/02.
 */
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MultipleMongoConfig {

    private MongoProperties db1;
    private MongoProperties db2;

    public MongoProperties getDb1() { return db1; }

    public void setDb1(MongoProperties db1) { this.db1 = db1; }

    public MongoProperties getDb2() { return db2; }

    public void setDb2(MongoProperties db2) { this.db2 = db2; }
}
