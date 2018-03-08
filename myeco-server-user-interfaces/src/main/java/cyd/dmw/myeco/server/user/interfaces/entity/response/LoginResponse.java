package cyd.dmw.myeco.server.user.interfaces.entity.response;

import com.dmw.myeco.server.core.entity.Response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 *
 * @description	： 登录响应
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:32:56
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LoginResponse extends Response {

	/**
	 * 客户端可以看到的用户信息
	 */
	private ClientUser clientUser;
	
	/**
	 * LoginResponse
	 */
	public LoginResponse() { }
	
	/**
	 * LoginResponse
	 * @param clientUser
	 */
	LoginResponse(ClientUser clientUser){
		this.clientUser = clientUser;
	}
	
}
