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
data.setValue("Spring2.0����",47000);
data.setValue("������J2EE��ҵӦ��ʵս",38000);
data.setValue("����J2EE��Ajax����",31000);
data.setValue("JavaScriptȨ��ָ��",29000);
data.setValue("Ajax In Action",25000);

//����3D��ͼ��Plot����
PiePlot3D plot = new PiePlot3D(data); 
plot.setLabelFont(new Font("����", Font.BOLD, 16)); 
JFreeChart chart = new JFreeChart("",JFreeChart.DEFAULT_TITLE_FONT, plot, true); 
chart.setTitle(new TextTitle("ͼ������ͳ��ͼ", new Font("����", Font.ITALIC , 22)));
//��ȡͳ��ͼ���ͼ������
LegendTitle legend = chart.getLegend(0);
//�޸�ͼ��������
legend.setItemFont(new Font("����", Font.BOLD, 13));
//���ɱ�ͼ�����ֵ���ʾ���������ͣʱ��ʾʵ��ͳ��ֵ��
plot.setToolTipGenerator(new StandardPieToolTipGenerator()); 
//�趨�ȵ�����
plot.setURLGenerator(new StandardPieURLGenerator("b.jsp")); 
StandardEntityCollection entityCollection = new StandardEntityCollection(); 
//����RenderingInfoʵ��
ChartRenderingInfo info = new ChartRenderingInfo(entityCollection); 
//��ҳ�������out��װ��һ��PrintWriterʵ��
PrintWriter pw = new PrintWriter(out); 
//��Web����������ʱĿ¼����һ��ͼƬ��720��ͼƬ���ȣ�450��ͼƬ�߶� 
String filename = ServletUtilities.saveChartAsPNG(chart, 720, 450, info, null); 
//��ͼ����ȵ���Ϣ��HTMLҳ���������pw����ҳ��������,map0�Ƕ����ȵ��Map��ǩID
//info��������ͼƬ���ȵ���Ϣ
ChartUtilities.writeImageMap(pw, "map0", info, false); 
%>
<HTML> 
<HEAD> 
<META http-equiv=Content-Type content="text/html; charset=GBK"> 
<TITLE>ͼ��������ͼ</TITLE> 
</HEAD> 
<BODY> 
<div ALIGN="CENTER"> 
<img src="DisplayChart?filename=<%=filename%>"  width="720" height="450" usemap="#map0"> 
</div> 
</BODY> 
</HTML>