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
public class Jasper2Pdf
{
    public static void main(String[] args) throws Exception
    {
		JasperRunManager.runReportToPdfFile("static.jasper" , "static.pdf" , null , new JREmptyDataSource());
		System.out.println("直接从Jasper文件创建一个PDF文档");
		System.exit(0);
    }
}
