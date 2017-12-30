package org.yeeku.service;

import java.util.List;

import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface UserManager
{
    /**
     * �����û�
     * @param user �����û����û���
     * @param pass �����û�������
     * @param email �����û��ĵ����ʼ�
	 * @return �����û�������
     */
    int addUser(String user , String pass , String email) 
		throws Exception;

    /**
     * ��֤�û���½
     * @param user ��Ҫ��½���û���
     * @param pass ��Ҫ��½������
	 * @return �Ƿ��½�ɹ�
     */
    int loginValid(String user , String pass) 
		throws Exception;

    /**
     * ��֤�û����Ƿ���ã����ϵͳ�����и��û������򲻿��á�
     * @param user ��Ҫ��֤���û���
	 * @return �û����Ƿ����
     */
	boolean validateName(String user)
		throws Exception;
}
