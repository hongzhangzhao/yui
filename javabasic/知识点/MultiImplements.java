
/*
	�þ���Ļ������࣬�ڲ����ǲ���������ʵ�ּ̳С�Ч����Ψһ������
	
	һ��������û�б��κ������̳�-һ����ͨ��ķ����ط������������Ķ���-
	return new D(){};
*/

class C5 {
}

abstract class D {
	int i =10 ;
}

class Z extends C5 {
	D makeD() {

		return 	new D()	{ };


	}
}

public class MultiImplements {
	static void takesC(C5 c) {
	}

	static D takesD(D d) {
		return d;
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesC(z);
		D d1 = takesD(z.makeD());
		System.out.println(d1.i);
	}
}