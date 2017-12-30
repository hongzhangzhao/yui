package lee;

import java.io.*;

import org.jfree.data.*;
import org.jfree.data.category.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */


public class BarChartDemo 
{

	public static void main(String[] args) throws IOException
	{
		JFreeChart chart = ChartFactory.createBarChart3D(
							"水果产量图", // 图表标题
							"水果", // 目录轴的显示标签
							"产量", // 数值轴的显示标签
							getDataSet(), // 数据集
							//PlotOrientation.HORIZONTAL , // 图表方向：水平
							PlotOrientation.VERTICAL , // 图表方向：垂直
							true, 	// 是否显示图例(对于简单的柱状图必须是false)
							false, 	// 是否生成工具
							false 	// 是否生成URL链接
							);
							
		FileOutputStream fos = null;

		fos = new FileOutputStream("fruit.jpg");
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

	/**
	 * 获取一个演示用的组合数据集对象
	 * @return
	 */
	private static CategoryDataset getDataSet()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(100, "北京", "苹果");
		/*
		添加数据时
		参数1 － 值。
		参数2 － 行key
		参数3 － 列key
		*/
		dataset.addValue(100, "上海", "苹果");
		dataset.addValue(100, "广州", "苹果");
		dataset.addValue(200, "北京", "梨子");
		dataset.addValue(200, "上海", "梨子");
		dataset.addValue(200, "广州", "梨子");
		dataset.addValue(300, "北京", "葡萄");
		dataset.addValue(300, "上海", "葡萄");
		dataset.addValue(300, "广州", "葡萄");
		dataset.addValue(400, "北京", "香蕉");
		dataset.addValue(400, "上海", "香蕉");
		dataset.addValue(400, "广州", "香蕉");
		dataset.addValue(500, "北京", "荔枝");
		dataset.addValue(500, "上海", "荔枝");
		dataset.addValue(500, "广州", "荔枝");
		return dataset;
	}
}
