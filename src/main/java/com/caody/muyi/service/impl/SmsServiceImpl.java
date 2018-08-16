package com.caody.muyi.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.caody.muyi.core.aliyun.ALiYunOss;
import com.caody.muyi.service.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements ISmsService {

    @Autowired
    private ALiYunOss aLiYunOss;

    /**
     * 用户注册验证接口
     */
    @Override
    public Object send_register_message(String number) {

        IClientProfile iClientProfile = DefaultProfile.getProfile("cn-beijing",aLiYunOss.getAccesskeyid(),aLiYunOss.getAccesskeysecret());
        try {
            DefaultProfile.addEndpoint("cn-beijing","cn-beijing",aLiYunOss.getProduct(),aLiYunOss.getDomain());
        } catch (ClientException e) {
            e.printStackTrace();
        }
        IAcsClient acsClient = new DefaultAcsClient(iClientProfile);
        //随机生成六位验证码
        int code = (int)((Math.random()*9+1)*100000);
        //删除该号码上次的验证码记录

        //保存到数据库

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(number);

        //必填:短信签名-可在短信控制台中找到，你在签名管理里的内容
//        request.setSignName("中澜网络");
        request.setSignName("企乐网");

        //必填:短信模板-可在短信控制台中找到，你模板管理里的模板编号
//        request.setTemplateCode("SMS_136384082");
        request.setTemplateCode("SMS_141440012");

        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam("{\"code\":\""+code+"\"}");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = null;
        try {
            sendSmsResponse = acsClient.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        //获取发送状态
        String cod = sendSmsResponse.getCode();
        return cod;
    }
}
