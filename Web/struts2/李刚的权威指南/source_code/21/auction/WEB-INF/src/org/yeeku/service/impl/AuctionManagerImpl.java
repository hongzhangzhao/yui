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
     * 根据赢取者查询物品
     * @param winerId 赢取者id
     * @return 赢取者获得的全部物品
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
            throw new AuctionException("根据赢取者查询物品出现异常,请重试");
        }
    }
    /**
     * 查询全部流拍的物品
     * @return 全部流拍物品
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
            throw new AuctionException("查询流拍物品出现异常,请重试");
        }
    }
    /**
     * 查询用户的全部出价
     * @param userId 需查询的用户id
     * @return 用户的全部出价
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
            throw new AuctionException("查询用户对应所有的竞价出现异常,请重试");
        }
    }

    /**
     * 根据用户名，密码验证登陆是否成功
     * @param username 登陆所输入的用户名
     * @param pass 登陆的密码
     * @return 全部流拍物品
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
            throw new AuctionException("验证用户登陆出现异常,请重试");
        }
    }

	/**
	 * 根据用户id查找目前仍在拍卖中的物品
	 * @param userId 用户id
	 * @return 当前用户所有的全部物品。
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
            throw new AuctionException("获取用户的所有拍卖物品出现异常,请重试");
        }
    }
    /**
     * 查询全部状态
     * @return 获得全部种类
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
            throw new AuctionException("获取所有的物品种类出现异常,请重试");
        }
    }

    /**
     * 添加物品
     * @param name 物品名称
     * @param desc 物品描述
     * @param remark 物品备注
     * @param avail 有效天数
     * @param kind 物品种类
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
            throw new AuctionException("添加物品出现异常,请重试");
        }
    }

    /**
     * 添加种类
     * @param name 种类名称
     * @param desc 种类描述
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
            throw new AuctionException("添加物品种类出现异常,请重试");
        }

    }

    /**
     * 根据产品分类，获取当前拍卖的全部商品
     * @param kindId 种类id;
     * @return 该类的全部产品
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
            throw new AuctionException("获取指定种类的物品出现异常,请重试");
        }
	}
    /**
     * 根据分类id，获取种类名
     * @param kindId 种类id;
     * @return 该分类的名称
     */
    public String getKind(int kindId) throws AuctionException
	{
		Kind  k = kindDao.get(kindId);
		return k.getKindName();
	}

    /**
     * 根据物品id，获取物品
     * @param itemId 物品id;
     * @return 该物品的名称
     */
    public ItemBean getItem(int itemId) throws AuctionException
	{
		Item item = itemDao.get(itemId);
        ItemBean ib = new ItemBean();
        initItem(ib, item);
        return ib;
	}

	/**
	 * 增加新的竞价,并对竞价用户发送邮件通知
	 * @param userId 用户id;
	 * @param itemId 物品id;
	 * @param bidPrice 竞价价格
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
                + ", 谢谢你参与竞价，你的竞价的物品的是: "
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
	 * 根据时间来修改物品的赢取者
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
     * 将一个Bid PO转换成BidBean的VO
     * @param bb BidBean的VO
     * @param bid Bid的PO
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
     * 将一个Item PO转换成ItemBean的VO
     * @param ib ItemBean的VO
     * @param item Item的PO
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