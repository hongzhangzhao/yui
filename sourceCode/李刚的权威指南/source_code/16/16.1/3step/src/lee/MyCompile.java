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
public class MyCompile
{
    public static void main(String[] args) throws Exception
    {
		JasperCompileManager.compileReportToFile("static.jrxml" , "static.jasper");
		System.out.println("成功编译成JasperReport文件(*.jasper)");
		System.exit(0);
    }
}
