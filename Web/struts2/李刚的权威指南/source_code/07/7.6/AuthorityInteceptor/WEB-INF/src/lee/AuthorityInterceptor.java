package lee;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.*;

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
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String user = (String)session.get("user");
		if (user != null && user.equals("scott") )
		{
			return invocation.invoke();
		}
		ctx.put("tip" , "您还没有登陆，请输入scott,tiger登陆系统");
		return Action.LOGIN;
    }
}
