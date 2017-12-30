package org.yeeku.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.io.Serializable;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuctionUser implements Serializable
{
    //��ʶ����
	private Integer id;
	//�û�������
	private String username;
	//��������
	private String userpass;
	//�����ʼ�����
	private String email;

	//����������������Ʒʵ��
	private Set<Item> itemsByOwner = new HashSet<Item>();
	//����Ӯȡ�߹�������Ʒʵ��
	private Set<Item> itemsByWiner = new HashSet<Item>();
	//���û��������ȫ������
	private Set<Bid> bids = new HashSet<Bid>();
    public Set<Bid> getBids() {
        return bids;
    }
    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Set<Item> getItemsByOwner() {
        return itemsByOwner;
    }
    public void setItemsByOwner(Set<Item> itemsByOwner) {
        this.itemsByOwner = itemsByOwner;
    }
    public Set<Item> getItemsByWiner() {
        return itemsByWiner;
    }
    public void setItemsByWiner(Set<Item> itemsByWiner) {
        this.itemsByWiner = itemsByWiner;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpass() {
        return userpass;
    }
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }


}
