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
     * �����û�
     * @param user �����û����û���
     * @param pass �����û�������
     * @param email �����û��ĵ����ʼ�
	 * @return �����û�������
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
			throw new Exception("�����û�ʱ�����쳣");
		}
	}

    /**
     * ��֤�û���½
     * @param user ��Ҫ��½���û���
     * @param pass ��Ҫ��½������
	 * @return �Ƿ��½�ɹ�
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
			throw new Exception("��֤�û���½ʱ�����쳣");
		}
		return -1;
	}

    /**
     * ��֤�û����Ƿ���ã����ϵͳ�����и��û������򲻿��á�
     * @param user ��Ҫ��֤���û���
	 * @return �û����Ƿ����
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
			throw new Exception("��֤�û����Ƿ���Ч����");
		}

	}

}