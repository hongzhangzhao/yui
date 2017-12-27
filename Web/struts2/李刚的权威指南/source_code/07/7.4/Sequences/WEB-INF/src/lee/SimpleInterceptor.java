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
public class SimpleInterceptor extends AbstractInterceptor
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}

    public String intercept(ActionInvocation invocation) throws Exception
	{
		LoginAction action = (LoginAction)invocation.getAction();
		System.out.println(name + " 拦截器的动作---------" + "开始执行登陆Action的时间为：" + new Date());
		long start = System.currentTimeMillis();
		String result = invocation.invoke();
		System.out.println(name + " 拦截器的动作---------" + "执行完登陆Action的时间为：" + new Date());
		long end = System.currentTimeMillis();
		System.out.println(name + " 拦截器的动作---------" + "执行完该Action的事件为" + (end - start) + "毫秒");
		return result;
    }
}
