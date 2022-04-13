package com.novo.data.rabbitMq.deviceMq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aoheng on 2021/01/30 2020/02/07.
 */
@Configuration
public class DeviceMqConfig {

    public static String TOPIC_EXCHANGE_DEVICE = "deviceTopicExchange";

    public static String QUEUE_DEVICE_SWITCH_ENV = "device.switchEnv";

    public static String ROUTE_KEY_DEVICE_SWITCH_ENV = "device.switchEnv";

    public static String QUEUE_DEVICE_KICK = "device.kick";

    public static String ROUTE_KEY_DEVICE_KICK = "device.kick";

    public static String QUEUE_DEVICE_QUERY_DYNAMIC_CYCLE = "device.queryDynamicCycle";

    public static String ROUTE_KEY_DEVICE_QUERY_DYNAMIC_CYCLE = "device.queryDynamicCycle";

    public static String QUEUE_DEVICE_REGISTER = "device.register";

    public static String ROUTE_KEY_DEVICE_REGISTER = "device.register";

    public static String QUEUE_DEVICE_RESTART = "device.restart";

    public static String ROUTE_KEY_DEVICE_RESTART = "device.restart";

    public static String QUEUE_DEVICE_HARDWARE = "device.hardware";

    public static String ROUTE_KEY_DEVICE_HARDWARE = "device.hardware";

    public static String QUEUE_DEVICE_OTA_UPDATE = "device.otaUpdate";

    public static String ROUTE_KEY_DEVICE_OTA_UPDATE = "device.otaUpdate";

    public static String QUEUE_DEVICE_RECHARGE = "device.recharge";

    public static String ROUTE_KEY_DEVICE_RECHARGE = "device.recharge";

    public static String QUEUE_DEVICE_RECHARGE_SUCCESS = "device.recharge.success";

    public static String ROUTE_KEY_DEVICE_RECHARGE_SUCCESS = "device.recharge.success";

    public static String QUEUE_DEVICE_PPF_RESET = "device.ppfReset";

    public static String ROUTE_KEY_DEVICE_PPF_RESET = "device.ppfReset";

    public static String QUEUE_DEVICE_PPF_RESET_SUCCESS = "device.ppfReset.success";

    public static String ROUTE_KEY_DEVICE_PPF_RESET_SUCCESS = "device.ppfReset.success";

    public static String QUEUE_DEVICE_WARNING = "device.warning";

    public static String ROUTE_KEY_DEVICE_WARNING = "device.warning";

    public static String QUEUE_DEVICE_REMOTE_CONTROL = "device.remoteControl";

    public static String ROUTE_KEY_DEVICE_REMOTE_CONTROL = "device.remoteControl";

//    String QUEUE_DEVICE_HEATING_TEMP = "device.heatingTemp";
//
//    String ROUTE_KEY_DEVICE_HEATING_TEMP = "device.heatingTemp";

    public static String QUEUE_DEVICE_HEATING_SWITCH = "device.heatingSwitch";

    public static String ROUTE_KEY_DEVICE_HEATING_SWITCH = "device.heatingSwitch";

    public static String QUEUE_DEVICE_HEATING_PLAN_TIME = "device.heatingPlanTime";

    public static String ROUTE_KEY_DEVICE_HEATING_PLAN_TIME = "device.heatingPlanTime";

    public static String QUEUE_DEVICE_COOLING_SWITCH = "device.coolingSwitch";

    public static String ROUTE_KEY_DEVICE_COOLING_SWITCH = "device.coolingSwitch";

    public static String QUEUE_DEVICE_POWER_SWITCH = "device.powerSwitch";

    public static String ROUTE_KEY_DEVICE_POWER_SWITCH = "device.powerSwitch";

    public static String QUEUE_DEVICE_TEMP_MODE = "device.tempMode";

    public static String ROUTE_KEY_DEVICE_TEMP_MODE = "device.tempMode";

    public static String QUEUE_DEVICE_WATER_MODE = "device.waterMode";

    public static String ROUTE_KEY_DEVICE_WATER_MODE = "device.waterMode";

    public static String QUEUE_DEVICE_RUNNING_SWITCH = "device.runningSwitch";

    public static String ROUTE_KEY_DEVICE_RUNNING_SWITCH = "device.runningSwitch";

    public static String QUEUE_DEVICE_CHILD_LOCK = "device.childLock";

    public static String ROUTE_KEY_DEVICE_CHILD_LOCK = "device.childLock";

    public static String QUEUE_DEVICE_WORK_MODE = "device.workMode";

    public static String ROUTE_KEY_DEVICE_WORK_MODE = "device.workMode";

    public static String QUEUE_DEVICE_STORAGE_SWITCH = "device.storageSwitch";

    public static String ROUTE_KEY_DEVICE_STORAGE_SWITCH = "device.storageSwitch";

    public static String QUEUE_OPERATOR_PPF_REBATE = "operator.ppfRebate";

    public static String ROUTE_KEY_OPERATOR_PPF_REBATE = "operator.ppfRebate";

    public static String QUEUE_FUNCTION_UPDATE_DATA = "device.function.update";

    public static String ROUTE_KEY_FUNCTION_UPDATE_DATA = "device.function.update";

    public static String ROUTE_KEY_DEVICE_REFRESH_CACHE = "device.refreshCache";

    public static String QUEUE_DEVICE_REFRESH_CACHE = "device.refreshCache";

    public static String ROUTE_KEY_DEVICE_SEND_MEDIA = "device.sendMedia";

    public static String QUEUE_DEVICE_SEND_MEDIA = "device.sendMedia";

    public static String ROUTE_KEY_DEVICE_REPORT_MEDIA = "device.reportMedia";

    public static String QUEUE_DEVICE_REPORT_MEDIA = "device.reportMedia";

    public static String QUEUE_DEVICE_ONLINE_STATUS = "device.onlineStatus";

    public static String ROUTE_KEY_DEVICE_ONLINE_STATUS = "device.onlineStatus";

    public static String ROUTE_KEY_DEVICE_SEND_TEXT = "device.sendText";

    public static String QUEUE_DEVICE_SEND_TEXT = "device.sendText";

    public static String ROUTE_KEY_DEVICE_CHARGE_MODE = "device.chargeMode";

    public static String QUEUE_DEVICE_CHARGE_MODE = "device.chargeMode";


    @Bean
    public DeviceMqProducer deviceMqProducer(@Autowired @Qualifier("novoRabbitTemplate") RabbitTemplate rabbitTemplate) {
        return new DeviceMqProducer(rabbitTemplate);
    }

    @Bean("deviceTopicExchange")
    public TopicExchange deviceTopicExchange() {
        return new TopicExchange(TOPIC_EXCHANGE_DEVICE);
    }

    @Bean
    public Queue queueDeviceSwitchEnv() {
        return new Queue(QUEUE_DEVICE_SWITCH_ENV, true);
    }

    @Bean
    public Binding bindingDeviceSwitchEnv() {
        return BindingBuilder.bind(queueDeviceSwitchEnv()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_SWITCH_ENV);
    }

    @Bean
    public Queue queueDeviceKick() {
        return new Queue(QUEUE_DEVICE_KICK, true);
    }

    @Bean
    public Binding bindingDeviceKick() {
        return BindingBuilder.bind(queueDeviceKick()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_KICK);
    }

    @Bean
    public Queue queueDeviceQueryDynamicCycle() {
        return new Queue(QUEUE_DEVICE_QUERY_DYNAMIC_CYCLE, true);
    }

    @Bean
    public Binding bindingDeviceQueryDynamicCycle() {
        return BindingBuilder.bind(queueDeviceQueryDynamicCycle()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_QUERY_DYNAMIC_CYCLE);
    }

    @Bean
    public Queue queueDeviceRegister() {
        return new Queue(QUEUE_DEVICE_REGISTER, true);
    }

    @Bean
    public Binding bindingDeviceRegister() {
        return BindingBuilder.bind(queueDeviceRegister()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_REGISTER);
    }

    @Bean
    public Queue queueDeviceRestart() {
        return new Queue(QUEUE_DEVICE_RESTART, true);
    }

    @Bean
    public Binding bindingDeviceRestart() {
        return BindingBuilder.bind(queueDeviceRestart()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_RESTART);
    }

    @Bean
    public Queue queueDeviceHardware() {
        return new Queue(QUEUE_DEVICE_HARDWARE, true);
    }

    @Bean
    public Binding bindingDeviceHardware() {
        return BindingBuilder.bind(queueDeviceHardware()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_HARDWARE);
    }

    @Bean
    public Queue queueDeviceOtaUpdate() {
        return new Queue(QUEUE_DEVICE_OTA_UPDATE, true);
    }

    @Bean
    public Binding bindingDeviceOtaUpdate() {
        return BindingBuilder.bind(queueDeviceOtaUpdate()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_OTA_UPDATE);
    }

    @Bean
    public Queue queueDeviceRecharge() {
        return new Queue(QUEUE_DEVICE_RECHARGE, true);
    }

    @Bean
    public Binding bindingDeviceRecharge() {
        return BindingBuilder.bind(queueDeviceRecharge()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_RECHARGE);
    }

    @Bean
    public Queue queueDeviceRechargeSuccess() {
        return new Queue(QUEUE_DEVICE_RECHARGE_SUCCESS, true);
    }

    @Bean
    public Binding bindingDeviceRechargeSuccess() {
        return BindingBuilder.bind(queueDeviceRechargeSuccess()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_RECHARGE_SUCCESS);
    }

    @Bean
    public Queue queueDevicePpfReset() {
        return new Queue(QUEUE_DEVICE_PPF_RESET, true);
    }

    @Bean
    public Binding bindingDevicePpfReset() {
        return BindingBuilder.bind(queueDevicePpfReset()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_PPF_RESET);
    }

    @Bean
    public Queue queueDevicePpfResetSuccess() {
        return new Queue(QUEUE_DEVICE_PPF_RESET_SUCCESS, true);
    }

    @Bean
    public Binding bindingDevicePpfResetSuccess() {
        return BindingBuilder.bind(queueDevicePpfResetSuccess()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_PPF_RESET_SUCCESS);
    }

    @Bean
    public Queue queueDeviceWarning() {
        return new Queue(QUEUE_DEVICE_WARNING, true);
    }

    @Bean
    public Binding bindingDeviceWarning() {
        return BindingBuilder.bind(queueDeviceWarning()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_WARNING);
    }

    @Bean
    public Queue queueDeviceRemoteControl() {
        return new Queue(QUEUE_DEVICE_REMOTE_CONTROL, true);
    }

    @Bean
    public Binding bindingDeviceRemoteControl() {
        return BindingBuilder.bind(queueDeviceRemoteControl()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_REMOTE_CONTROL);
    }

//    @Bean
//    public Queue queueDeviceHeatingTemp() {
//        return new Queue(QUEUE_DEVICE_HEATING_TEMP, true);
//    }
//
//    @Bean
//    public Binding bindingDeviceHeatingTemp() {
//        return BindingBuilder.bind(queueDeviceHeatingTemp()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_HEATING_TEMP);
//    }

    @Bean
    public Queue queueDeviceHeatingSwitch() {
        return new Queue(QUEUE_DEVICE_HEATING_SWITCH, true);
    }

    @Bean
    public Binding bindingDeviceHeatingSwitch() {
        return BindingBuilder.bind(queueDeviceHeatingSwitch()).to(deviceTopicExchange()).with(QUEUE_DEVICE_HEATING_SWITCH);
    }

    @Bean
    public Queue queueDeviceHeatingPlanTime() {
        return new Queue(QUEUE_DEVICE_HEATING_PLAN_TIME, true);
    }

    @Bean
    public Binding bindingDeviceHeatingPlanTime() {
        return BindingBuilder.bind(queueDeviceHeatingPlanTime()).to(deviceTopicExchange()).with(QUEUE_DEVICE_HEATING_PLAN_TIME);
    }

    @Bean
    public Queue queueDeviceCoolingSwitch() {
        return new Queue(QUEUE_DEVICE_COOLING_SWITCH, true);
    }

    @Bean
    public Binding bindingDeviceCoolingSwitch() {
        return BindingBuilder.bind(queueDeviceCoolingSwitch()).to(deviceTopicExchange()).with(QUEUE_DEVICE_COOLING_SWITCH);
    }

    @Bean
    public Queue queueDevicePowerSwitch() {
        return new Queue(QUEUE_DEVICE_POWER_SWITCH, true);
    }

    @Bean
    public Binding bindingDevicePowerSwitch() {
        return BindingBuilder.bind(queueDevicePowerSwitch()).to(deviceTopicExchange()).with(QUEUE_DEVICE_POWER_SWITCH);
    }

    @Bean
    public Queue queueDeviceTempMode() {
        return new Queue(QUEUE_DEVICE_TEMP_MODE, true);
    }

    @Bean
    public Binding bindingDeviceTempMode() {
        return BindingBuilder.bind(queueDeviceTempMode()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_TEMP_MODE);
    }

    @Bean
    public Queue queueDeviceWaterMode() {
        return new Queue(QUEUE_DEVICE_WATER_MODE, true);
    }

    @Bean
    public Binding bindingDeviceWaterMode() {
        return BindingBuilder.bind(queueDeviceWaterMode()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_WATER_MODE);
    }

    @Bean
    public Queue queueDeviceRunningSwitch() {
        return new Queue(QUEUE_DEVICE_RUNNING_SWITCH, true);
    }

    @Bean
    public Binding bindingDeviceRunningSwitch() {
        return BindingBuilder.bind(queueDeviceRunningSwitch()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_RUNNING_SWITCH);
    }

    @Bean
    public Queue queueDeviceChildLock() {
        return new Queue(QUEUE_DEVICE_CHILD_LOCK, true);
    }

    @Bean
    public Binding bindingDeviceChildLock() {
        return BindingBuilder.bind(queueDeviceChildLock()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_CHILD_LOCK);
    }

    @Bean
    public Queue queueDeviceWorkMode() {
        return new Queue(QUEUE_DEVICE_WORK_MODE, true);
    }

    @Bean
    public Binding bindingDeviceWorkMode() {
        return BindingBuilder.bind(queueDeviceWorkMode()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_WORK_MODE);
    }

    @Bean
    public Queue queueDeviceStorageSwitch() {
        return new Queue(QUEUE_DEVICE_STORAGE_SWITCH, true);
    }

    @Bean
    public Binding bindingDeviceStorageSwitch() {
        return BindingBuilder.bind(queueDeviceWorkMode()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_STORAGE_SWITCH);
    }

    @Bean
    public Queue queueOperatorPpfRebate() {
        return new Queue(QUEUE_OPERATOR_PPF_REBATE, true);
    }

    @Bean
    public Binding bindingOperatorPpfRebate() {
        return BindingBuilder.bind(queueOperatorPpfRebate()).to(deviceTopicExchange()).with(ROUTE_KEY_OPERATOR_PPF_REBATE);
    }

    @Bean
    public Queue queueUpdateFunctionData() {
        return new Queue(QUEUE_FUNCTION_UPDATE_DATA, true);
    }

    @Bean
    public Binding bindingUpdateFunctionData() {
        return BindingBuilder.bind(queueUpdateFunctionData()).to(deviceTopicExchange()).with(ROUTE_KEY_FUNCTION_UPDATE_DATA);
    }

    @Bean
    public Queue queueDeviceRefreshCache() {
        return new Queue(QUEUE_DEVICE_REFRESH_CACHE, true);
    }

    @Bean
    public Binding bindingDeviceRefreshCache() {
        return BindingBuilder.bind(queueDeviceRefreshCache()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_REFRESH_CACHE);
    }

    @Bean
    public Queue queueDeviceSendMedia() {
        return new Queue(QUEUE_DEVICE_SEND_MEDIA, true);
    }

    @Bean
    public Binding bindingDeviceSendMedia() {
        return BindingBuilder.bind(queueDeviceSendMedia()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_SEND_MEDIA);
    }

    @Bean
    public Queue queueDeviceReportMedia() {
        return new Queue(QUEUE_DEVICE_REPORT_MEDIA, true);
    }

    @Bean
    public Binding bindingDeviceReportMedia() {
        return BindingBuilder.bind(queueDeviceReportMedia()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_REPORT_MEDIA);
    }

    @Bean
    public Queue queueDeviceOnlineStatus() {
        return new Queue(QUEUE_DEVICE_ONLINE_STATUS, true);
    }

    @Bean
    public Binding bindingDeviceOnlineStatus() {
        return BindingBuilder.bind(queueDeviceOnlineStatus()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_ONLINE_STATUS);
    }

    @Bean
    public Queue queueDeviceSendText() {
        return new Queue(QUEUE_DEVICE_SEND_TEXT, true);
    }

    @Bean
    public Binding bindingDeviceSendText() {
        return BindingBuilder.bind(queueDeviceSendText()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_SEND_TEXT);
    }

    @Bean
    public Queue queueDeviceChargeMode() {
        return new Queue(QUEUE_DEVICE_CHARGE_MODE, true);
    }

    @Bean
    public Binding bindingDeviceChargeMode() {
        return BindingBuilder.bind(queueDeviceChargeMode()).to(deviceTopicExchange()).with(ROUTE_KEY_DEVICE_CHARGE_MODE);
    }



}
