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
		System.out.println("����validate��������У��");
		
		if(name != null && !Pattern.matches("\\w{4,25}", name.trim()))
		{
			addFieldError("user" , "�������û�����������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡");
		}

		if (pass != null && !Pattern.matches("\\w{4,25}", pass.trim()))
		{
			addFieldError("pass" , "�����������������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡");
		}
		if (age > 150 || age <= 0)
		{	
			addFieldError("age" , "����������������һ����Ч�����䣡");
		}	
        Calendar end = Calendar.getInstance();
		end.set(2050 , 2 , 21);
        Calendar start = Calendar.getInstance();
		start.set(1900 , 1 , 1);
		if (birth != null && (birth.after(end.getTime()) || birth.before(start.getTime())))
		{
			addFieldError("birth" , "����������ձ�����һ����Ч��ʱ�����");
		}
	}

	public void validateRegist()
	{
		System.out.println("----------------����validateXxx��������У��");
		
		if(name != null && !Pattern.matches("\\w{4,25}", name.trim()))
		{
			addFieldError("user" , "ValidateXxx�������������û�����������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡");
		}

		if (pass != null && !Pattern.matches("\\w{4,25}", pass.trim()))
		{
			addFieldError("pass" , "ValidateXxx�����������������������ĸ�����֣��ҳ��ȱ�����4��25֮�䣡");
		}
		if (age > 150 || age <= 0)
		{	
			addFieldError("age" , "ValidateXxx����������������������һ����Ч�����䣡");
		}	
        Calendar end = Calendar.getInstance();
		end.set(2050 , 2 , 21);
        Calendar start = Calendar.getInstance();
		start.set(1900 , 1 , 1);
		if (birth != null && (birth.after(end.getTime()) || birth.before(start.getTime())))
		{
			addFieldError("birth" , "ValidateXxx����������������ձ�����һ����Ч��ʱ�����");
		}
	}


	public String regist()
	{
		return SUCCESS;
	}
}