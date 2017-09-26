package com.metacube.get.layarch.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.get.layarch.dao.user.UserDao;
import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 25-Sep-17.
 */
@Component("userService")
public class DefaultUserService implements UserService
{
	UserDao userDao;

	@Autowired
	public DefaultUserService(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override public Iterable<User> getAllUsers()
	{
		return userDao.findAll();
	}

	@Override public User getUserById(final int id)
	{
		return userDao.findOne(id);
	}
}
