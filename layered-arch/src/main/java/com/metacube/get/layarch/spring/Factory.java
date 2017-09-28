package com.metacube.get.layarch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.metacube.get.layarch.MyConfiguration;

/**
 * Created by Monil on 26-Sep-17.
 */
public class Factory
{

	static ApplicationContext applicationContext;

	static {
		applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
	}

	static public ApplicationContext getApplicationContext()
	{
		return applicationContext;
	}

}
