<%--
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2005-2008, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html;charset=GBK"%> 
<%@ page import="org.jfree.chart.ChartFactory, org.jfree.chart.JFreeChart, org.jfree.chart.plot.PlotOrientation" %>
<%@ page import="org.jfree.chart.servlet.ServletUtilities,org.jfree.data.category.*"%> 
<%@ page import="org.jfree.chart.title.*"%> 
<%@ page import="org.jfree.chart.plot.*"%> 
<%@ page import="org.jfree.chart.axis.*"%> 
<%@ page import="java.awt.*"%> 

<% 
CategoryDataset dataset; 
//String category = request.getParameter("category"); 
//category = new String(category.getBytes("GBK"), "UTF-8");
//System.out.println(category);
String queryString = request.getQueryString(); 
queryString = java.net.URLDecoder.decode(queryString , "UTF-8");
System.out.println(queryString);

String category = null;
for(String param : queryString.split("&"))
{
	String[] nameValue = param.split("=");
	category = nameValue[0].equals("category") ? nameValue[1] : category;
}
String subTitle = "";
if(category.equals("Spring2.0宝典") || category.equals("轻量级J2EE企业应用实战")||category.equals("基于J2EE的Ajax宝典")) 
{ 
	dataset = leeGetDataSet(); 
	subTitle="作者李刚的";
} 
else 
{ 
	dataset = getDataSet(); 
	subTitle="其他";
} 
String title = subTitle + "图书的销售情况"; 
JFreeChart chart = ChartFactory.createBarChart3D(
	title,  
	"月份", 
	"销量", 
	dataset, 
	PlotOrientation.VERTICAL, 
	true, 
	false, 
	false
); 
//重新设置图标标题，改变字体
chart.setTitle(new TextTitle("图书销量统计图", new Font("黑体", Font.ITALIC , 22))); 
//取得统计图标的第一个图例
LegendTitle legend = chart.getLegend(0);
//修改图例的字体
legend.setItemFont(new Font("宋体", Font.BOLD, 14)); 
CategoryPlot plot = (CategoryPlot)chart.getPlot();
//取得横轴
CategoryAxis categoryAxis = plot.getDomainAxis();
//设置横轴显示标签的字体
categoryAxis.setLabelFont(new Font("宋体" , Font.BOLD , 22));
//分类标签以45度角倾斜
categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
categoryAxis.setTickLabelFont(new Font("宋体" , Font.BOLD , 18));
//取得纵轴
NumberAxis numberAxis = (NumberAxis)plot.getRangeAxis();
//设置纵轴显示标签的字体
numberAxis.setLabelFont(new Font("宋体" , Font.BOLD , 22));
String filename = ServletUtilities.saveChartAsPNG(chart, 650, 390, null, session); 
%> 

<%! 
private static CategoryDataset leeGetDataSet() 
{ 
	DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
	dataset.addValue(3000, "Spring2.0宝典", "06年10月");
	dataset.addValue(2800, "Spring2.0宝典", "06年11月");
	dataset.addValue(2100, "Spring2.0宝典", "06年12月");
	dataset.addValue(3200, "Spring2.0宝典", "07年01月");
	dataset.addValue(2800, "轻量级J2EE企业应用实战", "07年01月"); 
	dataset.addValue(2680, "基于Ajax的开发宝典", "07年01月"); 
	dataset.addValue(2690, "Spring2.0宝典", "07年02月");
	dataset.addValue(1830, "轻量级J2EE企业应用实战", "07年02月"); 
	dataset.addValue(3490, "基于Ajax的开发宝典", "07年02月");
	dataset.addValue(1890, "Spring2.0宝典", "07年03月");
	dataset.addValue(2640, "轻量级J2EE企业应用实战", "07年03月"); 
	dataset.addValue(3180, "基于Ajax的开发宝典", "07年03月");

	return dataset; 
} 
private static CategoryDataset getDataSet() 
{ 
	DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
	dataset.addValue(3500, "JavaScript权威指南", "06年10月");
	dataset.addValue(4200, "Ajax In Action", "06年10月"); 
	dataset.addValue(3800, "JavaScript权威指南", "06年11月");
	dataset.addValue(2300, "Ajax In Action", "06年11月"); 
	dataset.addValue(2590, "JavaScript权威指南", "06年12月");
	dataset.addValue(1590, "Ajax In Action", "06年12月"); 
	dataset.addValue(3180, "JavaScript权威指南", "07年01月");
	dataset.addValue(1200, "Ajax In Action", "07年01月"); 
	dataset.addValue(3140, "JavaScript权威指南", "07年02月");
	dataset.addValue(940, "Ajax In Action", "07年02月"); 
	return dataset; 
} 
%>
<HTML> 
<HEAD> 
<META http-equiv=Content-Type content="text/html; charset=GBK"> 
<TITLE><%=title%></TITLE> 
</HEAD> 
<body>
<div ALIGN="CENTER"> 
<img src="DisplayChart?filename=<%=filename%>" 
	width="650" height="390" border="0"/>  
</div>
</body> 
</html>  
