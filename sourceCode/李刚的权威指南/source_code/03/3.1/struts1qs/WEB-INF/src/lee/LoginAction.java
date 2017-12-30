package lee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginAction extends Action 
{
    //必须重写该execute方法，该方法用户处理用户请求
    public ActionForward execute(ActionMapping mapping, ActionForm form,
       HttpServletRequest request, HttpServletResponse response)throws Exception
    {
		LoginForm loginForm = (LoginForm)form;
		String username = loginForm.getUsername();
		String pass = loginForm.getPass();

		if (username != null && username.equals("scott"))
		{
			return mapping.findForward("welcome");
		}
		else
		{
			return mapping.findForward("error");
		}
    }
}