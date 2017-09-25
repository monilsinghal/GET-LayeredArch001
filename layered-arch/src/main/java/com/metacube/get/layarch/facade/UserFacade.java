package com.metacube.get.layarch.facade;

import com.metacube.get.layarch.dao.user.UserDao;
import com.metacube.get.layarch.dto.UserDto;
import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 25-Sep-17.
 */
public interface UserFacade
{
	Iterable<UserDto> getAllUsers();
	UserDto getUserById(int id);
}
