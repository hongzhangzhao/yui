package lee;

import org.apache.struts.action.*;
import javax.servlet.http.*;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class GetBooksAction extends Action
{
	private String[] books;

	{
		books = new String[]{
			"Spring2.0����" ,
			"������J2EE��ҵӦ��ʵս",
			"����J2EE��Ajax����",
			"Struts,Spring,Hibernate���Ͽ���"
		};
	}

	public String[] getBooks()
	{
		return books;
	}

	public ActionForward execute(ActionMapping mapping , ActionForm form
		, HttpServletRequest request , HttpServletResponse response) throws Exception
	{
		String user = (String)request.getSession().getAttribute("user");
		if (user != null && user.equals("scott"))
		{
			request.setAttribute("books" , getBooks());
            return mapping.findForward("success");
		}
		else
		{
            return mapping.findForward("login");
		}
    }
}
