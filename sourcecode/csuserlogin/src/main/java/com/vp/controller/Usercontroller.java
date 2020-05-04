package com.vp.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import com.vp.model.User;
import com.vp.service.IUserservice;



@RestController
@CrossOrigin(origins="https://localhost:4200",maxAge=3600)

public class Usercontroller {

	@Autowired
	IUserservice userservice;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userservice.getAllUser();
	}
	
	@PostMapping("/user")
	public void insertUser(@Valid @RequestBody User user) {
		userservice.saveUser(user);
	}
	
	
	
	
}
