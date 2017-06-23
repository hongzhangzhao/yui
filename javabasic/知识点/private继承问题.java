class demo1 {

	private int x=1 ;

	public int getX() {

		return x;
	}

}

public class demoGod extends demo1 {

	//private int x=2;
	private int y =3;

	public int get() { //父类的private变量只能通过父类的public方法才能访问
//即使子类方法中使用super也访问不到private
//private 只属于父类，

		return super.x;
	}

}
class Main {
	public static void main(String[]args) {
		demoGod de=new demoGod();
		System.out.println(de.get());
		//de.y=10;
		System.out.println(de.getX());
	}
}