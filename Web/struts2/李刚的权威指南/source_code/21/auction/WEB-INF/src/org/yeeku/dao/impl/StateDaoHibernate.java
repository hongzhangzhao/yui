package org.yeeku.dao.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Hibernate;

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
public class StateDaoHibernate extends HibernateDaoSupport implements StateDao  
{
    /**
     * ����id����״̬
     * @param id ��Ҫ���ҵ�״̬id
     */  
    public State get(Integer id)
    {
        return (State)getHibernateTemplate().get(State.class , id);
    }
    /**
     * ����״̬
     * @param state ��Ҫ���ӵ�״̬
     */       
    public void save(State state)
    {
        getHibernateTemplate().save(state);
    }

    /**
     * �޸�״̬
     * @param state ��Ҫ�޸ĵ�״̬
     */  
    public void update(State state)
    {
        getHibernateTemplate().saveOrUpdate(state);
    }

    /**
     * ɾ��״̬
     * @param id ��Ҫɾ����״̬id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(State.class , id));
    }

    /**
     * ɾ��״̬
     * @param state ��Ҫɾ����״̬
     */  
    public void delete(State state)
    {
        getHibernateTemplate().delete(state);
    }

    /**
     * ��ѯȫ��״̬
     * @return ���ȫ��״̬
     */ 
    public List findAll()
    {
        return getHibernateTemplate().find("from State");
    }
}