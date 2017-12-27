package org.yeeku.action;

import com.opensymphony.xwork2.ActionContext;

import java.util.*;
import org.yeeku.action.base.BaseAction;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction extends BaseAction
{
	private String user;
	private String pass;
	private String vercode;


	@Override
	public String execute() throws Exception
	{
		Map session = ActionContext.getContext().getSession();
        String ver2 = (String )session.get("rand");
        if (vercode.equals(ver2))
        {
            int userId = mgr.loginValid(user , pass);
            if (userId > 0)
            {
                session.put("userId" , userId);
                return SUCCESS;
            }
            else
            {
                addActionError("用户名/密码不匹配");
            }
        }
        else
        {
			addActionError("验证码不匹配,请重新输入");
        }
		return "failure";
	}

	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		 return this.user;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		 return this.pass;
	}

	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		 return this.vercode;
	}
}