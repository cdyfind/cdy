package com.caody.muyi.service;

/**
 * redis缓存接口
 */
public interface IRedisService {

    /**
     * 写入缓存
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value);

    /**
     * 设置缓存失效时间
     * @param key
     * @param value
     * @param expireTime
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime);

    /**
     * 读取缓存
     * @param key
     * @return
     */
    public Object get(final String key);

    /**
     * 删除对应的key
     * @param key
     */
    public void remove(final String key);

    /**
     * 延迟1分钟
     * @param phone
     * @return
     */
    public Object delay(final String phone);

    /**
     * 延迟操作测试
     */
    public void test();


}
