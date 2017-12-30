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
     * �����������Ҿ���
     * @param bidId ����id;
     * @return id��Ӧ�ľ���
     */
    public Bid get(Integer bidId)
    {
       return(Bid)getHibernateTemplate().get(Bid.class , bidId);
    }

    /**
     * ���澺��
     * @param bid ��Ҫ����ľ���
     */    
    public void save(Bid bid)
    {
        getHibernateTemplate().save(bid);
    }

    /**
     * �޸ľ���
     * @param bid ��Ҫ�޸ĵľ���
     */
    public void update(Bid bid)
    {
        getHibernateTemplate().saveOrUpdate(bid);
    }

    /**
     * ɾ������
     * @param id ��Ҫɾ���ľ���id
     */
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Bid.class , id));
    }

    /**
     * ɾ������
     * @param bid ��Ҫɾ���ľ���
     */
    public void delete(Bid bid)
    {
        getHibernateTemplate().delete(bid);
    }

    /**
     * �����û����Ҿ���
     * @param id �û�id
     * @return �û���Ӧ��ȫ������
     */
    public List findByUser(Integer userId)
    {
        return getHibernateTemplate().find("from Bid as bid where bid.bidUser.id = ?",userId);
    }
    /**
	 * ������Ʒid���Լ����۲�ѯ�û�
	 * @param itemId ��Ʒid;
	 * @param price ���۵ļ۸�
	 * @return ��ָ����Ʒ��ָ�����۵��û�
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
