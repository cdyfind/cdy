package com.caody.muyi.core.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import com.caody.muyi.core.aliyun.OSSResultModel;
import com.caody.muyi.service.FileServiceInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*********************************************************************************
//*
//* Filename:      FileUtils.java
//* Revision:      1.0
//* Created On:    2014年12月31日
//* Modified by:   
//* Modified On:   
//*
//* Description:   <description>
/********************************************************************************/

@Component
public class FileUtils {
	
	@Autowired
    FileServiceInterFace aLIOSSFileService;
	
    /**
     * 文件copy方法
     * @param src
     * @param dest
     */
    public  void copy(InputStream src, OutputStream dest) {
        try {
            byte[] tmp = new byte[1024];
            int len = -1;
            while ((len = src.read(tmp)) != -1)
                dest.write(tmp, 0, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * 给文件重命名 防止覆盖
     * @param fileName
     * @return 时间戳+原始文件的后缀
     */
    public  String reName(String fileName){
        return new StringBuffer().append(new Date().getTime()).append(fileName.substring(fileName.indexOf("."))).toString();
    }
    
    /**
     * 文件保存
     * @param fileName reName之后的文件名称
     * @param content 
     * @param filePath 文件保存路径
     * @return 
     * @throws IOException
     */
    public OSSResultModel saveFile(String fileName, InputStream content) throws IOException {
        FileOutputStream fos = null;
        OSSResultModel ossResul = null;
         try {
            //上传到oss
             ossResul = aLIOSSFileService.saveFile(fileName, content);
            
        } catch (Exception e) {
            throw new IOException("文件保存失败!");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    throw new IOException("文件保存失败!");
                }
            }
        }
        
		return ossResul;
    }
}

