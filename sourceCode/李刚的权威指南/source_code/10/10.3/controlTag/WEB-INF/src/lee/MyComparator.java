package lee;

import java.util.Comparator;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyComparator implements Comparator
{
	public int compare(Object element1, Object element2)
	{
		return element1.toString().length() - element2.toString().length();
	}
}
