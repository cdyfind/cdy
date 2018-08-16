package com.caody.muyi.core.util;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 单例模式
 */

@Component
public class QueueUtils {

    private static QueueUtils instance;

    static final int FILE_QUEUE_SIZE = 10000;// 阻塞队列大小

    private static BlockingQueue<Map<String,Object>> queue = new ArrayBlockingQueue<Map<String,Object>>(FILE_QUEUE_SIZE);

    /**
     * 构造方法，private不让外界生成队列工具类
     */
    private QueueUtils(){

    }

    /**
     * 获取全局的实例
     */
//    public static QueueUtils GetInstance(){
//        if (instance == null){
//            instance = new QueueUtils();
//        }
//        return instance;
//    }


    /**
     * 添加队列元素
     * @param map
     * @throws InterruptedException
     */
    public static void put(Map<String,Object>  map) throws InterruptedException {
        queue.put(map);
    }

    /**
     * 获取队列
     * @return
     */
    public static BlockingQueue<Map<String,Object>> getQueue(){
        return queue;
    }



}
