package com.ajwensome.mq.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 16:21
 */
@Component
@RabbitListener(queues = "Q4")
public class DirectReceiver {
    @RabbitHandler
    public void process(String message){
        System.out.println("receiver: "+message);
    }
}
