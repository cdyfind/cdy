package com.caody.muyi.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 阿里云短信发送接口
 */
public interface ISmsService {

    /**
     * 用户注册验证接口
     */
    public Object send_register_message(String phone);

}
