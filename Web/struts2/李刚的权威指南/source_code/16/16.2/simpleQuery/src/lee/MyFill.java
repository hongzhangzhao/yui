package lee;

import net.sf.jasperreports.engine.*;
import java.util.*;

import java.sql.*;
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
		params.put("id" , 1);
		//填充时，直接指定一个Connection作为数据连接
		JasperFillManager.fillReportToFile("simpleQuery.jasper" , params , getConnection());
		System.out.println("成功填充了一个报表文件(*.jrprint)");
		System.exit(0);
    }

	private static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String driver = "com.mysql.jdbc.Driver";
		String connectString = "jdbc:mysql://localhost/j2ee";
		String user = "root";
		String password = "32147";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(connectString, user, password);
		return conn;
	}
}
