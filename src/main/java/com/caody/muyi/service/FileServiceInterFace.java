package com.caody.muyi.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.caody.muyi.core.aliyun.OSSResultModel;
import org.springframework.stereotype.Component;


/**
 * 文件管理接口
 * 
 * @author caody
 *
 */
@Component
public interface FileServiceInterFace {
	/**
	 * 上传数据流
	 * 
	 * @param inputStream
	 * @return
	 */
	OSSResultModel saveFile(String key, InputStream inputStream);

	/**
	 * 上传文件
	 * 
	 * @param file
	 * @return
	 */
	OSSResultModel saveFile(String key, File file);

	/**
	 * 上传Byte流
	 * 
	 * @param byteArrayInputStream
	 * @return
	 */
	OSSResultModel saveFile(String key, ByteArrayInputStream byteArrayInputStream);

	/**
	 * 上传字符串
	 * 
	 * @param string
	 * @return
	 */
	OSSResultModel saveFile(String key, String string);

	/**
	 * 上传网络流
	 * 
	 * @param url
	 * @return
	 */
	OSSResultModel saveFile(String key, URL url);
}
