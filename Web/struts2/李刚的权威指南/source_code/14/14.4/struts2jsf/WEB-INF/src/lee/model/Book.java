package lee.model;

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
	private String desc;

	public Book()
	{
	}

	public Book(int id , String name ,String desc)
	{
		this.id = id;
		this.name = name;
		this.desc = desc;
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

	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDesc()
	{
		 return this.desc;
	}

	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object target)
	{
		if (target instanceof Book)
		{
			Book b = (Book)target;
			if (b.getId() == this.id)
			{
				return true;
			}
		}
		return false;
	}
}