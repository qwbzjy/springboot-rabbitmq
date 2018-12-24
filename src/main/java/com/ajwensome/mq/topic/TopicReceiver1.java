package com.ajwensome.mq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 12:11
 */
@Component
@RabbitListener(queues = "Q1")
public class TopicReceiver1 {
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver1 topic.message: "+message);
    }
}
