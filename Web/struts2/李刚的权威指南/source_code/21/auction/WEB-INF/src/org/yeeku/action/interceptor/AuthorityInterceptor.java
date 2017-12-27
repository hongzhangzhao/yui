package org.yeeku.action.interceptor;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.*;
import java.util.Map;


/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class AuthorityInterceptor extends AbstractInterceptor
{
    public String intercept(ActionInvocation invocation) throws Exception
	{
		Map session = ActionContext.getContext().getSession();
		Object userId = session.get("userId");
		if (userId == null)
		{
			return "login";
		}
		else
		{
			return invocation.invoke();
		}
    }
}