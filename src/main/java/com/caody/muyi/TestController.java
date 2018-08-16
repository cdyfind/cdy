package com.caody.muyi;

import com.caody.muyi.core.domain.PublicMsg;
import com.caody.muyi.core.util.QueueUtils;
import com.caody.muyi.service.ISmsService;
import com.caody.muyi.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    ISmsService smsService;

    @RequestMapping("/web")
    public String web(){
        return "web";
    }

    @RequestMapping("/socket")
    public String socket(){
        return "socket";
    }
    @RequestMapping("/socket1")
    public String socket1(){
        return "socket1";
    }
    @RequestMapping("/socket2")
    public String socket2(){
        return "socket2";
    }

    @RequestMapping("/netty")
    public String netty(){
        return "netty";
    }

    @RequestMapping("/netty1")
    public String netty1(){
        return "netty1";
    }

    @RequestMapping("/netty2")
    public String netty2(){
        return "netty2";
    }

    @RequestMapping("/")
    public String testThymeleaf(ModelMap modelMap){
        modelMap.addAttribute("msg", "caody");
        return "index";
    }

    @RequestMapping("/test")
    public String ueditor() {
        return "test";
    }
    /**
     * 获取配置信息
     * @param request
     * @return
     */
    @RequestMapping(value="/ueditor")
    @ResponseBody
    public String ueditor(HttpServletRequest request) {

        return PublicMsg.UEDITOR_CONFIG;
    }
    /**
     * 图片上传阿里云
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload")
    @ResponseBody
    public Map<String, Object> upload(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        return testService.upload(request);
    }

    /**
     * 短信发送接口
     * @return
     */
    @RequestMapping(value = "/getSsm")
    @ResponseBody
    public  Object getSsm(){
        return smsService.send_register_message("15176437220");
    }

    /**
     * 王先生编辑器
     */
    @RequestMapping(value = "/wang")
    protected String wang(){
        return "wang";
    }

    /**
     * aop测试
     */
    @RequestMapping(value = "/aopTest")
    @ResponseBody
    public Object aopTest() throws InterruptedException {
        for (int i = 0; i<11;i++){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("userId",i);
            map.put("amount",5);
            QueueUtils.put(map);
        }
        String temp =  "aopTest";
        return temp;
    }

}
