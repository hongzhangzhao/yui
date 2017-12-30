package org.yeeku.dao.hibernate;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao  
{
    /**
     * 根据id查找用户
     * @param id 需要查找的用户id
     */  
    public User get(int id)
    {
        return (User)getHibernateTemplate().get(User.class , id);
    }

    /**
     * 增加用户
     * @param user 需要增加的用户
     */       
    public void save(User user)
    {
        getHibernateTemplate().save(user);
    }

    /**
     * 修改用户
     * @param user 需要修改的用户
     */  
    public void update(User user)
    {
        getHibernateTemplate().saveOrUpdate(user);
    }

    /**
     * 删除用户
     * @param id 需要删除的用户id
     */  
    public void delete(int id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(User.class , id));
    }

    /**
     * 删除用户
     * @param user 需要删除的用户
     */  
    public void delete(User user)
    {
        getHibernateTemplate().delete(user);
    }

    /**
     * 查询全部用户
     * @return 获得全部用户
     */ 
    public List<User> findAll()
    {
        return (List<User>)getHibernateTemplate().find("from User");
    }

    /**
     * 根据用户名，密码查找用户
     * @param username 查询所需的用户名
     * @param pass 查询所需的密码
     * @return 对应的用户
     */ 
    public User findUserByNameAndPass(String user , String pass)
    {
        List ul = getHibernateTemplate()
			.find("from User au where au.user = ? and au.pass = ?" , 
			new String[]{user , pass});
        if (ul != null && ul.size() >= 1)
        {
            return (User)ul.get(0);
        }
        return null;
    }

    /**
     * 根据用户名查找用户
     * @param user 查询所需的用户名
     * @return 对应的用户
     */ 
    public User findUserByName(String user)
	{
        List ul = getHibernateTemplate()
			.find("from User au where au.user = ?" , 
			user);
        if (ul != null && ul.size() >= 1)
        {
            return (User)ul.get(0);
        }
        return null;
	}

}
