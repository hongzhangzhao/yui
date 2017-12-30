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
public interface AuctionUserDao  
{

    /**
     * ����id�����û�
     * @param id ��Ҫ���ҵ��û�id
     */  
    AuctionUser get(Integer id);
    /**
     * �����û�
     * @param user ��Ҫ���ӵ��û�
     */       
    void save(AuctionUser user);

    /**
     * �޸��û�
     * @param user ��Ҫ�޸ĵ��û�
     */  
    void update(AuctionUser user);

    /**
     * ɾ���û�
     * @param id ��Ҫɾ�����û�id
     */  
    void delete(Integer id);

    /**
     * ɾ���û�
     * @param user ��Ҫɾ�����û�
     */  
    void delete(AuctionUser user);

    /**
     * ��ѯȫ���û�
     * @return ���ȫ���û�
     */ 
    List<AuctionUser> findAll();

    /**
     * �����û�������������û�
     * @param username ��ѯ������û���
     * @param pass ��ѯ���������
     * @return ��Ӧ���û�
     */ 
    AuctionUser findUserByNameAndPass(String username , String pass);


}