package lee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.util.*;
import java.util.regex.*;
import java.text.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class RegistAction extends ActionSupport
{
	private String name;
	private String pass;
	private int age;
	private Date birth;

	public void setName(String name) 
	{
		this.name = name; 
	}

	public void setPass(String pass)
	{
		this.pass = pass; 
	}

	public void setAge(int age)
	{
		this.age = age; 
	}

	public void setBirth(Date birth) 
	{
		this.birth = birth; 
	}

	public String getName()
	{
		return (this.name); 
	}

	public String getPass() 
	{
		return (this.pass); 
	}

	public int getAge() {
		return (this.age); 
	}

	public Date getBirth()
	{
		return (this.birth); 
	}
}