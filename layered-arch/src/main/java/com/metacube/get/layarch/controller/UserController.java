package com.metacube.get.layarch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.metacube.get.layarch.dto.UserDto;
import com.metacube.get.layarch.facade.UserFacade;

/**
 * Created by Monil on 25-Sep-17.
 */
@Controller
@RequestMapping("/service/user")
public class UserController
{
	@Autowired
	UserFacade userFacade;

	@RequestMapping(value = "/list", produces = "application/json")
	public @ResponseBody Iterable<UserDto> getUsers() {
		return userFacade.getAllUsers();
	}
}
