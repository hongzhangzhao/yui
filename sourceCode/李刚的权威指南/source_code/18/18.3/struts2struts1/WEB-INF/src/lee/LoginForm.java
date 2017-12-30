package lee;

import org.apache.struts.action.*;
import org.apache.struts.validator.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginForm extends ActionForm
{
    private String username;
    private String password;

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

}