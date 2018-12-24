package com.ajwensome.mq.fanout;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 14:23
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {
    @RabbitHandler
    public void Process(String message){
        System.out.println("Receiver from fanout B: "+message);
    }
}
