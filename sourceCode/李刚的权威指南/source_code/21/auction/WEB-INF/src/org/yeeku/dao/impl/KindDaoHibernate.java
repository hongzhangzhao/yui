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
     * 根据id查找种类
     * @param id 需要查找的种类id
     */  
    public Kind get(Integer id)
    {
        return (Kind)getHibernateTemplate().get(Kind.class , id);
    }

    /**
     * 增加种类
     * @param kind 需要增加的种类
     */       
    public void save(Kind kind)
    {
        getHibernateTemplate().save(kind);  
    }
      

    /**
     * 修改种类
     * @param kind 需要修改的种类
     */  
    public void update(Kind kind)
    {
        getHibernateTemplate().saveOrUpdate(kind);  
    }

    /**
     * 删除种类
     * @param id 需要删除的种类id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(Kind.class , id));  
    }

    /**
     * 删除种类
     * @param kind 需要删除的种类
     */  
    public void delete(Kind kind)
    {
        getHibernateTemplate().delete(kind);  
    }

    /**
     * 查询全部种类
     * @return 获得全部种类
     */ 
    public List<Kind> findAll()
    {
        return getHibernateTemplate().find("from Kind");
    }
}
