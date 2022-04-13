package com.novo.data.mongodb.config;

import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author aoheng on 2021/01/314.
 */
@Configuration
@EnableConfigurationProperties({MultipleMongoConfig.class})
@ConditionalOnProperty(prefix = "spring.data.mongodb.db1", name = "uri")
public class MultipleMongoAutoConfiguration {

    @Autowired
    private MultipleMongoConfig mongoProperties;

    @Primary
    @Bean(name = "db1MongoTemplate")
    public MongoTemplate db1MongoTemplate() throws Exception {
        return new MongoTemplate(db1MongoDbFactory(this.mongoProperties.getDb1()));
    }

    @Primary
    @Bean(name = "db1MongoDbFactory")
    public MongoDbFactory db1MongoDbFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoDbFactory(new MongoClientURI(mongo.getUri()));
    }

    @Bean(name = "db2MongoTemplate")
    @ConditionalOnProperty(prefix = "spring.data.mongodb.db2", name = "uri")
    public MongoTemplate db2MongoTemplate() throws Exception {
        return new MongoTemplate(db2MongoDbFactory(this.mongoProperties.getDb2()));
    }

    @Bean(name = "db2MongoDbFactory")
    @ConditionalOnProperty(prefix = "spring.data.mongodb.db2", name = "uri")
    public MongoDbFactory db2MongoDbFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoDbFactory(new MongoClientURI(mongo.getUri()));
    }
}
