package com.ajwensome.mq.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 10:34
 */
@Component
@RabbitListener(queues = "hello2")
public class HelloReceiver1 {
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver1: "+message);
    }
}
