/*
	java���Զ�ʵ�֣����ǲ��ܶ�̳�
	
	����ʵ����һ���ӿڣ�����ͨ���̳�һ���࣬�ø���ķ�����
	ȥ���ǽӿ��еķ�����
	�ӿ����ͺ͸����ͳ��ֵĵط������඼�ܳ��֡�
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