class Poppet {

}

public class BlankFinal {

	int a;

	final int i = 0;

	final int j;//staticҪ��������ʱ��͸�ֵ

	final Poppet p;//���������ʱ�򲻸�ֵ��������ڹ��췽���и�ֵ

	BlankFinal() {
		System.out.println("BlankFinal()" + a);
		//System.out.println("BlankFinal()" + j);//final��ֵ����ʹ��
		System.out.println("BlankFinal()" + i);
		j = 1;
		// j = 2;
		p = new Poppet();

	}

	BlankFinal(int x) {
		j = x;
		p = new Poppet();

	}

	/*
	 * final int a;//ֻ��ͨ�����췽����ֵ
	 * 
	 * void init() {//����ͨ��һ�㷽����final��ֵ
	 * 
	 * a = 9; }
	 */
	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();

	}
}