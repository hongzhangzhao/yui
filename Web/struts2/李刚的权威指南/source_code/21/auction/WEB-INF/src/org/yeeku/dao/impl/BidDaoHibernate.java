package org.yeeku.dao.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.business.*;
import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class BidDaoHibernate extends HibernateDaoSupport implements BidDao  
{
    /**
     * 根据主键查找竞价
     * @param bidId 竞价id;
     * @return id对应的竞价
     */
    public Bid get(Integer bidId)
    {
       return(Bid)getHibernateTemplate().get(Bid.class , bidId);
    }

    /**
     * 保存竞价
     * @param bid 需要保存的竞价
     */    
    public void save(Bid bid)
    {
        getHibernateTemplate().save(bid);
    }

    /**
     * 修改竞价
     * @param bid 需要修改的竞价
     */
    public void update(Bid bid)
    {
        getHibernateTemplate().saveOrUpdate(bid);
    }

    /**
     * 删除竞价
     * @param id 需要删除的竞价id
     */
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Bid.class , id));
    }

    /**
     * 删除竞价
     * @param bid 需要删除的竞价
     */
    public void delete(Bid bid)
    {
        getHibernateTemplate().delete(bid);
    }

    /**
     * 根据用户查找竞价
     * @param id 用户id
     * @return 用户对应的全部竞价
     */
    public List findByUser(Integer userId)
    {
        return getHibernateTemplate().find("from Bid as bid where bid.bidUser.id = ?",userId);
    }
    /**
	 * 根据物品id，以及出价查询用户
	 * @param itemId 物品id;
	 * @param price 竞价的价格
	 * @return 对指定物品出指定竞价的用户
	 */
    public AuctionUser findUserByItemAndPrice(Integer itemId , Double price)
	{
		Object[] args = {itemId , price} ;
        List l = getHibernateTemplate().find("from Bid as bid where bid.bidItem.id = ? and bid.bidPrice = ?",args);
		if (l.size() >= 1)
		{
			Bid b = (Bid)l.get(0);
			return b.getBidUser();
		}
		else
		{
			return null;
		}

	}
}
