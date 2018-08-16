package com.caody.muyi.controller;

import com.caody.muyi.core.websocket.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/checkcenter")
public class CheckCenterController {
    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push")
    public Object pushToWeb(String cid,String message) {
        try {
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
            return (cid+"#"+e.getMessage());
        }
        return (cid);
    }

}
