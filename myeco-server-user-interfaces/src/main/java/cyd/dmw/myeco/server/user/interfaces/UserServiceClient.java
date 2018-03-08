package cyd.dmw.myeco.server.user.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import cyd.dmw.myeco.server.user.interfaces.entity.request.LoginRequest;
import cyd.dmw.myeco.server.user.interfaces.entity.response.LoginResponse;

@FeignClient(value="service-user", fallback=UserServiceClientFallback.class)
public interface UserServiceClient extends IUserService {
	
	@RequestMapping()
	@Override
	LoginResponse login(LoginRequest loginRequest);
}
