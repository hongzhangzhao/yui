package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class GetBooksAction implements Action
{
	{
		books = new String[]{
			"Spring2.0宝典" ,
			"轻量级J2EE企业应用实战",
			"基于J2EE的Ajax宝典",
			"Struts,Spring,Hibernate整合开发"
		};
	}

	private String[] books;

	public String[] getBooks()
	{
		return books;
	}

	public String execute() throws Exception
	{
		String user = (String)ActionContext.getContext().getSession().get("user");
		if (user != null && user.equals("scott"))
		{
			return SUCCESS;
		}
		else
		{
			return LOGIN;
		}
    }
}
