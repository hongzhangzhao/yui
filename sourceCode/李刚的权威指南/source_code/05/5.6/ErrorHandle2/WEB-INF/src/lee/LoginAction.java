package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.List;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction extends ActionSupport
{
	private User user;
	
	public void setUser(User user)
	{
		this.user = user;
	}

	public User getUser()
	{
		return user;
	}

	public String execute()
	{
		System.out.println(getUser());
		return SUCCESS;
	}

}