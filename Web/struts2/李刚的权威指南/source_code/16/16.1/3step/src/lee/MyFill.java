package lee;

import net.sf.jasperreports.engine.*;

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
		//���ʱ����ʹû��ʹ������Դ��Ҳ����ָ��һ���½���JREmptyDataSourceʵ����������ֱ��ʹ��null
		JasperFillManager.fillReportToFile("static.jasper" , null , new JREmptyDataSource());
		System.out.println("�ɹ������һ�������ļ�(*.jrprint)");
		System.exit(0);
    }
}
