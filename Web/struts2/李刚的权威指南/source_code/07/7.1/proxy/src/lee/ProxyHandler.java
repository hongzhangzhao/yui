package lee;

import java.lang.reflect.*;
import java.util.*;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class ProxyHandler implements InvocationHandler
{
    private Object target;
	DogIntercepter di = new DogIntercepter();
    public Object invoke(Object proxy, Method method, Object[] args)throws Exception
    {
        Object result = null;
        if (method.getName().equals("info"))
        {
            di.method1();
            result =method.invoke(target, args);
            di.method2();
        }
        else
        {
            result =method.invoke(target, args);
        }
        return result;
    }
    public void setTarget(Object o)
    {
        this.target = o;
    }
}

