package com.metacube.get.layarch.service;

import java.util.List;

import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 25-Sep-17.
 */
public interface UserService
{
	Iterable<User> getAllUsers();
	User getUserById(int id);
}
