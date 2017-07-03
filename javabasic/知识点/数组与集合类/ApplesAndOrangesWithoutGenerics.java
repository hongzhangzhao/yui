package com.basic;

import java.util.*;

/*
 * 1.���һ����û����ȷ�̳��ĸ��࣬�������Զ��̳�Object��
 * 2.ArrayList���Դ���ͬ���͵Ķ���
 * 3.ArrayList����������Object,������ȡ���Ķ���Ҫ����ת�Ͳ��ܵ��÷���
 * 4.������ָ�����������ͣ�����ֻ���Դ�ָ�����͵Ķ���
 * 5.get()���ǰѶ�����б����ó������б��о�û�����������
 * 6.�����巺�͵��б�ȡ��Ԫ�أ����Զ�������ת���ɷ��Ͷ��������
 * 7.����Ҳ��������ת��
 * 
 * 
 * */

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked") // ������һЩ������Ϣ

		ArrayList<Apple> apples = new ArrayList<>();// ����
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());

		}
		apples.add(new GrannySmith()); //����ת��
		apples.add(new Braeburn());

		for (int i = 0; i < apples.size(); i++) {

			// ((Apple)apples.get(i)).id(); //������Orange�࣬����ת��Apple����

			// apples.get(i).id(); // ������
		}

		apples.add(1.0); // �Զ�װ��
		double db = (double) apples.get(3);// �Զ�����
		System.out.println(db);
		// foreach
		// for (Apple p : apples) {
		// p.id();
		// }

	}

}