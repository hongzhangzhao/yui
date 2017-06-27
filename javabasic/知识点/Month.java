
/*
	final 类不能被继承
	
*/


public final class Month {

	private String name;

	private Month(String nm) {
		 name = nm;
	}
	public String toString() {
		return name;
	}
	public final static Month
	jan = new Month("jan"),feb = new Month("feb"),
	mar = new Month("mar");

	public final static Month[] month = {
		jan,feb,mar
	};

	public static void main(String[] args){
		Month m = Month.jan;
		System.out.println(m);
		m=Month.month[0];
		System.out.println(m);
	}
}