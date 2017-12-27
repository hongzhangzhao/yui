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

public class RegistAction extends BaseAction
{
	private String user;
	private String pass;
	private String email;
	private String vercode;


	@Override
	public String execute() throws Exception
	{
		Map session = ActionContext.getContext().getSession();
        String ver2 = (String )session.get("rand");
		session.put("rand" , null);
        if (vercode.equals(ver2))
        {
			if (mgr.addUser(user, pass , email) > 0)
			{
				return SUCCESS;
			}
			else
			{
				addActionError("注册失败，请重试！");
				return "failure";
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

	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		 return this.email;
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