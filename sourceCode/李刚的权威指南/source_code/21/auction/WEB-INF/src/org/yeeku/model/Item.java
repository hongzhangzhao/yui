package org.yeeku.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Item implements Serializable
{
	private Integer id;
	private String itemRemark;
	private String itemName;
	private String itemDesc;
	private Date addtime;
	private Date endtime;
	private double initPrice;
	private double maxPrice;
	private AuctionUser owner;
	private Kind kind;
	private AuctionUser winer;
	private State itemState;
	private Set<Bid> bids = new HashSet<Bid>();

    public Date getAddtime() {
        return addtime;
    }
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    public Set<Bid> getBids() {
        return bids;
    }
    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }
    public Date getEndtime() {
        return endtime;
    }
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public double getInitPrice() {
        return initPrice;
    }
    public void setInitPrice(double initPrice) {
        this.initPrice = initPrice;
    }
    public String getItemDesc() {
        return itemDesc;
    }
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemRemark() {
        return itemRemark;
    }
    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }
    public State getItemState() {
        return itemState;
    }
    public void setItemState(State itemState) {
        this.itemState = itemState;
    }
    public Kind getKind() {
        return kind;
    }
    public void setKind(Kind kind) {
        this.kind = kind;
    }
    public double getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    public AuctionUser getOwner() {
        return owner;
    }
    public void setOwner(AuctionUser owner) {
        this.owner = owner;
    }
    public AuctionUser getWiner() {
        return winer;
    }
    public void setWiner(AuctionUser winer) {
        this.winer = winer;
    }

}
