package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Setter
@Getter
public class MessageInfo {
    //源客户端id
    private String sourceClientId;
    //目标客户端id
    private String targetClientId;
    //消息内容
    private String msg;
}
