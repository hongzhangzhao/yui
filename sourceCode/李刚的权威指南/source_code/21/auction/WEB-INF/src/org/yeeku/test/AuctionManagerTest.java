package org.yeeku.test;

import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import org.yeeku.dao.*;
import org.yeeku.service.*;
import org.yeeku.business.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuctionManagerTest extends AbstractTransactionalDataSourceSpringContextTests
{

	AuctionManager am;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		am = (AuctionManager)applicationContext.getBean("auctionManager");
	}
	public void onTearDownInTransaction()
	{
		am = null;
    }

    public void testGetItemByWiner()throws Exception
	{
        List l = am.getItemByWiner(1);
        for (int i = 0; i < l.size() ; i++)
        {
            ItemBean ib = (ItemBean)l.get(i);
            System.out.println(ib.getOwner());
            System.out.println(ib.getWiner());
        }
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from item where winer_id = 1"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(AuctionManagerTest.class);
    }
}