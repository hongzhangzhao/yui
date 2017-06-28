/*
	嵌套类可以访问它们嵌套在其中的所有级别的所有成员-
	即使外部类的成员是private的也可以访问
	
	
	要new内部类的对象 要先new出外部类的对象，再用外部类的对象点内部类对象-
	
	内部类可以访问外部类的成员，但是内部类的对象不能直接访问外部类的成员和方法；
	
	如果内部类和外部类的方法重名，想要调用外部类的方法怎么做？
	
	
*/


class MNA {
	int chengyuan = 100;
private void f(){
	System.out.println("f()");
}

class A {
	
	int chengyuan = 200;
	//A类调用MNA类的变量
	int cheng = MNA.this.chengyuan;
private void g(){
	System.out.println("g()");
}

public class B {
	//类B调用MNA的变量
	//如果外部变量是静态的，可以直接类名.变量名
	int yuan = MNA.this.chengyuan;
	
	//类B调用A类的变量
	int daole = MNA.A.this.chengyuan;
public void gg(){
	g();
}
public void ff(){
	f();
}

public void g(){
	System.out.println("B de g");
}
void h(){  //没有public也可以访问外部类的私有成员
	//方法也是一样，如果和外部类的方法重名就用所使用的外部类名.this的方法
	A.this.g();
	f();
}
}
}
}

public class MultiNestingAccess{
	
public static void main(String[] args){
	
	MNA mna =new MNA();

	MNA.A aa =mna.new A();
	
	MNA.A.B bb = aa.new B();
	
	MNA.A.B bb1 = new MNA().new A().new B();
	
	bb.gg();
	System.out.println(aa.cheng);
	System.out.println(bb.yuan);
	bb.ff();
	bb.h();
}
	
}

/*
	MNA mna =new MNA();

	MNA.A aa =mna.new A();
	
	MNA.A.B bb = aa.new B();
	
	MNA.A.B bb1 = new MNA().new A().new B();
*/