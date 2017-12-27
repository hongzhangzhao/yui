package lee;

import java.util.Date;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class User
{
	private String name;
	private Integer age;
	private Date birth;

	public void setName(String name)
	{
		this.name = name; 
	}

	public void setAge(Integer age)
	{
		this.age = age; 
	}

	public void setBirth(Date birth)
	{
		this.birth = birth; 
	}

	public String getName()
	{
		return (this.name); 
	}

	public Integer getAge()
	{
		return (this.age); 
	}

	public Date getBirth()
	{
		return (this.birth); 
	}
}
