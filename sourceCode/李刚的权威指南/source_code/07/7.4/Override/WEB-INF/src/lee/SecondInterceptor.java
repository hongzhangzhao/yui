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
public class SecondInterceptor extends AbstractInterceptor
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}

    public String intercept(ActionInvocation invocation) throws Exception
	{
		System.out.println(name + "À¹½ØÆ÷µÄ¶¯×÷");
		return invocation.invoke();
    }
}
