package cyd.dmw.myeco.server.user.interfaces.entity.request;

import com.dmw.myeco.server.core.entity.Request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 *
 * @description	：登录 
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:41:30
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LoginRequest extends Request {

	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 安全码
	 */
	private String securityCode;
	
}
