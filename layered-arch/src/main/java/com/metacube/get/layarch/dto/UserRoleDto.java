package com.metacube.get.layarch.dto;

/**
 * Created by Monil on 04-Oct-17.
 */
public class UserRoleDto
{
	private int id;
	private String code;
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
