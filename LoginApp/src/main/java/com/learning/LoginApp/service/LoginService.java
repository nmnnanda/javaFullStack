package com.learning.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.LoginApp.entities.LoginPage;
import com.learning.LoginApp.entities.Student;
import com.learning.LoginApp.repository.StudentRepository;

@Service
public class LoginService {
	@Autowired
	private StudentRepository studentRepo;
	
	public Student getStudent(LoginPage loginData){
		return studentRepo.findByEmail(loginData.getEmail());
	}

}
