package lee;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class JasperAction extends ActionSupport
{
	public List getBookList()
	{
		List result = new ArrayList();
		result.add(new Book(1 , "Spring2.0����" , "���"));
		result.add(new Book(2 , "������J2EE��ҵӦ��ʵս" , "���"));
		result.add(new Book(3 , "����J2EE��Ajax����" , "���"));
		return result;
	}
}
