/*
	接口中的方法都是默认public abstract的-
		@所以实现类重写接口中的方法的时候要定义 public才可以

	@@抽象类实现接口并重写抽象方法可以帮助普通类重写接口的方法
	
	@@@抽象类和接口不一样，它是由构造方法的，所以普通类继承了这个抽象类-
		要定义好super();下面的情况是抽象类重新定义了带参数的构造函数，原有的-
		构造函数就没有了，这个时候子类要定义构造函数才可以，不然就报错了。

*/


interface Person {
	String getName();

	int getAge();

	void setName(String s);
}


abstract class Kris implements Person {

	String name;
	int age;

	Kris(String name, int age) { //@@@
		this.name = name;
		this.age = age;
	}
	
	int getAge() {  //@
		return age;
	}

	void setName(String s) { //@
		this.name = s;
	}
}

class HaoShuang extends Kris {  
	String getName() {  //@;@@
		return "i am HaoShuang";
	}
}