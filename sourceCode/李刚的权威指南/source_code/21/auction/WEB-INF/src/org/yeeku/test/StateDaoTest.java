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
public class StateDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	StateDao stateDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		stateDao = (StateDao)applicationContext.getBean("stateDao");
	}
	public void onTearDownInTransaction()
	{
		stateDao = null;
    }

    public void testFindAll()
	{
        List l = stateDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from state"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(StateDaoTest.class);
    }
}