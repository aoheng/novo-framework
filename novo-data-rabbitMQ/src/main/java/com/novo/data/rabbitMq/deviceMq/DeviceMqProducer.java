package com.novo.data.rabbitMq.deviceMq;

import com.novo.data.rabbitMq.bean.AbstractMessageProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author Aoheng on 2021/01/30 2020/02/07.
 */
public class DeviceMqProducer extends AbstractMessageProducer {

    private RabbitTemplate rabbitTemplate;

    public DeviceMqProducer(RabbitTemplate rabbitTemplate) {
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
        return DeviceMqConfig.TOPIC_EXCHANGE_DEVICE;
    }
}
