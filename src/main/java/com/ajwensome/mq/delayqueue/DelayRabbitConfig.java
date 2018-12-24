package com.ajwensome.mq.delayqueue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import org.springframework.amqp.core.*;
/**
 * @author created by qwb on 2018/12/22 14:39
 */
@Configuration
@Slf4j
public class DelayRabbitConfig {

    /**
     * 延迟队列 TTL
     * */
    private static final String ORDER_DELAY_QUEUE = "user.order.delay.queue";
    /**
     * DLX dead letter exchange
     * 延时消息发送到该交换机上
     * */
    public static final String ORDER_DELAY_EXCAHNGE = "user.order.delay.exchange";
    /**
     * 路由键 routing key
     * */
    public static final String ORDER_DELAY_ROUTING_KEY = "order_delay";

    public static final String ORDER_QUEUE_NAME = "user.order.queue";
    public static final String ORDER_EXCHANGE_NAME = "user.order.exchange";
    public static final String ORDER_ROUTING_KEY = "order";
    /**
     * 延迟队列配置
     * */
    @Bean
    public Queue delayOrderQueue(){
        Map<String,Object> params = new HashMap<>();
        params.put("x-dead-letter-exchange",ORDER_EXCHANGE_NAME);
        params.put("x-dead-letter-routing-key",ORDER_ROUTING_KEY);
        return new Queue(ORDER_DELAY_QUEUE,true,false,false,params);
    }
    @Bean
    public DirectExchange orderDelayExchange(){
        return new DirectExchange(ORDER_DELAY_EXCAHNGE);
    }
    @Bean
    public Binding dlxBinding(){
        return BindingBuilder.bind(delayOrderQueue()).to(orderDelayExchange()).with(ORDER_DELAY_ROUTING_KEY);
    }
    @Bean
    public Queue orderQueue(){
        return new Queue(ORDER_QUEUE_NAME);
    }
    @Bean
    public TopicExchange orderTopicExchange(){
        return new TopicExchange(ORDER_EXCHANGE_NAME);
    }
    @Bean
    public Binding orderBinding(){
        return BindingBuilder.bind(orderQueue()).to(orderTopicExchange()).with(ORDER_ROUTING_KEY);
    }


}
