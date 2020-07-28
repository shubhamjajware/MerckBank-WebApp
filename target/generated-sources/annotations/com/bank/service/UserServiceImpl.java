package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.dao.UserDao;
import com.bank.model.Login;
import com.bank.model.User;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void register(User user) {
		userDao.register(user);
		
	}

	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}
	
	

}
