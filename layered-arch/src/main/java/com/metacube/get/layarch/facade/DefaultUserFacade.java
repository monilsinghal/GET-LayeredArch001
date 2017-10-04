package com.metacube.get.layarch.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.get.layarch.dto.UserDto;
import com.metacube.get.layarch.dto.UserRoleDto;
import com.metacube.get.layarch.model.User;
import com.metacube.get.layarch.model.UserRole;
import com.metacube.get.layarch.service.DefaultUserService;
import com.metacube.get.layarch.service.UserService;

/**
 * Created by Monil on 25-Sep-17.
 */
@Component("userFacade")
public class DefaultUserFacade implements UserFacade
{
	@Autowired
	UserService userService;

	public DefaultUserFacade() {

	}

	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	public UserService getUserService()
	{
		return userService;
	}

	public DefaultUserFacade(UserService userService) {
		this.userService = userService;
	}


	@Override public Iterable<UserDto> getAllUsers()
	{
		List<UserDto> userDtoList = new ArrayList<>();

		for (User user : userService.getAllUsers()) {
			userDtoList.add(modelToDto(user));
		}

		return userDtoList;
	}

	@Override public UserDto getUserById(final int id)
	{
		return modelToDto(userService.getUserById(id));
	}

	protected User dtoToModel(UserDto userDto) {
		if (userDto == null) {
			return null;
		}
		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstname());
		user.setLastName(userDto.getLastname());
		user.setActive(userDto.isActive());
		user.setType(userDto.getType());

		if (userDto.getRole() != null) {
			UserRole role = new UserRole();
			role.setId(userDto.getRole().getId());
			role.setCode(userDto.getRole().getCode());
			role.setRoleDescription(userDto.getRole().getRoleDescription());
			user.setUserRole(role);
		}

		return user;
	}

	protected UserDto modelToDto(User user) {
		if (user == null) {
			return null;
		}
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstName());
		userDto.setLastname(user.getLastName());
		userDto.setActive(user.isActive());
		userDto.setType(user.getType());

		if (user.getUserRole() != null) {
			UserRoleDto role = new UserRoleDto();
			role.setId(user.getUserRole().getId());
			role.setCode(user.getUserRole().getCode());
			role.setRoleDescription(user.getUserRole().getRoleDescription());
			userDto.setRole(role);
		}

		return userDto;
	}
}
