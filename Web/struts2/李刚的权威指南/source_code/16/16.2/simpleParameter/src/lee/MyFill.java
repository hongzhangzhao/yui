package lee;

import net.sf.jasperreports.engine.*;
import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyFill
{
    public static void main(String[] args) throws Exception
    {
		Map params = new HashMap();
		params.put("author" , "���");
		params.put("book1" , "Spring2.0����");
		params.put("book2" , "������J2EE��ҵӦ��ʵս");
		params.put("book3" , "����J2EE��Ajax����");


		//���ʱ����ʹû��ʹ������Դ��Ҳ����ָ��һ���½���JREmptyDataSourceʵ����������ֱ��ʹ��null
		JasperFillManager.fillReportToFile("simpleVariable.jasper" , params , new JREmptyDataSource());
		System.out.println("�ɹ������һ�������ļ�(*.jrprint)");
		System.exit(0);
    }
}
