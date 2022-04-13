package com.novo.data.rabbitMq.businessMq;


import com.novo.data.rabbitMq.bean.AbstractMessageProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author Aoheng on 2021/01/30 2020/01/10.
 */
public class BusinessMqProducer extends AbstractMessageProducer {

    private RabbitTemplate rabbitTemplate;

    public BusinessMqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setConfirmCallback(this);
        this.rabbitTemplate.setReturnCallback(this);
    }

    @Override
    public RabbitTemplate getRabbitTemplate() {
        return rabbitTemplate;
    }

    @Override
    public String getExchange() {
        return BusinessMqConfig.DIRECT_EXCHANGE_BUSINESS;
    }
}
