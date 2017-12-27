package lee;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class TagAction extends ActionSupport
{
	private String author;

	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}

	public String execute() throws Exception
	{
		return "done";
	}

	public String login() throws Exception
	{
		ServletActionContext.getRequest().setAttribute("author", getAuthor());
		return "done";
	}
}