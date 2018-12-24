package com.ajwensome.mq.hello;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author created by qwb on 2018/12/22 16:08
 */
@Configuration
public class RabbitHelloConfig {
    @Bean
    public Queue queue8(){
        return new Queue("hello");
    }
    @Bean
    public Queue queue9(){
        return new Queue("hello2");
    }
}
