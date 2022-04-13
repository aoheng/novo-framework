package com.novo.data.mongodb.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.novo.data.mongodb.NovoMongoTemplate;
import com.novo.framework.core.util.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@ConfigurationProperties(prefix = "spring.data.mongodb")
@Configuration
public class MongoConfigure {

    /**
     * Mongo server host. Cannot be set with uri.
     */
    private String host;

    /**
     * Mongo server port. Cannot be set with uri.
     */
    private Integer port = null;

    /**
     * Mongo database URI. Cannot be set with host, port and credentials.
     */
    private String uri;

    /**
     * Database name.
     */
    private String database;

    /**
     * Authentication database name.
     */
    private String authenticationDatabase;

    /**
     * GridFS database name.
     */
    private String gridFsDatabase;

    /**
     * Login user of the mongo server. Cannot be set with uri.
     */
    private String username;

    /**
     * Login password of the mongo server. Cannot be set with uri.
     */
    private char[] password;

    /**
     * Fully qualified name of the FieldNamingStrategy to use.
     */
    private Class<?> fieldNamingStrategy;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getAuthenticationDatabase() {
        return authenticationDatabase;
    }

    public void setAuthenticationDatabase(String authenticationDatabase) {
        this.authenticationDatabase = authenticationDatabase;
    }

    public String getGridFsDatabase() {
        return gridFsDatabase;
    }

    public void setGridFsDatabase(String gridFsDatabase) {
        this.gridFsDatabase = gridFsDatabase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Class<?> getFieldNamingStrategy() {
        return fieldNamingStrategy;
    }

    public void setFieldNamingStrategy(Class<?> fieldNamingStrategy) {
        this.fieldNamingStrategy = fieldNamingStrategy;
    }

    @Bean
    public MongoDbFactory getMongoDbFactory() throws UnknownHostException {
        if (StringUtils.isNotBlank(this.getUri())) {
            return new SimpleMongoDbFactory(new MongoClientURI(this.getUri()));
        }
        return new SimpleMongoDbFactory(new MongoClient(this.getHost()), this.getDatabase());
    }

    //	@Bean
//	public MongoTemplate getMongoTemplate() {
//		return new MongoTemplate(getMongoDbFactory());
//	}
//	
    @Bean
    public NovoMongoTemplate getNovoMongoTemplate() {
        return new NovoMongoTemplate();
    }
}
