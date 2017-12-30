package org.yeeku.service.impl;

import org.yeeku.dao.*;
import org.yeeku.model.*;
import org.yeeku.service.UserManager;


/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class UserManagerImpl implements UserManager
{
	private UserDao userDao;
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

    /**
     * 新增用户
     * @param user 新增用户的用户名
     * @param pass 新增用户的密码
     * @param email 新增用户的电子邮件
	 * @return 新增用户的主键
     */
    public int addUser(String user , String pass , String email) 
		throws Exception
	{
		try
		{
			User u = new User();
			u.setUser(user);
			u.setPass(pass);
			u.setEmail(email);
			userDao.save(u);
			return u.getId();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new Exception("新增用户时出现异常");
		}
	}

    /**
     * 验证用户登陆
     * @param user 需要登陆的用户名
     * @param pass 需要登陆的密码
	 * @return 是否登陆成功
     */
    public int loginValid(String user , String pass) 
		throws Exception
	{
		try
		{
			User u = userDao.findUserByNameAndPass(user , pass);
			if (u != null)
			{
				return u.getId();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new Exception("验证用户登陆时出现异常");
		}
		return -1;
	}

    /**
     * 验证用户名是否可用，如果系统中已有该用户名，则不可用。
     * @param user 需要验证的用户名
	 * @return 用户名是否可用
     */
	public boolean validateName(String user)
		throws Exception
	{
		try
		{
			if (userDao.findUserByName(user) == null)
			{
				return true;
			}
			return false;
		}
		catch (Exception e)
		{
			throw new Exception("验证用户名是否有效出错！");
		}

	}

}