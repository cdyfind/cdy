package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Setter
@Getter
public class Chat {
    /**
     * 发送者用户ID
     */
    private String userSendId;
    /**
     * 接受者用户Id
     */
    private String userReceiveId;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private String createtime;
}
