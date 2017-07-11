/*
	ʹ�ü̳���չ�ӿ�

	�ӿڼ̳нӿڣ����ӷ�����
	�ӿڼ���Ե��̳�Ҳ���Զ�̳�:
		interface1 extends interface2;
		interface2 extends interface3;
		
		
		
		interface extends interface,interface
	�ӿ�ֻ�ܰ��� public static final �ĳ�Ա
	���Ǳ���һ��ʼ�ͱ���Ҫ����ֵ
	
	�ӿ�֮��ֻ�����Ǽ̳� extends 
	
	��ͽӿ�֮��ֻ���� implements
	
	�ӿ�û�й��췽��
	
	�ӿ�����ķ������� public abstract 
	
	�����о�̬�����
*/

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {

	public void menace() {
		System.out.println("menace");
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
interface Vampire extends DangerousMonster,Lethal {
	void drinkBlood();
}

class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
}

/*
DragonZilla gsl = new DragonZilla();
		HorrorShow.u(gsl);
		HorrorShow.v(gsl);
*/