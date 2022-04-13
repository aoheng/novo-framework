package com.novo.data.rabbitMq.businessMq;

import com.novo.data.rabbitMq.config.RabbitMqConfig;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aoheng on 2021/01/30 2020/01/10.
 */
@Configuration
@AutoConfigureAfter(RabbitMqConfig.class)
public class BusinessMqConfig {

    public static String DIRECT_EXCHANGE_BUSINESS = "businessDirectExchange";

    //=============================================================================
    //运营商返利-统一入口
    public static String QUEUE_REBATE_COMMON_OPERATOR = "business.rebate.common.operator";
    //运营商返利(老模式)
    public static String QUEUE_REBATE_CALC = "business.rebate.calc";
    //运营商返利(新模式-商品设置)
    public static String QUEUE_REBATE_NEW_ONLINE= "business.rebate.newOnline";
    //确认退款异步通知订单修改状态
    public static String QUEUE_REFUND_ORDER = "business.refund.order";
    //确认退款异步通知退货单修改状态
    public static String QUEUE_REFUND_AFTERSALE = "business.refund.aftersale";
    //确认退款异步通知返利计算
    public static String QUEUE_REFUND_REBATE = "business.refund.rebate";
    //商品冗余字段同步
    public static String QUEUE_PRODUCT_UPDATE = "business.product.update";
    //VIVO iot用户绑定
    public static String QUEUE_VIVO_USERBINDING = "business.vivo.userbinding";
    //VIVO IOT设备绑定
    public static String QUEUE_VIVO_IOTBIND = "business.vivo.iotbind";

    @Bean
    public BusinessMqProducer businessMqProducer(@Autowired @Qualifier("novoRabbitTemplate") RabbitTemplate rabbitTemplate) {
        return new BusinessMqProducer(rabbitTemplate);
    }

    @Bean("businessDirectExchange")
    public DirectExchange businessDirectExchange() {
        return new DirectExchange(DIRECT_EXCHANGE_BUSINESS);
    }


    @Bean
    public Queue queueRebateCalc() {
        return new Queue(QUEUE_REBATE_CALC, true);
    }

    @Bean
    public Binding bindingRebateCalc() {
        return BindingBuilder.bind(queueRebateCalc()).to(businessDirectExchange()).with(QUEUE_REBATE_CALC);
    }

    @Bean
    public Queue queueRefundOrder() {
        return new Queue(QUEUE_REFUND_ORDER, true);
    }

    @Bean
    public Binding bindingRefundOrder() {
        return BindingBuilder.bind(queueRefundOrder()).to(businessDirectExchange()).with(QUEUE_REFUND_ORDER);
    }

    @Bean
    public Queue queueRefundAftersale() {
        return new Queue(QUEUE_REFUND_AFTERSALE, true);
    }

    @Bean
    public Binding bindingRefundAftersale() {
        return BindingBuilder.bind(queueRefundAftersale()).to(businessDirectExchange()).with(QUEUE_REFUND_AFTERSALE);
    }


    @Bean
    public Queue queueRefundRebate() {
        return new Queue(QUEUE_REFUND_REBATE, true);
    }

    @Bean
    public Binding bindingRefundRebate() {
        return BindingBuilder.bind(queueRefundRebate()).to(businessDirectExchange()).with(QUEUE_REFUND_REBATE);
    }

    @Bean
    public Queue queueProductUpdate() {
        return new Queue(QUEUE_PRODUCT_UPDATE, true);
    }

    @Bean
    public Binding bindingProductUpdate() {
        return BindingBuilder.bind(queueProductUpdate()).to(businessDirectExchange()).with(QUEUE_PRODUCT_UPDATE);
    }

    //---------------------------------------VIVO------------------------------------
    @Bean
    public Queue queueIotDeviceBind() {
        return new Queue(QUEUE_VIVO_IOTBIND, true);
    }

    @Bean
    public Binding bindingIotDeviceBind() {
        return BindingBuilder.bind(queueIotDeviceBind()).to(businessDirectExchange()).with(QUEUE_VIVO_IOTBIND);
    }

    @Bean
    public Queue queueUserBinding() {
        return new Queue(QUEUE_VIVO_USERBINDING, true);
    }

    @Bean
    public Binding UserBinding() {
        return BindingBuilder.bind(queueUserBinding()).to(businessDirectExchange()).with(QUEUE_VIVO_USERBINDING);
    }

    @Bean
    public Queue queueRebateNewOnline() {
        return new Queue(QUEUE_REBATE_NEW_ONLINE, true);
    }

    @Bean
    public Binding rebateNewOnlineBinding() {
        return BindingBuilder.bind(queueRebateNewOnline()).to(businessDirectExchange()).with(QUEUE_REBATE_NEW_ONLINE);
    }

    @Bean
    public Queue queueRebateCommonOperator() {
        return new Queue(QUEUE_REBATE_COMMON_OPERATOR, true);
    }

    @Bean
    public Binding rebateCommonOperatorBinding() {
        return BindingBuilder.bind(queueRebateCommonOperator()).to(businessDirectExchange()).with(QUEUE_REBATE_COMMON_OPERATOR);
    }


}
