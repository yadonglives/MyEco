package cyd.dmw.myeco.server.user.interfaces;

import cyd.dmw.myeco.server.user.interfaces.entity.request.LoginRequest;
import cyd.dmw.myeco.server.user.interfaces.entity.response.LoginResponse;

/**
 * 
 *
 * @description	：用户服务 
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:26:38
 */
public interface IUserService {

	/**
	 * 登录
	 * @return
	 */
	public LoginResponse login(LoginRequest loginRequest);
	
}
