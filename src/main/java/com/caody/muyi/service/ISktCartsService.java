package com.caody.muyi.service;

import com.caody.muyi.model.SktCarts;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 购物车表 服务类
 * </p>
 *
 * @author caody
 * @since 2018-06-16
 */
public interface ISktCartsService extends IService<SktCarts> {


    /**
     * 测试方法
     * @return
     */
    public  Object selectbyid();
}
