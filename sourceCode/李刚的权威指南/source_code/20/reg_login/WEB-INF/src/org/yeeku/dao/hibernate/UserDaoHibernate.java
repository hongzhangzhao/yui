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
     * ����id�����û�
     * @param id ��Ҫ���ҵ��û�id
     */  
    public User get(int id)
    {
        return (User)getHibernateTemplate().get(User.class , id);
    }

    /**
     * �����û�
     * @param user ��Ҫ���ӵ��û�
     */       
    public void save(User user)
    {
        getHibernateTemplate().save(user);
    }

    /**
     * �޸��û�
     * @param user ��Ҫ�޸ĵ��û�
     */  
    public void update(User user)
    {
        getHibernateTemplate().saveOrUpdate(user);
    }

    /**
     * ɾ���û�
     * @param id ��Ҫɾ�����û�id
     */  
    public void delete(int id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(User.class , id));
    }

    /**
     * ɾ���û�
     * @param user ��Ҫɾ�����û�
     */  
    public void delete(User user)
    {
        getHibernateTemplate().delete(user);
    }

    /**
     * ��ѯȫ���û�
     * @return ���ȫ���û�
     */ 
    public List<User> findAll()
    {
        return (List<User>)getHibernateTemplate().find("from User");
    }

    /**
     * �����û�������������û�
     * @param username ��ѯ������û���
     * @param pass ��ѯ���������
     * @return ��Ӧ���û�
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
     * �����û��������û�
     * @param user ��ѯ������û���
     * @return ��Ӧ���û�
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
