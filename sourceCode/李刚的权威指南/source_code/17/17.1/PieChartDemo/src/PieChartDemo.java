package lee;

import java.io.*;

import org.jfree.data.*;
import org.jfree.data.general.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

import java.awt.Font;
import java.awt.geom.Ellipse2D.Float;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.LegendTitle;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class PieChartDemo
{
	public static void main(String[] args) throws IOException
	{
		DefaultPieDataset data = getDataSet();

		//JFreeChart chart = ChartFactory.createPieChart(
		//生成3D饼图
		JFreeChart chart = ChartFactory.createPieChart3D(
			"图书销量统计图",  // 图表标题
			getDataSet(), //数据
			true, // 是否显示图例
			false, //是否显示工具提示
			false //是否生成URL
		);
		//重新设置图标标题，改变字体
		chart.setTitle(new TextTitle("图书销量统计图", new Font("黑体", Font.ITALIC , 22))); 
		//取得统计图标的第一个图例
		LegendTitle legend = chart.getLegend(0);
		//修改图例的字体
		legend.setItemFont(new Font("宋体", Font.BOLD, 14)); 
		//获得饼图的Plot对象
		PiePlot plot = (PiePlot)chart.getPlot();
		//设置饼图各部分的标签字体
		plot.setLabelFont(new Font("隶书", Font.BOLD, 18)); 
		//设定背景透明度（0-1.0之间）
        plot.setBackgroundAlpha(0.9f);
		//设定前景透明度（0-1.0之间）
        plot.setForegroundAlpha(0.50f);

		FileOutputStream fos = new FileOutputStream("book.jpg");
		ChartUtilities.writeChartAsJPEG(
			fos, //输出到哪个输出流
			1, //JPEG图片的质量，0~1之间
			chart, //统计图标对象
			800, //宽
			600,//宽
			null //ChartRenderingInfo 信息
			);
		fos.close();
	}

	private static DefaultPieDataset getDataSet()
	{
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Spring2.0宝典",47000);
		dataset.setValue("轻量级J2EE企业实战",38000);
		dataset.setValue("基于J2EE的Ajax宝典",31000);
		dataset.setValue("JavaScript权威指南",29000);
		dataset.setValue("Ajax In Action",25000);
		return dataset;
	}
}