package lee;

import org.apache.struts.action.*;
import javax.servlet.http.*;
import org.apache.struts.validator.*;

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
	public ActionForward execute(ActionMapping mapping , ActionForm form
		, HttpServletRequest request , HttpServletResponse response) throws Exception
	{
		LoginForm loginForm = (LoginForm)form;
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
        if (username.equals("scott")
			&& password.equals("tiger") )
		{
			request.getSession(true).setAttribute("user" , username);
            return mapping.findForward("success");
        }
		else
		{
            return mapping.findForward("error");
        }
    }
}
