package com.caody.muyi.controller;

import com.caody.muyi.service.impl.StockServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/StockController")
@Slf4j
public class StockController {

    @Autowired
    private StockServiceImpl stockService;

    @RequestMapping(value = "/stock")
    public Object  stock(){
        // 商品ID
        long commodityId = 1;
        // 库存ID
        String redisKey = "redis_key:stock:" + commodityId;
        long stock = stockService.stock(redisKey, 60 * 60, 2, () -> initStock(commodityId));
        return stock >= 0;
    }

    /**
     * 获取初始的库存
     *
     * @return
     */
    private int initStock(long commodityId) {
        // TODO 这里做一些初始化库存的操作
        log.info("不知道为什么就调用过来了！");
        return 1000;
    }

}
