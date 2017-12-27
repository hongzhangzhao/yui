package lee;

import com.opensymphony.xwork2.Action;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

//Ҫ����У�����Ӧ�ü̳�ActionSupport
public class LoginAction extends ActionSupport
{
	private List<User> users;
	
	public void setUsers(List<User> users)
	{
		this.users = users;
	}

	public List<User> getUsers()
	{
		return users;
	}

	public String execute()
	{
		System.out.println(getUsers());
		return SUCCESS;
	}

}