/*
	持有一系列对象

	
	内部类实现一个不是自己外部类的 外部接口-
	
	@ 内部类的实力赋值给不是自己外部类的 外部接口类型
	
	@@这个时候这个接口类型就可以直接去调用内部类重写这个接口的方法-
	  而可以不再通过外部类的对象去调用内部类的对象去完成方法的调用。
*/


interface Selector {

	boolean end();

	Object current();

	void next();
}

public class Sequence {

	private Object[] obs;

	private int next = 0;

	//给 obs 初始化元素个数
	public Sequence(int size) {
		obs = new Object[size];
	}

	//给每个 obs元素 赋值
	public void add(Object x) {
		if (next < obs.length) {
			obs[next] = x;
			next++;
		}
	}

	private class SSelector implements Selector {
		int i = 0;

		//判断数组是否为 0
		public boolean end() {
			return i == obs.length;
		}

		//返回 obs 元素中具体的值
		public Object current() {
			return obs[i];
		}

		//
		public void next() {
			if (i < obs.length)
				i++;
		}
	}

	//返回SSelector的父类型Selector
	public Selector getSelector() {
		return new SSelector();
	}

	public static void main(String[] args) {
		
		//建立外部类对象
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