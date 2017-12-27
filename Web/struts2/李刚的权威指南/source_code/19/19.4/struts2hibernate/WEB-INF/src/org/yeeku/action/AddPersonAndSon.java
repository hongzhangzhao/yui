package org.yeeku.action;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.*;

import org.yeeku.service.*;
import org.yeeku.factory.*;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AddPersonAndSon extends ActionSupport
{
	private String name;
	private String gender;
	private String sonName;
	private int sonAge;
	
    public String execute()throws Exception
    {
        String[] sonNames = {sonName};
        int[] sonAges = {sonAge};
        PersonService ps = (PersonService)AppFactory.instance().getApp("personService");
        ps.createPersonAndSon(name , gender , sonNames , sonAges);
        return SUCCESS;		
    }

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		 return this.gender;
	}

	public void setSonName(String sonName)
	{
		this.sonName = sonName;
	}
	public String getSonName()
	{
		 return this.sonName;
	}

	public void setSonAge(int sonAge)
	{
		this.sonAge = sonAge;
	}
	public int getSonAge()
	{
		 return this.sonAge;
	}

}