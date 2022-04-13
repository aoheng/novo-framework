package com.novo.data.rabbitMq.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

/**
 * @author aoheng on 2021/01/30.
 */
@Configuration
@EnableConfigurationProperties({RabbitMqConfig.class})
@ConditionalOnProperty(prefix = "spring.rabbitmq", name = "username")
public class RabbitMqAutoConfiguration {

    @Autowired
    private RabbitMqConfig config;

    @Primary
    @Bean("novoConnectionFactory")
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        //connectionFactory.setChannelCacheSize(100);
        if (config.getAddresses() != null) {
            connectionFactory.setAddresses(config.getAddresses());
        } else {
            connectionFactory.setAddresses(config.getHost());
            connectionFactory.setPort(config.getPort());
        }
        connectionFactory.setUsername(config.getUsername());
        connectionFactory.setPassword(config.getPassword());
        if (config.getPublisherConfirms() != null) {
            connectionFactory.setPublisherConfirms(config.getPublisherConfirms());
        } else {
            connectionFactory.setPublisherConfirms(true);
        }
        if (config.getVirtualHost() != null) {
            connectionFactory.setVirtualHost(config.getVirtualHost());
        }
        return connectionFactory;
    }

    @Primary
    @Bean("novoRabbitAdmin")
    public RabbitAdmin rabbitAdmin(@Qualifier("novoConnectionFactory") ConnectionFactory connectionFactory) {
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
        rabbitAdmin.setAutoStartup(true);
        return rabbitAdmin;
    }

    @Primary
    @Bean("novoRabbitTemplate")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RabbitTemplate rabbitTemplate(
            @Qualifier("novoConnectionFactory") ConnectionFactory connectionFactory,
            @Qualifier("novoJackson2JsonMessageConverter") Jackson2JsonMessageConverter messageConverter) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter);
        return template;
    }

    @Bean("novoJackson2JsonMessageConverter")
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Jackson2JsonMessageConverter messageConverter = new Jackson2JsonMessageConverter(objectMapper);
        return messageConverter;
    }

    @Lazy
    @Bean(name = "novoSimpleRabbitListenerContainerFactory")
    public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory(@Qualifier("novoConnectionFactory") ConnectionFactory connectionFactory,
                                                                                     SimpleRabbitListenerContainerFactoryConfigurer configurer,
                                                                                     @Qualifier("novoJackson2JsonMessageConverter") Jackson2JsonMessageConverter messageConverter) {
        SimpleRabbitListenerContainerFactory containerFactory = new SimpleRabbitListenerContainerFactory();
        configurer.configure(containerFactory, connectionFactory);
        containerFactory.setMessageConverter(messageConverter);
        containerFactory.setAcknowledgeMode(AcknowledgeMode.MANUAL);

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("rabbitListen-pool-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(20, 200, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        containerFactory.setTaskExecutor(pool);

        return containerFactory;
    }
}
