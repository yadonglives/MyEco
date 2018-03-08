package com.dmw.myeco.server.core.entity;

import lombok.Data;

/**
 * 
 *
 * @description	： 用户信息
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:16:34
 */
@Data
public class User {

	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;
	
}
