package cyd.dmw.myeco.server.user.interfaces.entity.response;

import lombok.Data;

/**
 * 
 *
 * @description	：客户端可用用户信息 
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:41:56
 */
@Data
public class ClientUser {

	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 年龄
	 */
	private String age;
	
}
