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
			"Spring2.0����" ,
			"������J2EE��ҵӦ��ʵս",
			"����J2EE��Ajax����",
			"Struts,Spring,Hibernate���Ͽ���"
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
