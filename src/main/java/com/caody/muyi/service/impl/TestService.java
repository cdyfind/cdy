package com.caody.muyi.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.caody.muyi.core.aliyun.OSSResultModel;
import com.caody.muyi.core.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private FileUtils fileUtils;

    /**
     * 图片上传阿里云
     * @param request
     * @param response
     * @return
     * @throws IOException
     */

    public Map<String,Object> upload(HttpServletRequest req){
        Map<String,Object> result = new HashMap<String, Object>();

        MultipartHttpServletRequest mReq  =  null;
        MultipartFile file = null;
        InputStream is = null ;
        OSSResultModel ossResult = null;
        String fileName = "";
        // 原始文件名   UEDITOR创建页面元素时的alt和title属性
        String originalFileName = "";

        try {
            mReq = (MultipartHttpServletRequest)req;
            // 从config.json中取得上传文件的ID
            file = mReq.getFile("file");
            // 取得文件的原
            fileName = file.getOriginalFilename();
            originalFileName = fileName;
            if(!StringUtils.isEmpty(fileName)){
                is = file.getInputStream();
                fileName = fileUtils.reName(fileName);
                ossResult = fileUtils.saveFile(fileName, is);
            } else {
                throw new IOException("文件名为空!");
            }

            String[] strings = new String[5];
            strings[0] = ossResult.getUrl();


            result.put("errno",0);
            result.put("data",strings);

            //result.put("state", "SUCCESS");// UEDITOR的规则:不为SUCCESS则显示state的内容
            //result.put("url",ossResult.getUrl());
            //result.put("title", fileName);
            //result.put("original", fileName);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            result.put("state", "文件上传失败!");
            result.put("url","");
            result.put("title", "");
            result.put("original", "");
            System.out.println("文件 "+fileName+" 上传失败!");
        }

        return result;
    }


}
