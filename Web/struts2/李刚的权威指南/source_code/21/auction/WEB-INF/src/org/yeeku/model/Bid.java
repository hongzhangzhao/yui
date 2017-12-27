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
	//��ʶ���ԣ���Ӧ���ݱ���߼�����
	private Integer id;
	//���۵ļ۸�
	private double bidPrice;
	//���۵�����
	private Date bidDate;
	//�����۵���Ʒ
	private Item bidItem;
	//���뾺�۵��û�
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
