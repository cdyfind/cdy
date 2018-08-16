package com.caody.muyi.mapper;

import com.caody.muyi.model.SktCarts;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 购物车表 Mapper 接口
 * </p>
 *
 * @author caody
 * @since 2018-06-16
 */
public interface SktCartsMapper extends BaseMapper<SktCarts> {

    /**
     * 测试方法
     * @return
     */
    public  Object selectbyid();
}
