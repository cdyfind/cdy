package com.caody.muyi.core.aliyun;

/**
 * OSS返回数据
 * 
 * @author caody
 *
 */
public class OSSResultModel {
	private String url = "";
	private String path = "";
	private String host = "";

	/**
	 * 完整URL地址
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 完整URL地址
	 * 
	 * @return
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 相对路径
	 * 
	 * @return
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 相对路径
	 * 
	 * @return
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 主机地址
	 * 
	 * @return
	 */
	public String getHost() {
		return host;
	}

	/**
	 * 主机地址
	 * 
	 * @return
	 */
	public void setHost(String host) {
		this.host = host;
	}

}
