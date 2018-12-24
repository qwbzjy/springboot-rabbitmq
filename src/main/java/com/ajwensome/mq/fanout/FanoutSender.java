package com.ajwensome.mq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author created by qwb on 2018/12/22 14:19
 */
@Component
public class FanoutSender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hi, fanout msg";
        System.out.println("Sender: "+context);
        amqpTemplate.convertAndSend("fanoutExchange","",context);
    }
}
