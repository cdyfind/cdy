package com.caody.muyi.core.listener;

import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    /**接收消息的方法*/
    public void receiveMessage(String message){
        System.out.println("收到定时任务消息："+message);
    }

    /**接收消息的方法*/
    public void receiveMessage1(String message){
        System.out.println("收到一条消息1："+message);
    }
}
