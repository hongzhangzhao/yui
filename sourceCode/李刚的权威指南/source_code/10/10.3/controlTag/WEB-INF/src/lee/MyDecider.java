package lee;

import org.apache.struts2.util.SubsetIteratorFilter;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyDecider implements SubsetIteratorFilter.Decider
{
	public boolean decide(Object element) throws Exception
	{
		String str = (String)element;
		return str.indexOf("J2EE") > 0;
	}
}
