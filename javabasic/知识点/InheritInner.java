/*
	�ӿ��е��ڲ���

*/

interface IInterface {
	static class Inner{

		int i,j,k;

		public Inner() {

		}
		void f() {

		}
	}
}

/*
	�ڲ���ļ̳�

	�ڲ���Ķ�����ͨ���ⲿ��Ķ��󴴽�������

	new Wai().new Nei();

	һ����Ҫʵ�������󣬾���Ҫ���ø���Ĺ��캯����������������-
		һ���ڲ��࣬����Ҫ�ⲿ��Ķ���ȥ���������Ĺ��캯������-
		�����ɹ���
*/

class WithInner {
	class Inner {
		
		}
	}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
		
	}
}

/*
	 WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
*/

/*
	�ֲ���̬�ڲ���
*/

class AA {

	void print() {
		static class BB {

		}
	}
}