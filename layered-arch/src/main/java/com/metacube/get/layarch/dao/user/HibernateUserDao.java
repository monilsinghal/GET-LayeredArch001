package com.metacube.get.layarch.dao.user;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metacube.get.layarch.dao.GenericHibernateDao;
import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 03-Oct-17.
 */
@Repository("hibernateUserDao")
public class HibernateUserDao extends GenericHibernateDao<User, Integer> implements UserDao
{
	public HibernateUserDao()
	{
		super(User.class);
	}
}
