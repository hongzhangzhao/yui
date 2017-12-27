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
	private User user;
	private User customer;
	private Date birth;
	private String tip;

	public void setUser(User user) 
	{
		this.user = user; 
	}

	public void setCustomer(User customer) 
	{
		this.customer = customer; 
	}

	public void setTip(String tip)
	{
		this.tip = tip; 
	}
	
	public void setBirth(Date d)
	{
		this.birth = d;
	}

	public User getUser() 
	{
		return (this.user); 
	}

	public User getCustomer() 
	{
		return (this.customer); 
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
        if (getUser().getName().equals("scott")
			&& getUser().getPass().equals("tiger") )
		{
			setTip("ת���ɹ�");
            return SUCCESS;
        }
		else
		{
			setTip("ת��ʧ��");
            return ERROR;
        }
    }
}