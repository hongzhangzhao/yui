package lee;

import com.opensymphony.xwork2.Action;
import java.util.Date;

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
	private User[] user;
	private Date birth;
	private String tip;

	public void setUser(User[] user) 
	{
		this.user = user; 
	}

	public void setTip(String tip)
	{
		this.tip = tip; 
	}
	
	public void setBirth(Date d)
	{
		this.birth = d;
	}

	public User[] getUser() 
	{
		return (this.user); 
	}

	public Date getBirth()
	{
		return this.birth;
	}

	public String getTip() 
	{
		return (this.tip); 
	}

    public String execute() throws Exception
	{
        if (getUser()[0].getName().equals("scott")
			&& getUser()[0].getPass().equals("tiger") )
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