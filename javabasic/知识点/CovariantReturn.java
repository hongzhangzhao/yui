/*
    "协变返回类型"
    在子类中的被覆盖方法可以返回父类方法的返回类型的某种子类型？这句话能更饶舌点吗？
    :一个父类，一个子类，子类重写了父类的方法，但是在父类中这个方法的返回类型是A类型,
    子类中的方法返回的类型是B类型，只要B是A的子类就满足覆盖条件，
    这种特性在1.5之前是不支持的。

*/

class Grain {
	public String toString() {
		return "Grain";
	}
}
class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}
class Mill {
	Grain process() {
		return new Grain();
	}
}
class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();//
		System.out.println(g);
		m = new WheatMill();
		g= m.process();


	}

}
