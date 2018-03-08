package com.dmw.myeco.server.core.entity;

import lombok.Data;

/**
 * 
 *
 * @description	：响应 
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:59:16
 */
@Data
public class Response {

	/**
	 * 成功
	 */
	public static final String SUCCESS = "success";
	
	/**
	 * 失败
	 */
	public static final String FAIL = "fail";
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 消息
	 */
	private String message;
	
}
