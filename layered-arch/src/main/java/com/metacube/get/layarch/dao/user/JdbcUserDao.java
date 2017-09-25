package com.metacube.get.layarch.dao.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.get.layarch.dao.GenericJdbcDao;
import com.metacube.get.layarch.model.User;

/**
 * Created by Monil on 25-Sep-17.
 */
public class JdbcUserDao extends GenericJdbcDao<User, Integer> implements UserDao
{

	@Override protected String getTableName()
	{
		return "User";
	}

	@Override protected User extractResultSetRow(final ResultSet resultSet)
	{
		User user = new User();


		try
		{
			user.setActive(resultSet.getBoolean("active"));
			user.setType(resultSet.getString("type"));
			user.setFirstName(resultSet.getString("firstname"));
			user.setLastName(resultSet.getString("lastname"));
			user.setId(resultSet.getInt("id"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}


		return user;
	}

	@Override protected String getPrimaryKeyColoumnName()
	{
		return "id";
	}
}
