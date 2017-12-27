package lee;

import java.io.*;

import org.jfree.data.*;
import org.jfree.data.category.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

import org.jfree.chart.axis.*;
import org.jfree.data.time.*;
import org.jfree.data.xy.XYDataset;

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


public class TimeChartDemo
{
	public static void main(String[] args) throws IOException
	{
		JFreeChart chart = ChartFactory.createTimeSeriesChart(
							"图书销量统计图", // 图表标题
							"图书", // 目录轴的显示标签
							"销量", // 数值轴的显示标签
							getDataSet(), // 数据集
							true, 	// 是否显示图例(对于简单的柱状图必须是false)
							false, 	// 是否生成工具
							false 	// 是否生成URL链接
							);
							
		//重新设置图标标题，改变字体
		chart.setTitle(new TextTitle("图书销量统计图", new Font("黑体", Font.ITALIC , 22))); 
		//取得统计图标的第一个图例
		LegendTitle legend = chart.getLegend(0);
		//修改图例的字体
		legend.setItemFont(new Font("宋体", Font.BOLD, 14)); 
		//取得时间顺序图的Plot对象
		XYPlot plot = (XYPlot)chart.getPlot();
		//取得横轴
		ValueAxis categoryAxis = plot.getDomainAxis();
		//设置横轴显示标签的字体
		categoryAxis.setLabelFont(new Font("宋体" , Font.BOLD , 22));
		categoryAxis.setTickLabelFont(new Font("宋体" , Font.BOLD , 18));
		//取得纵轴
		NumberAxis numberAxis = (NumberAxis)plot.getRangeAxis();
		//设置纵轴显示标签的字体
		numberAxis.setLabelFont(new Font("宋体" , Font.BOLD , 22));

		FileOutputStream fos = null;
		fos = new FileOutputStream("book.jpg");
		//将统计图标输出成JPG文件
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
	//返回一个CategoryDataset实例
	private static XYDataset getDataSet()
	{
		TimeSeries spring = new TimeSeries("Spring2.0宝典" , Month.class);
		spring.add(new Month(10, 2006), 3400);
		spring.add(new Month(11, 2006), 2700);
		spring.add(new Month(12, 2006), 3100);
		spring.add(new Month(1, 2007), 1800);
		spring.add(new Month(2, 2007), 2200);
		TimeSeries lightWeight = new TimeSeries("轻量级J2EE企业应用实战" , Month.class);
		lightWeight.add(new Month(10, 2006), 2800);
		lightWeight.add(new Month(11, 2006), 3700);
		lightWeight.add(new Month(12, 2006), 2600);
		lightWeight.add(new Month(1, 2007), 2100);
		lightWeight.add(new Month(2, 2007), 1100);

		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(spring);
		dataset.addSeries(lightWeight);
		return dataset;
	}
}