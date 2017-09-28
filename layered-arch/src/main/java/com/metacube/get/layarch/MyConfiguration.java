package com.metacube.get.layarch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.metacube.get.layarch.dao.user.JdbcUserDao;
import com.metacube.get.layarch.dao.user.UserDao;
import com.metacube.get.layarch.service.DefaultUserService;
import com.metacube.get.layarch.service.UserService;

/**
 * Created by Monil on 28-Sep-17.
 */
@Configuration
@ComponentScan("com.metacube.get.layarch.facade")
public class MyConfiguration
{
	@Bean(name = "userDao")
	public UserDao getJdbcUserDao()
	{
		JdbcUserDao userDao = new JdbcUserDao();
		return userDao;
	}

	@Bean
	public UserService getDefaultUserService()
	{
		DefaultUserService userService = new DefaultUserService(getJdbcUserDao());

		return  userService;
	}

}
