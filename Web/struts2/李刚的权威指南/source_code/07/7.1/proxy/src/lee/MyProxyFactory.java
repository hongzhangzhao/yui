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
     * ʵ��Service����
     * @param serviceName String
     * @return Object
     */
    public static Object getProxy(Object object)
    {
       //Dog������ ����Ĳ�����
        ProxyHandler handler = new ProxyHandler();
       //�Ѹ�dogʵ���и����������
        handler.setTarget(object);
        //��һ���������������� ��̬���� ��ClassLoader����ֻҪ�ö����ܷ���Dog�ӿڼ��ɡ�
        //Ҳ��ֻҪDogImpl��Dog��ͬһ
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
} 