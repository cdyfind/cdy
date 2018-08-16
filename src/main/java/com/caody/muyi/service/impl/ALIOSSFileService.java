package com.caody.muyi.service.impl;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.caody.muyi.core.aliyun.ALiYunOss;
import com.caody.muyi.core.aliyun.OSSResultModel;
import com.caody.muyi.service.FileServiceInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aliyun.oss.OSSClient;

/**
 * 阿里服务
 * 
 * @author gybin
 *
 */

@Service
public class ALIOSSFileService implements FileServiceInterFace {

	@Autowired
	private ALiYunOss aLiYunOss;

	

	@Override
	public OSSResultModel saveFile(String key, InputStream inputStream) {
		
		OSSResultModel ossResult = new OSSResultModel();
		OSSClient ossClient = new OSSClient(aLiYunOss.getEndpoint(), aLiYunOss.getAccesskeyid(),
				aLiYunOss.getAccesskeysecret());
		String ossKey = "f/" + key.hashCode() % 64 + "/" + key;
		ossClient.putObject(aLiYunOss.getBucket(), ossKey, inputStream);
		// 关闭client
		ossClient.shutdown();
		// http://abugong-uploadtest.oss-cn-shanghai.aliyuncs.com/a
		ossResult.setPath(ossKey);
		ossResult.setHost(aLiYunOss.getDomain());
		ossResult.setUrl(aLiYunOss.getPoint()+ ossResult.getPath());
		return ossResult;// aiYunOss.getEndpoint().replace("http://", "http://"
							// + aiYunOss.getBucket() + ".") + "/" + ossKey;
	}

	@Override
	public OSSResultModel saveFile(String key, File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OSSResultModel saveFile(String key, ByteArrayInputStream byteArrayInputStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OSSResultModel saveFile(String key, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OSSResultModel saveFile(String key, URL url) {
		// TODO Auto-generated method stub
		return null;
	}

}
