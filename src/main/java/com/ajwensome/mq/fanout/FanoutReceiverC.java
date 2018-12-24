package com.ajwensome.mq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 14:24
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver from fanout C: "+message);
    }
}
