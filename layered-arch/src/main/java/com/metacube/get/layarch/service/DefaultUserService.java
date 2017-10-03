package com.metacube.get.layarch.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.metacube.get.layarch.dao.user.UserDao;
import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 25-Sep-17.
 */
@Service("userService")
@Transactional
public class DefaultUserService implements UserService
{
	@Resource(name = "hibernateUserDao")
	UserDao userDao;

	public UserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(final UserDao userDao)
	{
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
