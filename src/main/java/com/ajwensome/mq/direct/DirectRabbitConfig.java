package com.ajwensome.mq.direct;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author created by qwb on 2018/12/22 16:15
 */
@Configuration
public class DirectRabbitConfig {
    @Bean
    public Queue queue4(){
        return new Queue("Q4");
    }
    @Bean
    public Queue queue5(){
        return new Queue("Q5");
    }
    @Bean
    public DirectExchange exchange1(){
        return new DirectExchange("directExchange");
    }
    @Bean
    public Binding bindingDirectExchange(){
        return BindingBuilder.bind(queue4()).to(exchange1()).with("direct");
    }
}
