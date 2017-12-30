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
		//填充时，即使没有使用数据源，也必须指定一个新建的JREmptyDataSource实例，而不能直接使用null
		JasperFillManager.fillReportToFile("static.jasper" , null , new JREmptyDataSource());
		System.out.println("成功填充了一个报表文件(*.jrprint)");
		System.exit(0);
    }
}
