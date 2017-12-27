package org.yeeku.business;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class BidBean implements Serializable
{
    private int id;
    private String user;
    private String item;
    private double price;
    private Date bidDate;

    public BidBean()
    {
    }

	public BidBean(int id, String user, String item, double price, Date bidDate) {
		this.id = id;
		this.user = user;
		this.item = item;
		this.price = price;
		this.bidDate = bidDate;
	}
	
	public void setId(int id) {
		this.id = id; 
	}

	public void setUser(String user) {
		this.user = user; 
	}

	public void setItem(String item) {
		this.item = item; 
	}

	public void setPrice(double price) {
		this.price = price; 
	}

	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate; 
	}

	public int getId() {
		return (this.id); 
	}

	public String getUser() {
		return (this.user); 
	}

	public String getItem() {
		return (this.item); 
	}

	public double getPrice() {
		return (this.price); 
	}

	public Date getBidDate() {
		return (this.bidDate); 
	}
}
