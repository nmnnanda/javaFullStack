package com.learning.SpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBootApp.entity.User;
import com.learning.SpringBootApp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
   private UserRepository userRepo;
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	public User getById(int id){
		User fetchedUser = userRepo.findById(id).get();
		if(fetchedUser!=null){
			return fetchedUser;
		}
		return null;
	}
	
	public User createUser(User user){
		return userRepo.save(user);
	}
	
	public User updateUser(int id ,User newUser){
		User dbUser = userRepo.findById(id).get();
		dbUser.setEmail(newUser.getEmail());
		dbUser.setPassword(newUser.getPassword());
		
		return userRepo.save(dbUser);
	}
	
	public User deleteUser(int id){
		User fetchedUser = userRepo.findById(id).get();
		if(fetchedUser!=null){
			userRepo.delete(fetchedUser);
			return fetchedUser;
		}
		return null;
	}
	
	
	
	
}
