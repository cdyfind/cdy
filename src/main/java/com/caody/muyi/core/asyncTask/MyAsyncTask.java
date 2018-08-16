package com.caody.muyi.core.asyncTask;

import com.caody.muyi.core.util.QueueUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;

@Component
public class MyAsyncTask {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Async
    public Future<String> refreshMyDbAsync()  {
        BlockingQueue<Map<String,Object>> queue = QueueUtils.getQueue();
        //队列方式遍历，元素逐个被移除
        while (queue.peek() != null) {
            Map<String,Object> map = queue.poll();

            logger.info("userId:"+map.get("userId")+" amount:"+map.get("amount"));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return new AsyncResult<>("任务一完成");
    }
}
