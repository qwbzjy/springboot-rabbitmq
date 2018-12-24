package com.ajwensome.mq.direct;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 16:19
 */
@Component
public class DirectSender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        String context = "direct msg";
        System.out.println("direct msg.......");
        amqpTemplate.convertAndSend("directExchange","direct",context);
    }
}
