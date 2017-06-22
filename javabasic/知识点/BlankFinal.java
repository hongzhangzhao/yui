class Poppet {

}

public class BlankFinal {

	int a;

	final int i = 0;

	final int j;//static要在声明的时候就赋值

	final Poppet p;//如果声明的时候不赋值，则必须在构造方法中赋值

	BlankFinal() {
		System.out.println("BlankFinal()" + a);
		//System.out.println("BlankFinal()" + j);//final赋值才能使用
		System.out.println("BlankFinal()" + i);
		j = 1;
		// j = 2;
		p = new Poppet();

	}

	BlankFinal(int x) {
		j = x;
		p = new Poppet();

	}

	/*
	 * final int a;//只能通过构造方法赋值
	 * 
	 * void init() {//不能通过一般方法给final赋值
	 * 
	 * a = 9; }
	 */
	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();

	}
}