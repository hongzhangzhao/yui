package lee;

import org.hibernate.cfg.*;
import org.hibernate.*;
import java.util.*;
import org.hibernate.criterion.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class Test
{
	public static void main(String[] args) throws Exception
	{
		//实例化Configuration
		Configuration conf = new Configuration().configure();
		//实例化SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//实例化Session
		Session sess = sf.openSession();
		//开始事务
		Transaction tx = sess.beginTransaction();


		List l = sess.createCriteria(News.class)
			//此处增加限制条件必须是Student已经存在的属性
			.add( Restrictions.lt("id" , new Integer(30) ) )
			.list();
		//遍历查询到的记录
		for (Iterator it = l.iterator(); it.hasNext(); )
		{
			News n = (News)it.next();
			System.out.println(n.getTitle());
		}

		//提交事务
		tx.commit();
		//关闭Session
		sess.close();
    }
}
