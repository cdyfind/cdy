package com.caody.muyi.service.impl;

import com.caody.muyi.model.SktCarts;
import com.caody.muyi.mapper.SktCartsMapper;
import com.caody.muyi.service.ISktCartsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author caody
 * @since 2018-06-16
 */
@Service
public class SktCartsServiceImpl extends ServiceImpl<SktCartsMapper, SktCarts> implements ISktCartsService {

    @Autowired
    SktCartsMapper sktCartsMapper;

    /**
     * 测试方法
     * @return
     */
    @Override
    public  Object selectbyid(){
        return  sktCartsMapper.selectbyid();
    };

}
