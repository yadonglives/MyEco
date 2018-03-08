package cyd.dmw.myeco.server.user.interfaces;

import cyd.dmw.myeco.server.user.interfaces.entity.request.LoginRequest;
import cyd.dmw.myeco.server.user.interfaces.entity.response.LoginResponse;

public class UserServiceClientFallback implements UserServiceClient {

	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		return null;
	}

}
