/*
	�����ʵ�ֶ���ӿڵ����ַ���
	
	�����ڲ������һ�������ź�߼ӵķֺ�- {};
	
	ʹ�������ڲ������̳�һ�������ʵ��һ���ӿڣ�
*/

interface A3 {

}

interface B {
void pp();
	

}

class X implements A3,B {
public void pp(){
	System.out.println("X");
}
}


class Y implements A3 {
	B makeB() {
		return new B() { public void pp(){System.out.println("B");}};
	}
}

public class MultiInterface {

	static void takesA(A3 a) {
		
	}

	static void takesB(B b) {

	}

}

/*
	X x = new X();
		Y y = new Y();
		
		MultiInterface.takesA(x);
		MultiInterface.takesA(y);
		MultiInterface.takesB(x);
		MultiInterface.takesB(y.makeB());
*/