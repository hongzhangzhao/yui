/*
	1.��һ���ⲿ���д���һ���ڲ���Ķ����������-
	�൱�������ĳ�Ա�������Աֻ��ͨ���ⲿ���-
	����ȥʹ������ڲ����Ա���ڵ�������ڲ����еķ�����

	2.�������ⲿ����ֱ��ʹ���ڲ����������ڲ����Ա-
	Ҫ���ⲿ����ڲ����ã���������������Ҫ�õ��ⲿ���-
	����ȥ�����������������ͨ���������ȥ�����ڲ����еĳ�Ա��



*/


public class Parcel1 {

 class Contents {
		private int i = 11;

		public int value() {
			return 1;

		}

	}

	 Contents con = new Contents();


	int tents() {
		return con.value();
	}


	class Destination {
		private String label;

		Destination (String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}

	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());

	}
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tanzania");
		System.out.println(p.tents());
		System.out.println();
		System.out.println(p.con.value());
		
		
	}

}