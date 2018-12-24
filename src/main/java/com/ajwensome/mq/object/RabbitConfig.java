package com.ajwensome.mq.object;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author created by qwb on 2018/12/22 10:23
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
    @Bean
    public Queue queue2(){
        return new Queue("hello2");
    }
    @Bean
    public Queue queue3(){
        return new Queue("object_queue");
    }
}
