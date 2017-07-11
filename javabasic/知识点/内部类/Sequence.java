/*
	����һϵ�ж���

	
	�ڲ���ʵ��һ�������Լ��ⲿ��� �ⲿ�ӿ�-
	
	@ �ڲ����ʵ����ֵ�������Լ��ⲿ��� �ⲿ�ӿ�����
	
	@@���ʱ������ӿ����;Ϳ���ֱ��ȥ�����ڲ�����д����ӿڵķ���-
	  �����Բ���ͨ���ⲿ��Ķ���ȥ�����ڲ���Ķ���ȥ��ɷ����ĵ��á�
*/


interface Selector {

	boolean end();

	Object current();

	void next();
}

public class Sequence {

	private Object[] obs;

	private int next = 0;

	//�� obs ��ʼ��Ԫ�ظ���
	public Sequence(int size) {
		obs = new Object[size];
	}

	//��ÿ�� obsԪ�� ��ֵ
	public void add(Object x) {
		if (next < obs.length) {
			obs[next] = x;
			next++;
		}
	}

	private class SSelector implements Selector {
		int i = 0;

		//�ж������Ƿ�Ϊ 0
		public boolean end() {
			return i == obs.length;
		}

		//���� obs Ԫ���о����ֵ
		public Object current() {
			return obs[i];
		}

		//
		public void next() {
			if (i < obs.length)
				i++;
		}
	}

	//����SSelector�ĸ�����Selector
	public Selector getSelector() {
		return new SSelector();
	}

	public static void main(String[] args) {
		
		//�����ⲿ�����
		Sequence s = new Sequence(10);
		
		//
		for (int i = 0; i < 10; i++) {
			s.add(Integer.toString(i)); //s.add(new Integer(i));
		}
		
		//@
		Selector sl = s.getSelector();
		
		//@@
		while (!sl.end()) {
			
			System.out.println(sl.current());
			sl.next();
		}
	}
}