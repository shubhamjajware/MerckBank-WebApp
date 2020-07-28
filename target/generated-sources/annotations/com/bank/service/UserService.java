package com.bank.service;


import com.bank.model.Login;
import com.bank.model.User;

public interface UserService {
	
	void register(User user);
	User validateUser(Login login);

}
