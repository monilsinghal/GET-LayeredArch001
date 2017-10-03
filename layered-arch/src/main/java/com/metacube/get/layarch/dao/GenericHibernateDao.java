package com.metacube.get.layarch.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 03-Oct-17.
 */
public abstract class GenericHibernateDao<T, ID extends Serializable> implements AbstractDao<T,ID>
{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Class<T> modelClass;

	public Class<T> getModelClass()
	{
		return modelClass;
	}

	public GenericHibernateDao(Class<T> modelClass) {
		this.modelClass = modelClass;
	}

	@Override public Iterable<T> findAll()
	{
		Session session = this.sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(getModelClass());
		List<T> personsList = cr.list();
		return personsList;
	}

	@Override public T findOne(final ID primaryKey)
	{
		return null;
	}


	@Override public <S extends T> S save(final S entity)
	{
		return null;
	}

	@Override public boolean exists(final ID primaryKey)
	{
		return false;
	}

	@Override public void delete(final T entity)
	{

	}

	@Override public Long count()
	{
		return null;
	}
}
