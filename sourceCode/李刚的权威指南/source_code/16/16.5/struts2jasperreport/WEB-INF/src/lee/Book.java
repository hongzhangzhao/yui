package lee;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Book
{
	private int id;
	private String name;
	private String author;

	public Book()
	{
	}

	public Book(int id , String name  , String author)
	{
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		 return this.id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		 return this.author;
	}

}