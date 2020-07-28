package com.bank.dao;

import com.bank.model.Login;
import com.bank.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
	

}
