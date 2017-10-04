package com.metacube.get.layarch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Monil on 04-Oct-17.
 */
@Entity
@Table(name= "UserRole")
public class UserRole
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column(name = "code", length = 20, nullable = false)
	private String code;

	@Column(name = "roleDescription")
	private String roleDescription;

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getRoleDescription()
	{
		return roleDescription;
	}

	public void setRoleDescription(final String roleDescription)
	{
		this.roleDescription = roleDescription;
	}
}
