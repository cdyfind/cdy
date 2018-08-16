package com.caody.muyi.controller.messagequeued;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQMessageSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    @RequestMapping(value = "/sendMessage")
    public void sendMessage(){
        String context="hello test";
        rabbitTemplate.convertAndSend("test",context);
    }


    @RequestMapping(value = "/sendMessage1")
    public void sendMessage1(){
        String context="hello test1";
        rabbitTemplate.convertAndSend("test1",context);
    }
}
