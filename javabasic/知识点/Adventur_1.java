/*
 * 1,һ�����಻Ҫ������и�����(�����or�����)
 * 2,һ����ʵ���˶���ӿڣ�������������ת�ͣ�###
 * 3,������û��ʵ��fight()���̳����Ը����fight()ʹ���������Ϊ����
 * 4,�����ȼ̳к�ʵ��
 * 5��ʹ�ýӿڣ���ֹ����������� ###
 * 6������û�ж�̬��
 * 7�����ϳ�ȡ��ѡ���ӿڡ�
 * 8,�ӿ�֮����Զ�̳� interface a extends b,c,d { }
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
