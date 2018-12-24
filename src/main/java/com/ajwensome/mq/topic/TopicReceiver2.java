package com.ajwensome.mq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 12:12
 */
@Component
@RabbitListener(queues = "Q2")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String message){
        System.out.println("Receiver2 topic.messages: "+message);
    }
}
