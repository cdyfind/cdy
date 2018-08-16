package com.caody.muyi.service.impl;

import com.caody.muyi.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;



@Service
public class RedisServiceImpl implements IRedisService{

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    @Override
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 设置缓存失效时间
     * @param key
     * @param value
     * @param expireTime
     * @return
     */
    @Override
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 读取缓存
     * @param key
     * @return
     */
    @Override
    public Object get(final String key) {
        Object result = null;
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        return result;
    }

    /**
     * 删除对应的key
     * @param key
     */
    @Override
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }
    /**
     * 判断缓存中是否有对应的value
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 延迟10秒钟
     * @param phone
     * @return
     */
    @Override
    public  Object delay(final String phone){
        String redisKey = "SMS_LIMIT_"+phone;
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        Long count = operations.increment(redisKey,1);

        if (count == 1){
            redisTemplate.expire(redisKey,10,TimeUnit.SECONDS);
        }
        if (count >1){
            return "10秒内只能操作一次";
        }

        /**
         * 可以用来发短信等操作
         */
        this.set(phone,"bbb");
        return "操作成功";
    }

    @Override
    public void test(){
        String redisKey = "redisKey";
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        Long count = operations.increment(redisKey,1);
        redisTemplate.expire(redisKey,10,TimeUnit.SECONDS);
        System.out.println(redisTemplate.hasKey(redisKey));
        while (redisTemplate.hasKey(redisKey)){
            System.out.println(new Date());
        }
        System.out.println("AAAAAA!");



    }


}
