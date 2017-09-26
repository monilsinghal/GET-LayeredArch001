package com.metacube.get.layarch.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.metacube.get.layarch.dao.user.JdbcUserDao;
import com.metacube.get.layarch.facade.DefaultUserFacade;
import com.metacube.get.layarch.facade.UserFacade;
import com.metacube.get.layarch.model.User;
import com.metacube.get.layarch.service.DefaultUserService;
import com.metacube.get.layarch.spring.Factory;

/**
 * Created by Monil on 25-Sep-17.
 */
@Path("/user")
public class UserController
{
	UserFacade userFacade;

	public UserController() {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		userFacade = Factory.getApplicationContext().getBean("userFacade", UserFacade.class);

		//userFacade = new DefaultUserFacade(new DefaultUserService(new JdbcUserDao()));
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {

		return Response.status(Response.Status.OK).entity(userFacade.getAllUsers()).build();

	}
}
