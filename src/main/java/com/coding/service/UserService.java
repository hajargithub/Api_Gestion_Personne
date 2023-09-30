package com.coding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.dao2.IUserDao;
import com.coding.entity.User;




@Service
public class UserService implements IuserService {
	
	@Autowired
	IUserDao userDao;
	
	public User chercherparUsername(String username)
	{
		return userDao.findByUsername(username);
	}

}
