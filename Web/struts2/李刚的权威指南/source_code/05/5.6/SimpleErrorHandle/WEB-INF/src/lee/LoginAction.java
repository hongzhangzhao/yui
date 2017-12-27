package lee;

import com.opensymphony.xwork2.ActionSupport;

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
	private String tip;

	public void setUser(User user) 
	{
		this.user = user; 
	}

	public void setTip(String tip)
	{
		this.tip = tip; 
	}

	public User getUser() 
	{
		return (this.user); 
	}

	public String getTip() 
	{
		return (this.tip); 
	}

    public String execute() throws Exception
	{
        if (getUser().getName().equals("scott")
			&& getUser().getPass().equals("tiger") )
		{
			setTip("转换成功");
            return SUCCESS;
        }
		else
		{
			setTip("转换失败");
            return ERROR;
        }
    }
}