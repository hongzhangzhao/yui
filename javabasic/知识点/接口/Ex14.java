/*
 * 1 ��д�ӿڵķ���Ҫע����public���� ,�ӿڷ�����ʽ��public
 * 2 �ӿڼ̳нӿڲ�����д���ӿڵķ���
 * 3 �ӿ�֮�䲻���� implements
 * 4 ����ת�ͻᶪʧ�������չ������Ҳ���ò���implements�����ӿڵķ���
 * 5 interface�еķ���Ĭ�϶���public,ʵ��������д������ʱ��Ҫ��ȷ��public����-
 * ������д�������еĳ��󷽷���������public��
 * 
 * */
interface History{
	void u();
	void v();
}
interface Exam {
	void w();
	void x();
}
interface Labs{
	void y();
	void z();
}
interface Workup extends History,Exam,Labs{
	void zz();
}
abstract class Doctor{
	private int i = 0;
	abstract void doc();
}
class Anesthesiologist extends Doctor implements Workup{
	private int j = 0;
	public void zz(){};
	public void u(){};
	public void v(){};
	public void w(){};
	public void x(){};
	public void y(){};
	public void z(){};
	void doc(){};      // 5
	
	
}


public class Ex14 {   
		public static void m1(History h){} // 4
		public static void m2(Exam e){}
		public static void m3(Labs l){}
		public static void m4(Workup w){}
		Anesthesiologist a1 = new Anesthesiologist(); //�����Ա
		
	public static void main(String[] args)  { //ִ�еĿ�ʼ
		Anesthesiologist a2 = new Anesthesiologist(); //�ֲ�
		m1(a2);
	}
}