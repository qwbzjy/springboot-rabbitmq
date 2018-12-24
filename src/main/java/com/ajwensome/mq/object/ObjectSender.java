package com.ajwensome.mq.object;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 11:00
 */
@Component
public class ObjectSender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendUser(User user){
        System.out.println("Send object:"+user.toString());
        this.amqpTemplate.convertAndSend("object_queue",user);
    }
}
