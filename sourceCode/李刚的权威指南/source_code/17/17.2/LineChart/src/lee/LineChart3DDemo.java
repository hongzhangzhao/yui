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


public class LineChart3DDemo
{
	public static void main(String[] args) throws IOException
	{
		JFreeChart chart = ChartFactory.createTimeSeriesChart(
							"ͼ������ͳ��ͼ", // ͼ�����
							"ͼ��", // Ŀ¼�����ʾ��ǩ
							"����", // ��ֵ�����ʾ��ǩ
							getDataSet(), // ���ݼ�
							//PlotOrientation.HORIZONTAL , // ͼ����ˮƽ
							PlotOrientation.VERTICAL , // ͼ���򣺴�ֱ
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
	private static CategoryDataset getDataSet()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(45000 , "����" , "Spring2.0����");
		dataset.addValue(38000 , "����" , "������J2EE��ҵʵս");
		dataset.addValue(24000 , "����" , "����J2EE��Ajax����");
		dataset.addValue(32000 , "����" , "JavaScriptȨ��ָ��");
		dataset.addValue(21000 , "����" , "Ajax In Action");
		dataset.addValue(37000 , "�Ϻ�" , "Spring2.0����");
		dataset.addValue(36000 , "�Ϻ�" , "������J2EE��ҵʵս");
		dataset.addValue(34000 , "�Ϻ�" , "����J2EE��Ajax����");
		dataset.addValue(42000 , "�Ϻ�" , "JavaScriptȨ��ָ��");
		dataset.addValue(12000 , "�Ϻ�" , "Ajax In Action");
		dataset.addValue(42000 , "����" , "Spring2.0����");
		dataset.addValue(40000 , "����" , "������J2EE��ҵʵս");
		dataset.addValue(34000 , "����" , "����J2EE��Ajax����");
		dataset.addValue(18000 , "����" , "JavaScriptȨ��ָ��");
		dataset.addValue(26000 , "����" , "Ajax In Action");
		return dataset;
	}
}