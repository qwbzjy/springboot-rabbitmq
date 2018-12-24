package com.ajwensome.mq.object;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 11:04
 */
@Component
@RabbitListener(queues = "object_queue")
public class ObjectReceiver {
    @RabbitHandler
    public void objectReceiver(User user){
        System.out.println("Receiver object:"+user.toString());
    }
}
