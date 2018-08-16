package com.caody.muyi.controller;


import com.caody.muyi.service.ISktCartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 购物车表 前端控制器
 * </p>
 *
 * @author caody
 * @since 2018-06-16
 */
@Controller
@RequestMapping("/sktCarts")
public class SktCartsController {

    @Autowired
    ISktCartsService sktCartsService;

    @RequestMapping(value="/test")
    @ResponseBody
    public Object test(){
        return  sktCartsService.selectbyid();
    }


}

