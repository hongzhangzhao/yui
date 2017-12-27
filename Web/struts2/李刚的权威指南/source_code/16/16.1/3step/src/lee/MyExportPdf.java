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
public class MyExportPdf
{
    public static void main(String[] args) throws Exception
    {
		JasperExportManager.exportReportToPdfFile("static.jrprint" , "static.pdf");
		System.out.println("成功创建了一个PDF文档");
		System.exit(0);
    }
}
