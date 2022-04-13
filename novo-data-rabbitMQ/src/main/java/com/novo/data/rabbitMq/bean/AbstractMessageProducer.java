package com.novo.data.rabbitMq.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * @author Aoheng on 2021/01/30 2020/02/07.
 */
public abstract class AbstractMessageProducer implements RabbitTemplate.ConfirmCallback, ReturnCallback {

    private final static Logger LOG = LoggerFactory.getLogger(AbstractMessageProducer.class);

    public abstract RabbitTemplate getRabbitTemplate();

    public abstract String getExchange();

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (ack) {
            //TODO 待完善重试逻辑
            //RetryCache.delete(correlationData.getId());
            LOG.debug(String.format("RabbitMQ：%s ack success", correlationData.getId()));
        } else {
            LOG.error(String.format("RabbitMQ：%s ack failed", correlationData.getId()));
        }
    }

    public void send(String routingKey, MqMessage message) {
        CorrelationData correlationData = new CorrelationData(message.getId());
        //TODO 待完善重试逻辑
        //RetryCache.add(correlationData.getId(), message);
        getRabbitTemplate().convertAndSend(getExchange(), routingKey, message, correlationData);
        LOG.debug(String.format("RabbitMQ：send message by routingKey（%s）", routingKey));
    }


    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        LOG.error(message.getMessageProperties().getCorrelationIdString() + " 发送失败:" + "[replyCode:" + replyCode + "],[replyText:" + replyText + "]");
    }
}
