package com.metacube.get.layarch.dto;

/**
 * Created by Monil on 25-Sep-17.
 */
public class UserDto
{
	private int id;
	private String firstname;
	private String lastname;
	private boolean active;
	private String type;

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(final String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(final String lastname)
	{
		this.lastname = lastname;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(final boolean active)
	{
		this.active = active;
	}

	public String getType()
	{
		return type;
	}

	public void setType(final String type)
	{
		this.type = type;
	}
}
