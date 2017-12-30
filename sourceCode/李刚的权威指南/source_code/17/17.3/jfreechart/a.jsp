<%--
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2005-2008, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html;charset=GBK"%> 
<%@ page import="org.jfree.data.general.DefaultPieDataset"%> 
<%@ page import="org.jfree.chart.*"%> 
<%@ page import="org.jfree.chart.plot.*"%> 
<%@ page import="org.jfree.chart.servlet.ServletUtilities"%> 
<%@ page import="org.jfree.chart.urls.StandardPieURLGenerator"%> 
<%@ page import="org.jfree.chart.entity.StandardEntityCollection"%> 
<%@ page import="java.io.*,java.awt.*"%> 
<%@ page import="org.jfree.chart.labels.*"%> 
<%@ page import="org.jfree.chart.title.*"%> 

<% 
DefaultPieDataset data = new DefaultPieDataset();
data.setValue("Spring2.0宝典",47000);
data.setValue("轻量级J2EE企业应用实战",38000);
data.setValue("基于J2EE的Ajax宝典",31000);
data.setValue("JavaScript权威指南",29000);
data.setValue("Ajax In Action",25000);

//创建3D饼图的Plot对象
PiePlot3D plot = new PiePlot3D(data); 
plot.setLabelFont(new Font("隶书", Font.BOLD, 16)); 
JFreeChart chart = new JFreeChart("",JFreeChart.DEFAULT_TITLE_FONT, plot, true); 
chart.setTitle(new TextTitle("图书销量统计图", new Font("黑体", Font.ITALIC , 22)));
//获取统计图表的图例对象
LegendTitle legend = chart.getLegend(0);
//修改图例的字体
legend.setItemFont(new Font("宋体", Font.BOLD, 13));
//生成饼图各部分的提示，当鼠标悬停时显示实际统计值。
plot.setToolTipGenerator(new StandardPieToolTipGenerator()); 
//设定热点链接
plot.setURLGenerator(new StandardPieURLGenerator("b.jsp")); 
StandardEntityCollection entityCollection = new StandardEntityCollection(); 
//生成RenderingInfo实例
ChartRenderingInfo info = new ChartRenderingInfo(entityCollection); 
//将页面输出流out包装成一个PrintWriter实例
PrintWriter pw = new PrintWriter(out); 
//在Web服务器的临时目录生成一张图片，720是图片长度，450是图片高度 
String filename = ServletUtilities.saveChartAsPNG(chart, 720, 450, info, null); 
//将图表的热点信息在HTML页面中输出，pw代表页面的输出流,map0是定义热点的Map标签ID
//info参数就是图片的热点信息
ChartUtilities.writeImageMap(pw, "map0", info, false); 
%>
<HTML> 
<HEAD> 
<META http-equiv=Content-Type content="text/html; charset=GBK"> 
<TITLE>图书销量饼图</TITLE> 
</HEAD> 
<BODY> 
<div ALIGN="CENTER"> 
<img src="DisplayChart?filename=<%=filename%>"  width="720" height="450" usemap="#map0"> 
</div> 
</BODY> 
</HTML>