/*
	Ƕ������Է�������Ƕ�������е����м�������г�Ա-
	��ʹ�ⲿ��ĳ�Ա��private��Ҳ���Է���
	
	
	Ҫnew�ڲ���Ķ��� Ҫ��new���ⲿ��Ķ��������ⲿ��Ķ�����ڲ������-
	
	�ڲ�����Է����ⲿ��ĳ�Ա�������ڲ���Ķ�����ֱ�ӷ����ⲿ��ĳ�Ա�ͷ�����
	
	����ڲ�����ⲿ��ķ�����������Ҫ�����ⲿ��ķ�����ô����
	
	
*/


class MNA {
	int chengyuan = 100;
private void f(){
	System.out.println("f()");
}

class A {
	
	int chengyuan = 200;
	//A�����MNA��ı���
	int cheng = MNA.this.chengyuan;
private void g(){
	System.out.println("g()");
}

public class B {
	//��B����MNA�ı���
	//����ⲿ�����Ǿ�̬�ģ�����ֱ������.������
	int yuan = MNA.this.chengyuan;
	
	//��B����A��ı���
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
void h(){  //û��publicҲ���Է����ⲿ���˽�г�Ա
	//����Ҳ��һ����������ⲿ��ķ�������������ʹ�õ��ⲿ����.this�ķ���
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