package org.yeeku.service;

import java.util.List;

import org.yeeku.business.*;
import org.yeeku.dao.*;
import org.yeeku.exception.AuctionException;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public interface AuctionManager  
{
    /**
     * ����Ӯȡ�߲�ѯ��Ʒ
     * @param winerId Ӯȡ��id
     * @return Ӯȡ�߻�õ�ȫ����Ʒ
     */
    List getItemByWiner(int winerId) throws AuctionException;
    /**
     * ��ѯȫ�����ĵ���Ʒ
     * @return ȫ��������Ʒ
     */
    List getFailItems() throws AuctionException;
    /**
     * �����û�����������֤��½�Ƿ�ɹ�
     * @param username ��½��������û���
     * @param pass ��½������
     * @return ȫ��������Ʒ
     */
    Integer validLogin(String username , String pass) throws AuctionException;
    /**
     * ��ѯ�û���ȫ������
     * @param userId ���ѯ���û�id
     * @return �û���ȫ������
     */
    List getBidByUser(int userId) throws AuctionException;
	/**
	 * �����û�id����Ŀǰ���������е���Ʒ
	 * @param userId �û�id
	 * @return ��ǰ�û����е�ȫ����Ʒ��
	 */
    List getItemsByOwner(int userId) throws AuctionException;

    /**
     * ��ѯȫ��״̬
     * @return ���ȫ������
     */ 
    List getAllKind()throws AuctionException; 

    /**
     * �����Ʒ
     * @param name ��Ʒ����
     * @param desc ��Ʒ����
     * @param remark ��Ʒ��ע
     * @param avail ��Ч����
     * @param kind ��Ʒ����
     */ 
    void addItem(String name , String desc , String remark , double initPrice , int avail , int kind , int userId) throws AuctionException;

    /**
     * �������
     * @param name ��������
     * @param desc ��������
     */ 
    void addKind(String name , String desc ) throws AuctionException;

    /**
     * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
     * @param kindId ����id;
     * @return �����ȫ����Ʒ
     */
    List getItemsByKind(int kindId) throws AuctionException;

    /**
     * ���ݷ���id����ȡ������
     * @param kindId ����id;
     * @return �÷��������
     */
    String getKind(int kindId) throws AuctionException;
    /**
     * ������Ʒid����ȡ��Ʒ
     * @param itemId ��Ʒid;
     * @return ����Ʒ������
     */
    ItemBean getItem(int itemId) throws AuctionException;

	/**
	 * �����µľ���
	 * @param userId �û�id;
	 * @param itemId ��Ʒid;
	 * @param bidPrice ���ۼ۸�
	 */
	void addBid(int userId , int itemId , double bidPrice)throws AuctionException;
	
	/**
	 * ����ʱ�����޸���Ʒ��Ӯȡ��
	 */
	void updateWiner()throws AuctionException;
}
