package com.dmw.myeco.server.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cyd.dmw.myeco.server.user.interfaces.IUserService;
import cyd.dmw.myeco.server.user.interfaces.entity.request.LoginRequest;
import cyd.dmw.myeco.server.user.interfaces.entity.response.LoginResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 *
 * @description	：用户服务 
 * @author	： 崔亚东
 * @since	： 2018年3月7日 下午5:47:30
 */
@Slf4j
@RestController("user")
public class UserService implements IUserService {

	@Override
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public LoginResponse login(@RequestParam LoginRequest loginRequest) {
		log.info("用户登录：用户名---"+loginRequest.getUsername()+"");
		return null;
	}

}