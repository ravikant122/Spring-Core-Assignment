package com.TraineeMgt.service;

import java.util.List;

import com.TraineeMgt.dao.UserDao;
import com.TraineeMgt.dao.UserDaoImpl;
import com.TraineeMgt.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao=new UserDaoImpl();
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
