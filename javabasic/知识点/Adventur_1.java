/*
 * 1,一个子类不要求必须有个父类(抽象的or具体的)
 * 2,一个类实现了多个接口，可以任意向上转型，###
 * 3,子类中没有实现fight()，继承来自父类的fight()使创建对象成为可能
 * 4,必须先继承后实现
 * 5，使用接口，防止创建该类对象 ###
 * 6，变量没有动态绑定
 * 7，向上抽取首选“接口”
 * 8,接口之间可以多继承 interface a extends b,c,d { }
 * */

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
	} // 3
}

class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight {// 4
	public void swim() {		
	}

	public void fly() {
	}
	// 3
}

public class Adventur_1 {
	public static void t(CanFight x) {
		x.fight();
	}

	public static void s(CanSwim x) {
		x.swim();
	}

	public static void f(CanFly x) {
		x.fly();
	}

	public static void a(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero h = new Hero();

	}
}
