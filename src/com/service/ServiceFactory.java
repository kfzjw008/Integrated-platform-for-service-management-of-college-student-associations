package com.service;

import com.service.impl.UserServiceImpl;

import java.util.Optional;

public class ServiceFactory {
	private static UserService userService;
	public static UserService getUserService() {
		return Optional.ofNullable(userService)
				.orElseGet(() ->{
					userService = new UserServiceImpl();
					return userService;}); 
	}
}
