/*
	java可以多实现，但是不能多继承
	
	子类实现了一个接口，可以通过继承一个类，用父类的方法，
	去覆盖接口中的方法，
	接口类型和父类型出现的地方，子类都能出现。
*/

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {

	void fly();
}
class ActionCharacter {
	public void fight() {
		System.out.println("fight");
	}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly {
	public void swim() {
		System.out.println("swim");
	}
	public void fly() {
		System.out.println("fly");
	}
}
public class Adventure {
	static void t(CanFight x) {
		x.fight();
	}
	static void u(CanSwim x) {
		x.swim();
	}
	static void v(CanFly x) {
		x.fly();
	}
	static void w(ActionCharacter x) {
		x.fight();
	}
}