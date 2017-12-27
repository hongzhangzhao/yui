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
							"ͼ������ͳ��ͼ", // ͼ�����
							"ͼ��", // Ŀ¼�����ʾ��ǩ
							"����", // ��ֵ�����ʾ��ǩ
							getDataSet(), // ���ݼ�
							true, 	// �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
							false, 	// �Ƿ����ɹ���
							false 	// �Ƿ�����URL����
							);
							
		//��������ͼ����⣬�ı�����
		chart.setTitle(new TextTitle("ͼ������ͳ��ͼ", new Font("����", Font.ITALIC , 22))); 
		//ȡ��ͳ��ͼ��ĵ�һ��ͼ��
		LegendTitle legend = chart.getLegend(0);
		//�޸�ͼ��������
		legend.setItemFont(new Font("����", Font.BOLD, 14)); 
		//ȡ��ʱ��˳��ͼ��Plot����
		XYPlot plot = (XYPlot)chart.getPlot();
		//ȡ�ú���
		ValueAxis categoryAxis = plot.getDomainAxis();
		//���ú�����ʾ��ǩ������
		categoryAxis.setLabelFont(new Font("����" , Font.BOLD , 22));
		categoryAxis.setTickLabelFont(new Font("����" , Font.BOLD , 18));
		//ȡ������
		NumberAxis numberAxis = (NumberAxis)plot.getRangeAxis();
		//����������ʾ��ǩ������
		numberAxis.setLabelFont(new Font("����" , Font.BOLD , 22));

		FileOutputStream fos = null;
		fos = new FileOutputStream("book.jpg");
		//��ͳ��ͼ�������JPG�ļ�
		ChartUtilities.writeChartAsJPEG(
			fos, //������ĸ������
			1, //JPEGͼƬ��������0~1֮��
			chart, //ͳ��ͼ�����
			800, //��
			600,//��
			null //ChartRenderingInfo ��Ϣ
			);
		fos.close();
	}
	//����һ��CategoryDatasetʵ��
	private static XYDataset getDataSet()
	{
		TimeSeries spring = new TimeSeries("Spring2.0����" , Month.class);
		spring.add(new Month(10, 2006), 3400);
		spring.add(new Month(11, 2006), 2700);
		spring.add(new Month(12, 2006), 3100);
		spring.add(new Month(1, 2007), 1800);
		spring.add(new Month(2, 2007), 2200);
		TimeSeries lightWeight = new TimeSeries("������J2EE��ҵӦ��ʵս" , Month.class);
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