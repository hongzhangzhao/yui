package lee;

import java.io.*;

import org.jfree.data.*;
import org.jfree.data.category.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

import org.jfree.chart.axis.*;

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


public class BarChart3DDemo
{
	public static void main(String[] args) throws IOException
	{
		JFreeChart chart = ChartFactory.createBarChart3D(
							"图书销量统计图", // 图表标题
							"图书", // 目录轴的显示标签
							"销量", // 数值轴的显示标签
							getDataSet(), // 数据集
							//PlotOrientation.HORIZONTAL , // 图表方向：水平
							PlotOrientation.VERTICAL , // 图表方向：垂直
							false, 	// 是否显示图例(对于简单的柱状图必须是false)
							false, 	// 是否生成工具
							false 	// 是否生成URL链接
							);
							
		//重新设置图标标题，改变字体
		chart.setTitle(new TextTitle("图书销量统计图", new Font("黑体", Font.ITALIC , 22))); 
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
	private static CategoryDataset getDataSet()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(47000 , "" , "Spring2.0宝典");
		dataset.addValue(38000 , "" , "轻量级J2EE企业实战");
		dataset.addValue(31000 , "" , "基于J2EE的Ajax宝典");
		dataset.addValue(29000 , "" , "JavaScript权威指南");
		dataset.addValue(25000 , "" , "Ajax In Action");
		return dataset;
	}
}