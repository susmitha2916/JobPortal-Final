package com.vp.service;

import java.util.List;

import com.vp.model.User;

public interface IUserservice {
	
	public List<User> getAllUser();
	public void saveUser(User user);
	
}
