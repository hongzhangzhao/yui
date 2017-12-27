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
public class ViewBidAction extends BaseAction
{
	private List bids;
	
	public String execute()throws Exception
	{
		Map session = ActionContext.getContext().getSession();
        Integer userId = (Integer)session.get("userId");
		setBids(mgr.getBidByUser(userId));
		return SUCCESS;
	}

	public void setBids(List bids)
	{
		this.bids = bids;
	}

	public List getBids()
	{
		 return this.bids;
	}

}