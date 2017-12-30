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
public class AddBidAction extends BaseAction
{
	private int itemId;
	private double bidPrice;
	private double maxPrice;
	private String vercode;

	@Override
	public void validate()
	{
		if(bidPrice <= maxPrice)
		{
			addFieldError("bidPrice", "������ľ��۱�����ڵ�ǰ��߼ۣ�");
		}
	}

	public String execute() throws Exception
	{
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer)session.get("userId");
		String ver2 = (String)session.get("rand");
		session.put("rand" , null);
        if (vercode.equals(ver2))
        {
            mgr.addBid(userId , itemId , bidPrice);  
            return SUCCESS;
        }
        else
        {
            addActionError("��֤�벻ƥ��,����������");
            return INPUT;
        }
	}

	public void setItemId(int itemId)
	{
		this.itemId = itemId;
	}
	public int getItemId()
	{
		 return this.itemId;
	}

	public void setBidPrice(double bidPrice)
	{
		this.bidPrice = bidPrice;
	}
	public double getBidPrice()
	{
		 return this.bidPrice;
	}

	public void setMaxPrice(double maxPrice)
	{
		this.maxPrice = maxPrice;
	}
	public double getMaxPrice()
	{
		 return this.maxPrice;
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