/*
	1,�����͸�ֵ�������ͣ����������ֻ��ʹ���Լ��ķ�����
	����ʹ���������¶���ķ�������ʹʹ�����Լ��ķ�����
	�����������������͸����ˣ�ʹ�õ���ʵ�������Եķ�����
	��û�ж�̬�󶨵�ʱ�򣬸�����ʹ�ñ����า�ǵķ�����
	ʹ�õ��Ǹ����͵ķ�����
	2,˽�й��췽��ֻ�����Լ�����newһ������
		�������������д��������Ķ���
	3,һ����������кܶ�����࣬��Щ������Զ���ֵ�����࣬������ڸ���
	��ȡ��������д�ķ�ʽʱ���ͻ��ȡ��������ķ�����
	
*/

class Note {
	private int value;

	private  Note(int val) {

		value = val;
	}
	public boolean equals(Object obj) {

		if(this == obj) {
			System.out.println("this ==obj");
			return true;
		}
		if(!super.equals(obj)) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final Note other = (Note) obj;

		if(value != other.value) {
			return false;
		}
		return true;
	}

	public static final Note MIDDLE_C = new Note(0);
	public static final Note C_SHARP = new Note(1);
	public static final Note B_FLAT = new Note(2);
}
class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}
class Wind extends Instrument {
	public void play(Note n) {
		if(n.equals(Note.MIDDLE_C)) {
			System.out.println("Wind.play(middle)");//���
		} else if(n.equals(Note.B_FLAT)) {
			System.out.println("Wind.play(flat)");
		} else if(n.equals(Note.C_SHARP)) {
			System.out.println("Wind.play(sharp)");

		} else {
			System.out.println("Wind.play()");
		}
	}
}
public class Music {
	public static void tune(Instrument i) {
		//i ���õ��������play��������Ϊ������д�˸���play����
		//play�������洫��Note���һ��Note���͵�ȫ��Ψһ�ĳ���
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind ww = new Wind(); 
		/*��Wind���ʹ�����Insetrument���͵Ĳ���ӦΪ��Wind�ĸ��࣬��ν������ת��*/
		tune(ww); 
	}
}
