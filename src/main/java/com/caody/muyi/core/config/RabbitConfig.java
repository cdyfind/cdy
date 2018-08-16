package com.caody.muyi.core.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue  testQueue(){
        return new Queue("test");
    }

    @Bean
    public Queue  testQueue1(){
        return new Queue("test1");
    }

}
