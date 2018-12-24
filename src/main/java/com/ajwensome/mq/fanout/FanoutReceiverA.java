package com.ajwensome.mq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 14:21
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver from fanout A: "+message);
    }

}
