package lee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.util.*;


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

    public void setUsername(String username)
	{
        this.username = username;
    }
    public String getUsername()
	{
        return username;
    }

    public void setPassword(String password)
	{
        this.password = password;
    }
    public String getPassword()
	{
        return password;
    }

    public String execute() throws Exception
	{
		System.out.println("����execute����ִ����..........");
		Thread.sleep(1500);
        if (getUsername().equals("scott")
			&& getPassword().equals("tiger") )
		{
			ActionContext ctx = ActionContext.getContext();
			Map session = ctx.getSession();
			session.put("user" , getUsername());
            return SUCCESS;
        }
		else
		{
            return ERROR;
        }
    }


}
