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
public class KindDaoHibernate extends HibernateDaoSupport implements KindDao  
{

    /**
     * ����id��������
     * @param id ��Ҫ���ҵ�����id
     */  
    public Kind get(Integer id)
    {
        return (Kind)getHibernateTemplate().get(Kind.class , id);
    }

    /**
     * ��������
     * @param kind ��Ҫ���ӵ�����
     */       
    public void save(Kind kind)
    {
        getHibernateTemplate().save(kind);  
    }
      

    /**
     * �޸�����
     * @param kind ��Ҫ�޸ĵ�����
     */  
    public void update(Kind kind)
    {
        getHibernateTemplate().saveOrUpdate(kind);  
    }

    /**
     * ɾ������
     * @param id ��Ҫɾ��������id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Kind.class , id));  
    }

    /**
     * ɾ������
     * @param kind ��Ҫɾ��������
     */  
    public void delete(Kind kind)
    {
        getHibernateTemplate().delete(kind);  
    }

    /**
     * ��ѯȫ������
     * @return ���ȫ������
     */ 
    public List<Kind> findAll()
    {
        return getHibernateTemplate().find("from Kind");
    }
}
