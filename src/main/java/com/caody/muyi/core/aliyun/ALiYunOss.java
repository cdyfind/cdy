package com.caody.muyi.core.aliyun;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ALiYunOss {
    @Value("${bucket}")
	private String bucket;
    @Value("${accesskeyid}")
	private String accesskeyid;
    @Value("${accesskeysecret}")
	private String accesskeysecret;
    @Value("${endpoint}")
	private String endpoint;
    @Value("${protocol}")
	private String protocol;
    @Value("${domain}")
	private String customdomain;
    @Value("${starpoint}")
	private String starpoint;
    @Value("${product}")
	private String product;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 协议
	 * 
	 * @return
	 */
	
	public String getAccesskeyid() {
		return accesskeyid;
	}

	public void setAccesskeyid(String accesskeyid) {
		this.accesskeyid = accesskeyid;
	}

	public String getAccesskeysecret() {
		return accesskeysecret;
	}

	public void setAccesskeysecret(String accesskeysecret) {
		this.accesskeysecret = accesskeysecret;
	}
	
	public String getProtocol() {
		return protocol;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}


	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getStarpoint() {
		return starpoint;
	}

	public void setStarpoint(String starpoint) {
		this.starpoint = starpoint;
	}

	/**
	 * 协议
	 * 
	 * @return
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}


	/**
	 * 获取域名
	 * 
	 * @return
	 */
	public String getDomain() {
		if (StringUtils.isEmpty(customdomain))
			return getEndpoint().replace(getProtocol() + "://", getProtocol() + "://" + getBucket() + ".");
		else
			return this.customdomain;

	}
	
	
	public String getCustomdomain() {
		return customdomain;
	}
	
	/**
	 * 自定义域名，如果存在自定义域名，则直接使用自定义域名
	 * 
	 * @return
	 */

	public void setCustomdomain(String customdomain) {
		this.customdomain = customdomain;
	}

	/**
	 * 获取图片路径
	 * 
	 * @return
	 */
	public String getPoint(){
		return (this.protocol+"://"+this.starpoint+"."+this.endpoint+"/");
	}
	

}
