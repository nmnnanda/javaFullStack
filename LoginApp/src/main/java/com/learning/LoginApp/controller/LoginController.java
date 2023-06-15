package com.learning.LoginApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.LoginApp.entities.LoginPage;
import com.learning.LoginApp.entities.Student;
import com.learning.LoginApp.service.LoginService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1")
public class LoginController {
  
	@Autowired
	private LoginService loginService;
	@PostMapping("/login")
	public ResponseEntity<?> getLoggedIn(@RequestBody LoginPage loginData){
		Student student = loginService.getStudent(loginData);
		if(student.getPassword().equals(loginData.getPassword()))
	        return ResponseEntity.ok(student);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
	}
}
