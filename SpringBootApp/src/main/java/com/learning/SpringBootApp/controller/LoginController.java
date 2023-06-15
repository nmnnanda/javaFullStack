package com.learning.SpringBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBootApp.entity.UserLogin;
import com.learning.SpringBootApp.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public String getLoggedIn(@RequestBody UserLogin userLogin){
		return loginService.getLogIn(userLogin);
		
	}

}
