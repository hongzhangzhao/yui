package org.yeeku.action;

import java.util.*;
import com.opensymphony.xwork2.ActionContext;

import org.yeeku.service.AuctionManager;
import org.yeeku.exception.AuctionException;
import org.yeeku.action.base.BaseAction;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AddKindAction extends BaseAction
{
	private String name;
	private String desc;
	private String vercode;

	public String execute()throws Exception
	{
		Map session = ActionContext.getContext().getSession();
        String ver2 = (String)session.get("rand");
        session.put("rand" , null);
        if (vercode.equals(ver2))
        {                
            mgr.addKind(name , desc);
            return SUCCESS;
        }
        else
        {
            addActionError("验证码不匹配,请重新输入");
            return INPUT;
        }
	}


	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDesc()
	{
		 return this.desc;
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