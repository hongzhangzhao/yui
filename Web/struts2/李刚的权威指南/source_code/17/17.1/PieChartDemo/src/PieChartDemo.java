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
		//����3D��ͼ
		JFreeChart chart = ChartFactory.createPieChart3D(
			"ͼ������ͳ��ͼ",  // ͼ�����
			getDataSet(), //����
			true, // �Ƿ���ʾͼ��
			false, //�Ƿ���ʾ������ʾ
			false //�Ƿ�����URL
		);
		//��������ͼ����⣬�ı�����
		chart.setTitle(new TextTitle("ͼ������ͳ��ͼ", new Font("����", Font.ITALIC , 22))); 
		//ȡ��ͳ��ͼ��ĵ�һ��ͼ��
		LegendTitle legend = chart.getLegend(0);
		//�޸�ͼ��������
		legend.setItemFont(new Font("����", Font.BOLD, 14)); 
		//��ñ�ͼ��Plot����
		PiePlot plot = (PiePlot)chart.getPlot();
		//���ñ�ͼ�����ֵı�ǩ����
		plot.setLabelFont(new Font("����", Font.BOLD, 18)); 
		//�趨����͸���ȣ�0-1.0֮�䣩
        plot.setBackgroundAlpha(0.9f);
		//�趨ǰ��͸���ȣ�0-1.0֮�䣩
        plot.setForegroundAlpha(0.50f);

		FileOutputStream fos = new FileOutputStream("book.jpg");
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

	private static DefaultPieDataset getDataSet()
	{
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("Spring2.0����",47000);
		dataset.setValue("������J2EE��ҵʵս",38000);
		dataset.setValue("����J2EE��Ajax����",31000);
		dataset.setValue("JavaScriptȨ��ָ��",29000);
		dataset.setValue("Ajax In Action",25000);
		return dataset;
	}
}