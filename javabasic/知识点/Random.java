import java.util.*;

public class Test {

    public static void main(String[] args) {

        Random r1 = new Random();

        r1.nextDouble(); //���� 0~1.0 �����С��
        r1.nextDouble() * 5; //���� 0~5.0 �����С��
        /*
        ���� 1 ~ 2.5 ֮���С��
        �������� 0~1.5 �����С��
        �� �� 1 ��������Сֵ�� 1  �����ֵ�� 1 ��
        */
        r1.nextDouble() * 1.5 + 1;

        r1.nextInt(); //������������
        r1.nextInt(10);//���� 0~10 �����������ȡ����10

        /*
        	���� 0~10 �����������
        	������������int���֣�֮���10ȡ������
        	����Ϊ -10 ~ 10
        	Math.absȡ����ֵ 0 ~ 10
        */
        Math.abs(r1.nextInt() % 10); //


        r.nextInt(18) - 3; //���� -3 ~ 15 ���������

        Math.abs(r.nextInt() % 18) - 3; //���� -3 ~ 15 ���������

		/*
			����������ĸ���
		*/
        int n5 = r.nextInt(100);

        int m; //�������

        if(n5 < 55) { //55�����ֵ����䣬55%�ļ���

            m = 1;

        } else if(n5 < 95) { //[55,95)��40�����ֵ����䣬40%�ļ���

            m = 2;

        } else {

            m = 3;

        }
    }



}