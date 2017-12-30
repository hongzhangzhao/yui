package org.yeeku.test;

import java.util.List;

import org.apache.log4j.Logger;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import org.yeeku.dao.*;
import org.yeeku.model.*;
import org.yeeku.business.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class ItemDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{
    static Logger log = Logger.getLogger(ItemDaoTest.class.getName());
	ItemDao itemDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		itemDao = (ItemDao)applicationContext.getBean("itemDao");
	}
	public void onTearDownInTransaction()
	{
		itemDao = null;
    }

    public void testFindItemByKind()
	{
        List l = itemDao.findItemByKind(new Integer(1));
        //log.info(l.size());
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from item , kind ,state  where item.kind_id = kind.kind_id and kind.kind_id = 1 and item.state_id = state.state_id and state.state_id = 1"));
    }

    public void testFindItemByState()
	{
        List l = itemDao.findItemByState(new Integer(1));
        //log.info(l.size());
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from item ,state  where item.state_id = state.state_id and state.state_id = 1"));
    }

    public void testFindItemByWiner()
	{
        List l = itemDao.findItemByWiner(new Integer(1));
        System.out.println("====================" + l.size());
        for (int i = 0; i < l.size() ; i++ )
        {
            Item item = (Item)l.get(i);
            System.out.println(item.getOwner().getUsername());
        }
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from item ,auction_user where item.winer_id = auction_user.user_id and auction_user.user_id = 1"));
    }

    public void testFindItemByOwner()
	{
        List l = itemDao.findItemByOwner(new Integer(1));
        //log.info(l.size());
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from item where owner_id = 1 and state_id=1"));
    }


    public static void main(String[] args)
	{
		TestRunner.run(ItemDaoTest.class);
    }
}