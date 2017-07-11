/*
 * 1 重写接口的方法要注意是public才行 ,接口方法隐式是public
 * 2 接口继承接口不用重写父接口的方法
 * 3 接口之间不可以 implements
 * 4 向上转型会丢失子类的扩展方法，也适用不了implements其他接口的方法
 * 5 interface中的方法默认都是public,实现类在重写方法的时候要明确用public修饰-
 * 但是重写抽象类中的抽象方法不用修饰public；
 * 
 * */
interface History{
	void u();
	void v();
}
interface Exam {
	void w();
	void x();
}
interface Labs{
	void y();
	void z();
}
interface Workup extends History,Exam,Labs{
	void zz();
}
abstract class Doctor{
	private int i = 0;
	abstract void doc();
}
class Anesthesiologist extends Doctor implements Workup{
	private int j = 0;
	public void zz(){};
	public void u(){};
	public void v(){};
	public void w(){};
	public void x(){};
	public void y(){};
	public void z(){};
	void doc(){};      // 5
	
	
}


public class Ex14 {   
		public static void m1(History h){} // 4
		public static void m2(Exam e){}
		public static void m3(Labs l){}
		public static void m4(Workup w){}
		Anesthesiologist a1 = new Anesthesiologist(); //对象成员
		
	public static void main(String[] args)  { //执行的开始
		Anesthesiologist a2 = new Anesthesiologist(); //局部
		m1(a2);
	}
}