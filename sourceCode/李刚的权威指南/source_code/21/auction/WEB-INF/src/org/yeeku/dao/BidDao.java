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
public interface BidDao  
{
    /**
     * �����������Ҿ���
     * @param bidId ����id;
     * @return id��Ӧ�ľ���
     */
    Bid get(Integer bidId);

    /**
     * ���澺��
     * @param bid ��Ҫ����ľ���
     */    
    void save(Bid bid);

    /**
     * �޸ľ���
     * @param bid ��Ҫ�޸ĵľ���
     */
    void update(Bid bid);

    /**
     * ɾ������
     * @param id ��Ҫɾ���ľ���id
     */
    void delete(Integer id);

    /**
     * ɾ������
     * @param bid ��Ҫɾ���ľ���
     */
    void delete(Bid bid);

    /**
     * �����û����Ҿ���
     * @param id �û�id
     * @return �û���Ӧ��ȫ������
     */
    List findByUser(Integer userId);

    /**
	 * ������Ʒid���Լ����۲�ѯ�û�
	 * @param itemId ��Ʒid;
	 * @param price ���۵ļ۸�
	 * @return ��ָ����Ʒ��ָ�����۵��û�
	 */
    AuctionUser findUserByItemAndPrice(Integer itemId , Double price);
}
