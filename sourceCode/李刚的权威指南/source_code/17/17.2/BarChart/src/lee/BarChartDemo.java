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
							"ˮ������ͼ", // ͼ�����
							"ˮ��", // Ŀ¼�����ʾ��ǩ
							"����", // ��ֵ�����ʾ��ǩ
							getDataSet(), // ���ݼ�
							//PlotOrientation.HORIZONTAL , // ͼ����ˮƽ
							PlotOrientation.VERTICAL , // ͼ���򣺴�ֱ
							true, 	// �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
							false, 	// �Ƿ����ɹ���
							false 	// �Ƿ�����URL����
							);
							
		FileOutputStream fos = null;

		fos = new FileOutputStream("fruit.jpg");
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

	/**
	 * ��ȡһ����ʾ�õ�������ݼ�����
	 * @return
	 */
	private static CategoryDataset getDataSet()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(100, "����", "ƻ��");
		/*
		�������ʱ
		����1 �� ֵ��
		����2 �� ��key
		����3 �� ��key
		*/
		dataset.addValue(100, "�Ϻ�", "ƻ��");
		dataset.addValue(100, "����", "ƻ��");
		dataset.addValue(200, "����", "����");
		dataset.addValue(200, "�Ϻ�", "����");
		dataset.addValue(200, "����", "����");
		dataset.addValue(300, "����", "����");
		dataset.addValue(300, "�Ϻ�", "����");
		dataset.addValue(300, "����", "����");
		dataset.addValue(400, "����", "�㽶");
		dataset.addValue(400, "�Ϻ�", "�㽶");
		dataset.addValue(400, "����", "�㽶");
		dataset.addValue(500, "����", "��֦");
		dataset.addValue(500, "�Ϻ�", "��֦");
		dataset.addValue(500, "����", "��֦");
		return dataset;
	}
}
