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
		params.put("author" , "李刚");
		params.put("book1" , "Spring2.0宝典");
		params.put("book2" , "轻量级J2EE企业应用实战");
		params.put("book3" , "基于J2EE的Ajax宝典");


		//填充时，即使没有使用数据源，也必须指定一个新建的JREmptyDataSource实例，而不能直接使用null
		JasperFillManager.fillReportToFile("simpleVariable.jasper" , params , new JREmptyDataSource());
		System.out.println("成功填充了一个报表文件(*.jrprint)");
		System.exit(0);
    }
}
