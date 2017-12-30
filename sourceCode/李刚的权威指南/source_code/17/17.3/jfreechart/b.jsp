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
if(category.equals("Spring2.0����") || category.equals("������J2EE��ҵӦ��ʵս")||category.equals("����J2EE��Ajax����")) 
{ 
	dataset = leeGetDataSet(); 
	subTitle="������յ�";
} 
else 
{ 
	dataset = getDataSet(); 
	subTitle="����";
} 
String title = subTitle + "ͼ����������"; 
JFreeChart chart = ChartFactory.createBarChart3D(
	title,  
	"�·�", 
	"����", 
	dataset, 
	PlotOrientation.VERTICAL, 
	true, 
	false, 
	false
); 
//��������ͼ����⣬�ı�����
chart.setTitle(new TextTitle("ͼ������ͳ��ͼ", new Font("����", Font.ITALIC , 22))); 
//ȡ��ͳ��ͼ��ĵ�һ��ͼ��
LegendTitle legend = chart.getLegend(0);
//�޸�ͼ��������
legend.setItemFont(new Font("����", Font.BOLD, 14)); 
CategoryPlot plot = (CategoryPlot)chart.getPlot();
//ȡ�ú���
CategoryAxis categoryAxis = plot.getDomainAxis();
//���ú�����ʾ��ǩ������
categoryAxis.setLabelFont(new Font("����" , Font.BOLD , 22));
//�����ǩ��45�Ƚ���б
categoryAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
categoryAxis.setTickLabelFont(new Font("����" , Font.BOLD , 18));
//ȡ������
NumberAxis numberAxis = (NumberAxis)plot.getRangeAxis();
//����������ʾ��ǩ������
numberAxis.setLabelFont(new Font("����" , Font.BOLD , 22));
String filename = ServletUtilities.saveChartAsPNG(chart, 650, 390, null, session); 
%> 

<%! 
private static CategoryDataset leeGetDataSet() 
{ 
	DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
	dataset.addValue(3000, "Spring2.0����", "06��10��");
	dataset.addValue(2800, "Spring2.0����", "06��11��");
	dataset.addValue(2100, "Spring2.0����", "06��12��");
	dataset.addValue(3200, "Spring2.0����", "07��01��");
	dataset.addValue(2800, "������J2EE��ҵӦ��ʵս", "07��01��"); 
	dataset.addValue(2680, "����Ajax�Ŀ�������", "07��01��"); 
	dataset.addValue(2690, "Spring2.0����", "07��02��");
	dataset.addValue(1830, "������J2EE��ҵӦ��ʵս", "07��02��"); 
	dataset.addValue(3490, "����Ajax�Ŀ�������", "07��02��");
	dataset.addValue(1890, "Spring2.0����", "07��03��");
	dataset.addValue(2640, "������J2EE��ҵӦ��ʵս", "07��03��"); 
	dataset.addValue(3180, "����Ajax�Ŀ�������", "07��03��");

	return dataset; 
} 
private static CategoryDataset getDataSet() 
{ 
	DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
	dataset.addValue(3500, "JavaScriptȨ��ָ��", "06��10��");
	dataset.addValue(4200, "Ajax In Action", "06��10��"); 
	dataset.addValue(3800, "JavaScriptȨ��ָ��", "06��11��");
	dataset.addValue(2300, "Ajax In Action", "06��11��"); 
	dataset.addValue(2590, "JavaScriptȨ��ָ��", "06��12��");
	dataset.addValue(1590, "Ajax In Action", "06��12��"); 
	dataset.addValue(3180, "JavaScriptȨ��ָ��", "07��01��");
	dataset.addValue(1200, "Ajax In Action", "07��01��"); 
	dataset.addValue(3140, "JavaScriptȨ��ָ��", "07��02��");
	dataset.addValue(940, "Ajax In Action", "07��02��"); 
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
