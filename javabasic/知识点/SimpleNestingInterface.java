/*
	һ���ӿ��е��ڲ��࣬�ڽӿ��ж����������Ķ���-
	��ʱ��������������ӿڵı����ˣ����ӿڵı�������-
	public static final ���͵ģ����������ٸ�ֵ�� @	
	
	�ӿ�Ҳ��һ�����������ϵġ��ࡱ��������ĳ�Ա����ֱ��ͨ��-
	���ӿ��������е��á� @@
	
	
	�ӿ��е��ڲ�����������������д����Ķ������������-
	�Ͳ����ڽӿڵĳ�Ա������Ҳ�Ϳ������¸��������ֵ @@@
	
	����ڲ����� static�� �����������Ϳ����� new W.N(),��������
	������ǣ�ֻ�� new w().new N(),���ⲿ��Ķ���ȥ�����ڲ���Ķ���
	
*/


interface A {
	interface B {
	}
}

class C {
	interface D {
	}

	class H implements D {
		public void h() {
			System.out.println("H");
		}
	}
}

interface E {
	class F {
		static void print() {
			System.out.println("E.F.print()");
		}
	}

	F f = new F();
	
	
	E.F eef = new E.F();
	
	
	class G extends F {
	}
}

public class SimpleNestingInterface {

	public static void main(String[] args) {
		
		
		E.f.print();  // @@
		//E.f = new E.F(); //���� @
		
		E.eef.print();
		
		//E.eef = new  E.F();//not

		E.F etRoot = new E.F();//@@@
		
		etRoot = new E.F();//@@@
		
		etRoot.print();
		
		
	}
}