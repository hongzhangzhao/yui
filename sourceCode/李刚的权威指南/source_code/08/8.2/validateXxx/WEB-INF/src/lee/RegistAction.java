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

    @Override
    public void validate()
	{
		System.out.println("进入validate方法进行校验");
		
		if(name != null && !Pattern.matches("\\w{4,25}", name.trim()))
		{
			addFieldError("user" , "您输入用户名必须是字母和数字，且长度必须是4到25之间！");
		}

		if (pass != null && !Pattern.matches("\\w{4,25}", pass.trim()))
		{
			addFieldError("pass" , "您输入密码必须是字母和数字，且长度必须是4到25之间！");
		}
		if (age > 150 || age <= 0)
		{	
			addFieldError("age" , "您输入的年龄必须是一个有效的年龄！");
		}	
        Calendar end = Calendar.getInstance();
		end.set(2050 , 2 , 21);
        Calendar start = Calendar.getInstance();
		start.set(1900 , 1 , 1);
		if (birth != null && (birth.after(end.getTime()) || birth.before(start.getTime())))
		{
			addFieldError("birth" , "您输入的生日必须在一个有效的时间段内");
		}
	}

	public void validateRegist()
	{
		System.out.println("----------------进入validateXxx方法进行校验");
		
		if(name != null && !Pattern.matches("\\w{4,25}", name.trim()))
		{
			addFieldError("user" , "ValidateXxx方法：您输入用户名必须是字母和数字，且长度必须是4到25之间！");
		}

		if (pass != null && !Pattern.matches("\\w{4,25}", pass.trim()))
		{
			addFieldError("pass" , "ValidateXxx方法：您输入密码必须是字母和数字，且长度必须是4到25之间！");
		}
		if (age > 150 || age <= 0)
		{	
			addFieldError("age" , "ValidateXxx方法：您输入的年龄必须是一个有效的年龄！");
		}	
        Calendar end = Calendar.getInstance();
		end.set(2050 , 2 , 21);
        Calendar start = Calendar.getInstance();
		start.set(1900 , 1 , 1);
		if (birth != null && (birth.after(end.getTime()) || birth.before(start.getTime())))
		{
			addFieldError("birth" , "ValidateXxx方法：您输入的生日必须在一个有效的时间段内");
		}
	}


	public String regist()
	{
		return SUCCESS;
	}
}