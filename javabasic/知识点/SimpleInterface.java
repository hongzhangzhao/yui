/*
	�ӿ��еķ�������Ĭ��public abstract��-
		@����ʵ������д�ӿ��еķ�����ʱ��Ҫ���� public�ſ���

	@@������ʵ�ֽӿڲ���д���󷽷����԰�����ͨ����д�ӿڵķ���
	
	@@@������ͽӿڲ�һ���������ɹ��췽���ģ�������ͨ��̳������������-
		Ҫ�����super();���������ǳ��������¶����˴������Ĺ��캯����ԭ�е�-
		���캯����û���ˣ����ʱ������Ҫ���幹�캯���ſ��ԣ���Ȼ�ͱ����ˡ�

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