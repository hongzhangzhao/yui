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
public class MyExportXml
{
    public static void main(String[] args) throws Exception
    {
		JasperExportManager.exportReportToXmlFile("simpleQuery.jrprint" , "simpleQuery.xml" , true);
		System.out.println("成功创建了一个XML文档");
		System.exit(0);
    }
}
