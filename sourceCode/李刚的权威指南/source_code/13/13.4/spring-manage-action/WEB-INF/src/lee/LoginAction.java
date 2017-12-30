package lee;

import com.opensymphony.xwork2.Action;

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
	private String username;
	private String password;
	private String tip;

	private MyService ms;
	public void setMs(MyService ms)
	{
		this.ms = ms;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		 return this.username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		 return this.password;
	}

	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		 return this.tip;
	}



    public String execute() throws Exception
	{
        if (ms.valid(getUsername(), getPassword()))
		{
			setTip("哈哈，整合成功！");
            return SUCCESS;
        }
		else
		{
            return ERROR;
        }
	}
}