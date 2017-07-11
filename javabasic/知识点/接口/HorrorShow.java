/*
	使用继承扩展接口

	接口继承接口，增加方法。
	接口间可以单继承也可以多继承:
		interface1 extends interface2;
		interface2 extends interface3;
		
		
		
		interface extends interface,interface
	接口只能包含 public static final 的成员
	但是变量一开始就必须要赋初值
	
	接口之间只能是是继承 extends 
	
	类和接口之间只能是 implements
	
	接口没有构造方法
	
	接口里面的方法都是 public abstract 
	
	不能有静态代码块
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