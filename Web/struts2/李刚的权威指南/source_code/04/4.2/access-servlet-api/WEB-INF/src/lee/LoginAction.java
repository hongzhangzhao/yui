package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.ServletResponseAware;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction implements Action , ServletResponseAware
{
	private HttpServletResponse response;

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

	public void setServletResponse(HttpServletResponse response) 
	{
		this.response = response;
	}

    public String execute() throws Exception
	{
		Cookie c = new Cookie("user" , getUsername());
		c.setMaxAge(60 * 60);
		response.addCookie(c);
		return SUCCESS;

    }
}
