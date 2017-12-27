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
public class KindDaoTest extends AbstractTransactionalDataSourceSpringContextTests
{

	KindDao kindDao;

	public String[] getConfigLocations()
	{
		String[] configLocations = {"daoContext.xml","applicationContext.xml"};
		return configLocations;
	}
	
	public void onSetUpInTransaction()
	{
		kindDao = (KindDao)applicationContext.getBean("kindDao");
	}
	public void onTearDownInTransaction()
	{
		kindDao = null;
    }

    public void testFindAll()
	{
        List l = kindDao.findAll();
        assertEquals(l.size(),jdbcTemplate.queryForInt("select count(*) from kind"));
    }

    public static void main(String[] args)
	{
		TestRunner.run(KindDaoTest.class);
    }
}