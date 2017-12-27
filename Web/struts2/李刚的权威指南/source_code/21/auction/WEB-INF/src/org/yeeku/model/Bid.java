package org.yeeku.model;

import java.util.Date;
import java.io.Serializable;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Bid implements Serializable
{
	//标识属性，对应数据表的逻辑主键
	private Integer id;
	//竞价的价格
	private double bidPrice;
	//竞价的日期
	private Date bidDate;
	//所竞价的物品
	private Item bidItem;
	//参与竞价的用户
	private AuctionUser bidUser;
    public Date getBidDate() {
        return bidDate;
    }
    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }
    public Item getBidItem() {
        return bidItem;
    }
    public void setBidItem(Item bidItem) {
        this.bidItem = bidItem;
    }
    public double getBidPrice() {
        return bidPrice;
    }
    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
    public AuctionUser getBidUser() {
        return bidUser;
    }
    public void setBidUser(AuctionUser bidUser) {
        this.bidUser = bidUser;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

	public int hashCode()
	{
		return bidUser.getUsername().hashCode() + bidItem.hashCode() + (int)bidPrice;
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof Bid)
		{
			Bid bid = (Bid)obj;
			if (bid.getBidUser().getUsername().equals(bidUser.getUsername())
				&& bid.getBidItem().equals(bidItem) 
				&& bid.getBidPrice() == bidPrice)
			{
				return true;
			}
		}
		return false;
	}
}
