package lee;

import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginAction implements Action 
{
	private String user;
	private String pass;

	
	public void setUser(String user)
	{
		this.user = user; 
	}
	public String getUser() 
	{
		return (this.user); 
	}
	
	public void setPass(String pass)
	{
		this.pass = pass; 
	}

	public String getPass()
	{
		return (this.pass); 
	}

	public String execute()
	{
		ActionContext.getContext().getSession().put("user" , getUser());
		return SUCCESS;
	}
}
