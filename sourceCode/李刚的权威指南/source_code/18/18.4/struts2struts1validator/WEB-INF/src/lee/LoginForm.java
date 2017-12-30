package lee;

import org.apache.struts.action.*;
import org.apache.struts.validator.*;
import javax.servlet.http.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginForm extends ValidatorForm
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

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) 
	{
        ActionErrors errors = super.validate(mapping, request);
        if (username != null && username.length() < 4)
		{
			errors.add("username", new ActionMessage("用户名长度必须大于等于4！"));
        }
        return errors;
    }

}