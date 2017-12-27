package org.yeeku.action;

import java.util.*;
import com.opensymphony.xwork2.*;

import org.yeeku.service.AuctionManager;
import org.yeeku.exception.AuctionException;
import org.yeeku.action.base.BaseActionInterface;
import org.yeeku.model.*;
import org.yeeku.business.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name: ViewDetail.java
 * 作用：根据用户请求的物品id，查看该物品的详细信息。
 * <br>Date: 
 */
public class ViewDetailAction extends BaseActionInterface
{
	private int itemId;
	private ItemBean item;
	private String errMsg;

	public String execute()throws Exception
	{
		if (itemId <= 0)
		{
			setErrMsg("您选择物品种类不是一个有效的物品种类！");
			return ERROR;
		}
		else
		{
			setItem(mgr.getItem(itemId));
			return SUCCESS;
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

	public void setItem(ItemBean item)
	{
		this.item = item;
	}
	public ItemBean getItem()
	{
		 return this.item;
	}

	public void setErrMsg(String errMsg)
	{
		this.errMsg = errMsg;
	}
	public String getErrMsg()
	{
		 return this.errMsg;
	}

}