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
public class ViewFailAction extends BaseAction
{
	private List failItems;

	public String execute()throws Exception
	{
		setFailItems(mgr.getFailItems());
		return SUCCESS;
	}

	public void setFailItems(List failItems)
	{
		this.failItems = failItems;
	}
	public List getFailItems()
	{
		 return this.failItems;
	}
}