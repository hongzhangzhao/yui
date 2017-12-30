package lee;

import com.opensymphony.xwork2.Action;
import java.util.Date;
import java.util.Set;

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
	private Set user;
	private Date birth;
	private String tip;

	public void setUser(Set  user) 
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

	public Set  getUser() 
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
		return SUCCESS;
    }
}