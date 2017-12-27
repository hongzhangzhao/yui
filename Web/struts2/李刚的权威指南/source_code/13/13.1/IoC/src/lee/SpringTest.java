package lee;

import java.io.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class SpringTest 
{
	public static void main(String[] args)throws Exception
    {
		//以CLASSPATH路径下的配置文件，创建ClassPathResource实例
		ClassPathResource isr = new ClassPathResource("bean.xml");
		//以Resource对象作为参数，创建BeanFactory的实例
		XmlBeanFactory factory = new XmlBeanFactory(isr);
        Person p1 = (Person)factory.getBean("chinese");
        System.out.println(p1.sayHello("Mary"));
        System.out.println(p1.sayGoodBye("Mary"));
        Person p2 = (Person)factory.getBean("american");
        System.out.println(p2.sayHello("Jack"));
        System.out.println(p2.sayGoodBye("Jack"));
    }
}

