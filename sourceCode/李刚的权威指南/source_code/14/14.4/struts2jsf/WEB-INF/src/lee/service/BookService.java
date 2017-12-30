package lee.service;

import java.util.*;
import lee.model.Book;
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
	private Set<Book> bookDb;

	public BookService()
	{
		bookDb = new HashSet<Book>();
		bookDb.add(new Book(1 , "Spring2.0����" , "ȫ�������Spring����֪ʶ��"));
		bookDb.add(new Book(2 , "������J2EE��ҵӦ��ʵս" , "����ʵ����ҵ��J2EE��������"));
	}

	public Set<Book> getAllBook()
	{
		return bookDb;
	}

	public Book getBookById(int id)
	{
		for (Book b : bookDb)
		{
			if (b.getId() == id)
			{
				return b;
			}
		}
		return null;
	}


	public void addBook(Book b)
	{
		bookDb.add(b);
	}
}
