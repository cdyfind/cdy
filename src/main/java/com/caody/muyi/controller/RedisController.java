package com.caody.muyi.controller;

import com.caody.muyi.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/redis")
public class RedisController {

    @Autowired
    IRedisService redisService;

    @RequestMapping(value = "/setTime")
    @ResponseBody
    public Object setTime(String key,String value){
        return  redisService.set(key,value,Long.valueOf(10));
    }

    @RequestMapping(value = "/set")
    @ResponseBody
    public Object setController(String key,String value){
        return  redisService.set(key,value);
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public Object getController(String key){
        //redisService.set("test1","hello");
        return  redisService.get(key);
    }


    @RequestMapping(value = "/delete")
    @ResponseBody
    public void deleteController(String key){
        redisService.remove(key);
    }

    @RequestMapping(value = "/delay")
    @ResponseBody
    public Object delay(String phone){
        return redisService.delay(phone);
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public void test(){
        redisService.test();
    }

}
