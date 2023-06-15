package com.learning.SpringBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBootApp.entity.User;
import com.learning.SpringBootApp.service.UserService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1")
public class UserController {
   
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/user/{id}")
	public User getById(@PathVariable int id){
		return userService.getById(id);
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User newUser){
		return userService.createUser(newUser);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User newUser){
		return userService.updateUser(id, newUser);
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable int id){
		return userService.deleteUser(id);
	}
	

	
}
