/*
	1.在一个外部类中创建一个内部类的对象，这个对象-
	相当于这个类的成员，这个成员只能通过外部类的-
	对象去使用这个内部类成员，在调用这个内部类中的方法。

	2.不能在外部类中直接使用内部类对象调用内部类成员-
	要在外部类的内部调用，最后这个方法还是要用到外部类的-
	对象去调用这个方法，才能通过这个方法去调用内部类中的成员。



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