package com.springrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Users;
import com.springrest.service.UserService;

@RestController
public class UserResource {
	@Autowired
	UserService userService = new UserService();

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(Users user) {
		userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
	public Users loginUser(Users user) {
		return userService.loginUser(user);
	}
}
