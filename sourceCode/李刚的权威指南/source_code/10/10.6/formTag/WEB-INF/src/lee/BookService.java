package lee;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class BookService
{
	public Book[] getBooks()
	{
		return new Book[]
		{
			new Book("Spring2.0宝典","李刚"),
			new Book("轻量级J2EE企业应用实战","李刚"),
			new Book("基于J2EE的Ajax宝典","李刚")
		};
	}
}
