package lee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
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
    private String username;
    private String password;

    public String getUsername()
	{
        return username;
    }
    public void setUsername(String username)
	{
        this.username = username;
    }

    public String getPassword()
	{
        return password;
    }
    public void setPassword(String password)
	{
        this.password = password;
    }

	public String execute() throws Exception
	{
        if (getUsername().equals("scott")
                && getPassword().equals("tiger") )
		{
			ActionContext.getContext().getSession().put("user" , getUsername());
            return SUCCESS;
        }
		else
		{
            return ERROR;
        }
    }


	public void validate()
	{
		if (getUsername() == null || getUsername().trim().equals(""))
		{
			addFieldError("username", getText("user.required"));
		}
		if (getPassword() == null || getPassword().trim().equals(""))
		{
			addFieldError("password", getText("pass.required"));
		}
	}

}
