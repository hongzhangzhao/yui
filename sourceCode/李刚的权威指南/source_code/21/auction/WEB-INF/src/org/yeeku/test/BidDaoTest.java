package org.yeeku.test;

import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import org.yeeku.dao.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class BidDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	BidDao bidDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
	    bidDao = (BidDao)applicationContext.getBean("bidDao");
	}
	public void onTearDownInTransaction()
	{
		bidDao = null;
    }

    public void testFindByUser()
	{
        List l = bidDao.findByUser(new Integer(1));
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from bid where bid.user_id = 1"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(BidDaoTest.class);
    }
}