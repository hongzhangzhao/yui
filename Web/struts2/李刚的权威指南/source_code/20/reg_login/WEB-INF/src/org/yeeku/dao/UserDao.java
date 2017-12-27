package org.yeeku.dao;

import java.util.List;

import org.yeeku.model.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface UserDao  
{
    /**
     * ����id�����û�
     * @param id ��Ҫ���ҵ�����id
     */  
    User get(int id);
    /**
     * ��������
     * @param user ��Ҫ���ӵ�����
     */       
    void save(User user);

    /**
     * �޸��û�
     * @param user ��Ҫ�޸ĵ��û�
     */  
    void update(User user);

    /**
     * ɾ���û�
     * @param id ��Ҫɾ�����û�id
     */  
    void delete(int id);

    /**
     * ɾ���û�
     * @param user ��Ҫɾ�����û�
     */  
    void delete(User user);

    /**
     * ��ѯȫ���û�
     * @return ���ȫ���û�
     */ 
    List<User> findAll();

    /**
     * �����û�������������û�
     * @param user ��ѯ������û���
     * @param pass ��ѯ���������
     * @return ��Ӧ���û�
     */ 
    User findUserByNameAndPass(String user , String pass);

    /**
     * �����û��������û�
     * @param user ��ѯ������û���
     * @return ��Ӧ���û�
     */ 
    User findUserByName(String user);
}