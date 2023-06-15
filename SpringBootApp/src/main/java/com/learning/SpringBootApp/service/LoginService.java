package com.learning.SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBootApp.entity.User;
import com.learning.SpringBootApp.entity.UserLogin;
import com.learning.SpringBootApp.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public String getLogIn(UserLogin userLogin){
		User user =  userRepo.findByEmail(userLogin.getEmail());
		if(user!=null){
		if(user.getPassword().equals(userLogin.getPassword())){
			return "Login successfull";
		}
		return "Incorrect password";
		}
		return "User not found";
	}

}
