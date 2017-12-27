package org.yeeku.test;

import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuctionTest
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(AuctionUserDaoTest.class);
        suite.addTestSuite(BidDaoTest.class);
        suite.addTestSuite(ItemDaoTest.class);
        suite.addTestSuite(KindDaoTest.class);
        suite.addTestSuite(StateDaoTest.class);
        suite.addTestSuite(AuctionManagerTest.class);
        return suite;
    }

    public static void main(String args[])
    {
        junit.textui.TestRunner.run(suite()); 
        junit.textui.TestRunner.run(AuctionTest.class); 
    }
}
