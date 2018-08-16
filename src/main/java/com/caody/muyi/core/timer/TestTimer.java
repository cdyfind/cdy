package com.caody.muyi.core.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestTimer {

    @Autowired
    StringRedisTemplate  stringRedisTemplate;

    /**
     * 定时任务测试
     */
    //@Scheduled(cron = "0/1 * * * * ?")
    private void test() {
        System.out.println("执行定时任务的时间是："+new Date());
    }

    /**
     * 监听事件定时任务
     */
    //@Scheduled(cron = "0/5 * * * * ?")
    private void sendMessage() {
        System.out.println("执行定时任务的时间是："+new Date());
        Date d = new Date();
        stringRedisTemplate.convertAndSend("chat", d.toString());
    }
}
