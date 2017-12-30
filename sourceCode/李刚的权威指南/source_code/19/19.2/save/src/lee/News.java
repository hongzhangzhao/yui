package lee;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class News
{
	//消息类的标识属性
	private int id;
	//消息标题
	private String title;
	//消息内容
	private String content;
	//构造器
	public News()
	{
	}
	//标识属性的setter方法
	public void setId(int id) 
	{
		this.id = id; 
	}
	//消息标题的setter方法
	public void setTitle(String title) 
	{
		this.title = title; 
	}
	//消息内容的setter方法
	public void setContent(String content) 
	{
		this.content = content; 
	}
	//标识属性的getter方法
	public int getId() 
	{
		return (this.id); 
	}
	//消息标题的getter方法
	public String getTitle()
	{
		return (this.title); 
	}
	//消息内容的getter方法
	public String getContent() 
	{
		return (this.content); 
	}
}
