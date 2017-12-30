package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

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

    public String getPassword()
	{
        return password;
    }

    public void setPassword(String password)
	{
        this.password = password;
    }

    public String getUsername()
	{
        return username;
    }

    public void setUsername(String username)
	{
        this.username = username;
    }


    public String execute() throws Exception
	{
        ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer)ctx.getApplication().get("counter");
		if (counter == null)
		{
			counter = 1;
		}
		else
		{
			counter = counter + 1;
		}
		ctx.getApplication().put("counter" , counter);
		ctx.getSession().put("user" , getUsername());

        if (getUsername().equals("scott")
                && getPassword().equals("tiger") )
		{
			ctx.put("tip" , "服务器提示：您已经成功的登陆");
            return SUCCESS;
        }
		else
		{
			ctx.put("tip" , "服务器提示：登陆失败");
            return ERROR;
        }
    }


}
