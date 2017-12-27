package org.yeeku.model;

import java.io.Serializable;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class User implements Serializable
{
	//标识属性
	private int id;
	//用户名属性
	private String user;
	//密码属性
	private String pass;
	//电子邮件属性
	private String email;

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		 return this.id;
	}

	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		 return this.user;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		 return this.pass;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		 return this.email;
	}

}