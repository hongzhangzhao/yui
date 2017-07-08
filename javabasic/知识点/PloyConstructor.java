/*
    多态就就是动态绑定
    构造器内部的动态绑定的行为
    1,在构造对象的时候，构造方法内部调用函数，也会动态绑定，
    由于初始化顺序的原因，会导致结果有一定的偏差
	2，最好不要在构造方法中调用被子类覆盖的方法，final和private(默认final)方法则没有问题

*/

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw(); //绑定到子类的draw()里面的radius变量还没有进行初始化，取的默认值
		System.out.println("Glyph() after draw()");
	}

}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius =  r;
		System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);

	}
	void draw() {
		System.out.println("RoundGlyph.draw(),radius="+radius);
	}
}

public class PloyConstructor {

	public static void main(String[] args) {

		new RoundGlyph(5);
	}

}