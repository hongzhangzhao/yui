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
		//ʵ����Configuration
		Configuration conf = new Configuration().configure();
		//ʵ����SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//ʵ����Session
		Session sess = sf.openSession();
		//��ʼ����
		Transaction tx = sess.beginTransaction();
		//������Ϣʵ��
		News n = new News();
		//������Ϣ�������Ϣ����
		n.setTitle("��һ����Ϣ");
		n.setContent("����������");
		//������Ϣ
		sess.save(n);
		//�ύ����
		tx.commit();
		//�ر�Session
		sess.close();
    }
}
