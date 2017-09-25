package com.metacube.get.layarch.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.metacube.get.layarch.dao.user.JdbcUserDao;
import com.metacube.get.layarch.facade.DefaultUserFacade;
import com.metacube.get.layarch.facade.UserFacade;
import com.metacube.get.layarch.model.User;
import com.metacube.get.layarch.service.DefaultUserService;

/**
 * Created by Monil on 25-Sep-17.
 */
@Path("/user")
public class UserController
{
	UserFacade userFacade;

	public UserController() {
		userFacade = new DefaultUserFacade(new DefaultUserService(new JdbcUserDao()));
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {

		return Response.status(Response.Status.OK).entity(userFacade.getAllUsers()).build();

	}
}
