package org.yeeku.service.impl;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
import java.util.Calendar;

import org.yeeku.business.*;
import org.yeeku.dao.*;
import org.yeeku.model.*;
import org.yeeku.exception.AuctionException;
import org.yeeku.service.AuctionManager;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuctionManagerImpl implements AuctionManager
{
    static Logger log = Logger.getLogger(AuctionManagerImpl.class.getName());

    private AuctionUserDao userDao;
    private BidDao bidDao;
    private ItemDao itemDao;
    private KindDao kindDao;
    private StateDao stateDao;
    private MailSender mailSender;
    private SimpleMailMessage message;
	
	public void setUserDao(AuctionUserDao userDao) {
		this.userDao = userDao; 
	}

	public void setBidDao(BidDao bidDao) {
		this.bidDao = bidDao; 
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao; 
	}

	public void setKindDao(KindDao kindDao) {
		this.kindDao = kindDao; 
	}

	public void setStateDao(StateDao stateDao) {
		this.stateDao = stateDao; 
	}

    public void setMailSender(MailSender mailSender)
	{
        this.mailSender = mailSender;
    }

    public void setMessage(SimpleMailMessage message)
	{
        this.message = message;
    }

    /**
     * ����Ӯȡ�߲�ѯ��Ʒ
     * @param winerId Ӯȡ��id
     * @return Ӯȡ�߻�õ�ȫ����Ʒ
     */
    public List getItemByWiner(int winerId) throws AuctionException
    {
        try
        {
            List result = new ArrayList();
            List items = itemDao.findItemByWiner(winerId); 
             for (Iterator it = items.iterator() ; it.hasNext() ; )
            {
                Item item = (Item)it.next();
                ItemBean ib = new ItemBean();
                initItem(ib,item);
                result.add(ib);
            }
            return result;           
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("����Ӯȡ�߲�ѯ��Ʒ�����쳣,������");
        }
    }
    /**
     * ��ѯȫ�����ĵ���Ʒ
     * @return ȫ��������Ʒ
     */
    public List getFailItems() throws AuctionException
    {
        try
        {
            List result = new ArrayList();
            List items = itemDao.findItemByState(3);
            for (Iterator it = items.iterator() ; it.hasNext() ; )
            {
                Item item = (Item)it.next();
                ItemBean ib = new ItemBean();
                initItem(ib,item);
                result.add(ib);
            }
            return result;
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��ѯ������Ʒ�����쳣,������");
        }
    }
    /**
     * ��ѯ�û���ȫ������
     * @param userId ���ѯ���û�id
     * @return �û���ȫ������
     */
    public List getBidByUser(int userId) throws AuctionException
    {
        try
        {
            List l = bidDao.findByUser(userId);
            List result = new ArrayList();
            for ( int i = 0 ; i < l.size() ; i++ )
            {
                Bid bid = (Bid)l.get(i);
                BidBean bb = new BidBean();
                initBid(bb, bid);
                result.add(bb);
            }
            return result;
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��ѯ�û���Ӧ���еľ��۳����쳣,������");
        }
    }

    /**
     * �����û�����������֤��½�Ƿ�ɹ�
     * @param username ��½��������û���
     * @param pass ��½������
     * @return ȫ��������Ʒ
     */
    public Integer validLogin(String username , String pass) throws AuctionException
    {
        try
        {			
			AuctionUser user = userDao.findUserByNameAndPass(username , pass);
			if (user != null)
			{
				return user.getId();
			}
			return null;
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��֤�û���½�����쳣,������");
        }
    }

	/**
	 * �����û�id����Ŀǰ���������е���Ʒ
	 * @param userId �û�id
	 * @return ��ǰ�û����е�ȫ����Ʒ��
	 */
    public List getItemsByOwner(int userId) throws AuctionException
    {
        try
        {
            List result = new ArrayList();
            List items = itemDao.findItemByOwner(userId);
            for (Iterator it = items.iterator() ; it.hasNext() ; )
            {
                Item item = (Item)it.next();
                ItemBean ib = new ItemBean();
                initItem(ib,item);
                result.add(ib);
            }
            return result;            
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��ȡ�û�������������Ʒ�����쳣,������");
        }
    }
    /**
     * ��ѯȫ��״̬
     * @return ���ȫ������
     */     
    public List getAllKind() throws AuctionException
    {
        try
        {
            return kindDao.findAll();       	
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��ȡ���е���Ʒ��������쳣,������");
        }
    }

    /**
     * �����Ʒ
     * @param name ��Ʒ����
     * @param desc ��Ʒ����
     * @param remark ��Ʒ��ע
     * @param avail ��Ч����
     * @param kind ��Ʒ����
     */ 
    public void addItem(String name , String desc , String remark , double initPrice , int avail , int kind , int userId)
		 throws AuctionException
    {
        try
        {
            Kind k = kindDao.get(kind);
            AuctionUser owner = userDao.get(userId);
            Item item = new Item();
            item.setItemName(name);
            item.setItemDesc(desc);
            item.setItemRemark(remark);
            item.setAddtime(new Date());
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE , avail + 1);
            item.setEndtime(c.getTime());
            item.setInitPrice(initPrice);
            item.setMaxPrice(initPrice);
            item.setItemState(stateDao.get(1));
            item.setKind(k);
            item.setOwner(owner);

            itemDao.save(item);

        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("�����Ʒ�����쳣,������");
        }
    }

    /**
     * �������
     * @param name ��������
     * @param desc ��������
     */
    public void addKind(String name , String desc ) throws AuctionException
    {
        try
        {
            Kind k = new Kind();
            k.setKindName(name);
            k.setKindDesc(desc);
            kindDao.save(k);
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("�����Ʒ��������쳣,������");
        }

    }

    /**
     * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
     * @param kindId ����id;
     * @return �����ȫ����Ʒ
     */
    public List getItemsByKind(int kindId) throws AuctionException
	{
        try
        {
            List result = new ArrayList();
			List items = itemDao.findItemByKind(kindId);
            for (Iterator it = items.iterator() ; it.hasNext() ; )
            {
                Item item = (Item)it.next();
                ItemBean ib = new ItemBean();
                initItem(ib,item);
                result.add(ib);
            }
            return result;
        }
        catch (Exception e)
        {
            log.debug(e.getMessage());
            throw new AuctionException("��ȡָ���������Ʒ�����쳣,������");
        }
	}
    /**
     * ���ݷ���id����ȡ������
     * @param kindId ����id;
     * @return �÷��������
     */
    public String getKind(int kindId) throws AuctionException
	{
		Kind  k = kindDao.get(kindId);
		return k.getKindName();
	}

    /**
     * ������Ʒid����ȡ��Ʒ
     * @param itemId ��Ʒid;
     * @return ����Ʒ������
     */
    public ItemBean getItem(int itemId) throws AuctionException
	{
		Item item = itemDao.get(itemId);
        ItemBean ib = new ItemBean();
        initItem(ib, item);
        return ib;
	}

	/**
	 * �����µľ���,���Ծ����û������ʼ�֪ͨ
	 * @param userId �û�id;
	 * @param itemId ��Ʒid;
	 * @param bidPrice ���ۼ۸�
	 */
	public void addBid(int userId , int itemId , double bidPrice)throws AuctionException
	{
		AuctionUser au = userDao.get(userId);
		Item item = itemDao.get(itemId);
		if (bidPrice > item.getMaxPrice())
		{
			item.setMaxPrice(bidPrice);
			itemDao.update(item);
		}

		Bid bid = new Bid();
		bid.setBidItem(item);
		bid.setBidUser(au);
		bid.setBidDate(new Date());
		bid.setBidPrice(bidPrice);

		bidDao.save(bid);

        SimpleMailMessage msg = new SimpleMailMessage(this.message);
        msg.setTo(au.getEmail());
        msg.setText(
            "Dear "
                + au.getUsername()
                + ", лл����뾺�ۣ���ľ��۵���Ʒ����: "
                + item.getItemName());
        try
		{
            mailSender.send(msg);
        }
        catch(MailException ex)
		{
            System.err.println(ex.getMessage());            
        }
	}

	/**
	 * ����ʱ�����޸���Ʒ��Ӯȡ��
	 */
	public void updateWiner()throws AuctionException
	{
		List itemList = itemDao.findItemByState(1);
		for (int i = 0 ; i < itemList.size() ; i++ )
		{
			Item item = (Item)itemList.get(i);
			if (!item.getEndtime().after(new Date()))
			{
				AuctionUser au = bidDao.findUserByItemAndPrice(item.getId() , item.getMaxPrice());
				if (au != null)
				{
					item.setWiner(au);
					item.setItemState(stateDao.get(2));
					itemDao.update(item);
				}
				else
				{
					item.setItemState(stateDao.get(3));
					itemDao.update(item);
				}
			}
		}
	}

    /**
     * ��һ��Bid POת����BidBean��VO
     * @param bb BidBean��VO
     * @param bid Bid��PO
     */
    private void initBid(BidBean bb , Bid bid)
    {
        bb.setId(bid.getId().intValue());
        if (bid.getBidUser() != null )bb.setUser(bid.getBidUser().getUsername());
        if (bid.getBidItem() != null )bb.setItem(bid.getBidItem().getItemName());
        bb.setPrice(bid.getBidPrice());
        bb.setBidDate(bid.getBidDate());
    }

    /**
     * ��һ��Item POת����ItemBean��VO
     * @param ib ItemBean��VO
     * @param item Item��PO
     */
    private void initItem(ItemBean ib , Item item)
    {
        ib.setId(item.getId());
        ib.setName(item.getItemName());
        ib.setDesc(item.getItemDesc());
        ib.setRemark(item.getItemRemark());
        if (item.getKind() != null)ib.setKind(item.getKind().getKindName());
        if (item.getOwner() != null)ib.setOwner(item.getOwner().getUsername());
        if (item.getWiner() != null) ib.setWiner(item.getWiner().getUsername());
        ib.setAddTime(item.getAddtime());
        ib.setEndTime(item.getEndtime());
        if (item.getItemState() != null)ib.setState(item.getItemState().getStateName());
        ib.setInitPrice(item.getInitPrice());
        ib.setMaxPrice(item.getMaxPrice());
    }

}