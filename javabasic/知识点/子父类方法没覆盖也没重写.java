/*
	子类的play()没有覆盖父类的，
	但是这两个方法参数类型也是一样的，
	也不符合重载的条件，所以编译会出错。
*/

class Animal {
	void play() {
		System.out.println("InstrumentX.play()");
	}
}
class Cat extends Animal {
	int play() {
		System.out.println("WindX.play(NoteX n)");
		
	}
}
public class WindError2 {
	public static void tune(Animal a) {
		a.play();
	}
}