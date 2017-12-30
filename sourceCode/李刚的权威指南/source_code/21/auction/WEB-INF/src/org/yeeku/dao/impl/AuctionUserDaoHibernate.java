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
public class AuctionUserDaoHibernate extends HibernateDaoSupport implements AuctionUserDao  
{
    /**
     * ����id�����û�
     * @param id ��Ҫ���ҵ��û�id
     */  
    public AuctionUser get(Integer id)
    {
        return (AuctionUser)getHibernateTemplate().get(AuctionUser.class , id);
    }
    /**
     * �����û�
     * @param user ��Ҫ���ӵ��û�
     */       
    public void save(AuctionUser user)
    {
        getHibernateTemplate().save(user);
    }

    /**
     * �޸��û�
     * @param user ��Ҫ�޸ĵ��û�
     */  
    public void update(AuctionUser user)
    {
        getHibernateTemplate().saveOrUpdate(user);
    }

    /**
     * ɾ���û�
     * @param id ��Ҫɾ�����û�id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(AuctionUser.class , id));
    }

    /**
     * ɾ���û�
     * @param user ��Ҫɾ�����û�
     */  
    public void delete(AuctionUser user)
    {
        getHibernateTemplate().delete(user);
    }

    /**
     * ��ѯȫ���û�
     * @return ���ȫ���û�
     */ 
    public List findAll()
    {
        return getHibernateTemplate().find("from AuctionUser");
    }

    /**
     * �����û�������������û�
     * @param username ��ѯ������û���
     * @param pass ��ѯ���������
     * @return ��Ӧ���û�
     */ 
    public AuctionUser findUserByNameAndPass(String username , String pass)
    {
        String[] args = {username , pass};
        List ul = getHibernateTemplate().find("from AuctionUser au where au.username = ? and au.userpass = ?" , args);
        if (ul.size() == 1)
        {
            return (AuctionUser)ul.get(0);
        }
        return null;
    }
}
