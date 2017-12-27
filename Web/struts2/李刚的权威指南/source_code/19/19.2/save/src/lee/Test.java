package lee;

import org.hibernate.cfg.*;
import org.hibernate.*;

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
		//创建消息实例
		News n = new News();
		//设置消息标题和消息内容
		n.setTitle("第一条消息");
		n.setContent("今天天晴了");
		//保存消息
		sess.save(n);
		//提交事务
		tx.commit();
		//关闭Session
		sess.close();
    }
}
