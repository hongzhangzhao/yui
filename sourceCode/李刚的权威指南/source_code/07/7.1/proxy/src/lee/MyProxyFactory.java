package lee;

import java.lang.reflect.*;
/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyProxyFactory
{
    /**
     * 实例Service对象。
     * @param serviceName String
     * @return Object
     */
    public static Object getProxy(Object object)
    {
       //Dog控制类 代理的操作类
        ProxyHandler handler = new ProxyHandler();
       //把该dog实例托付给代理操作
        handler.setTarget(object);
        //第一个参数是用来创建 动态代理 的ClassLoader对象，只要该对象能访问Dog接口即可。
        //也就只要DogImpl与Dog在同一
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
} 