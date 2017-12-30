package lee;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.*;
import net.sf.jasperreports.engine.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class MyExportExcel
{
    public static void main(String[] args) throws Exception
    {
		JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject("static.jrprint");
		JRXlsExporter exporter = new JRXlsExporter();
		//设置要导出的jasperPrint
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "static.xls");
		exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
		exporter.exportReport();

		System.out.println("成功创建了一个XML文档");
		System.exit(0);
    }
}
