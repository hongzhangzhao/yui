package lee;

import com.opensymphony.xwork2.ActionInvocation;
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
public class BeforeResultInterceptor extends AbstractInterceptor
{
    public String intercept(ActionInvocation invocation) throws Exception
	{
		invocation.addPreResultListener(new MyPreResultListener()); 
		System.out.println("execute方法执行之前的拦截...");
		String result = invocation.invoke();
		System.out.println("execute方法执行之后的拦截......");
		return result;

    }
}
