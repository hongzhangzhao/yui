/* ʵ����ʼ����
   ʵ����ʼ�������ǹ��췽����
   ʵ����ʼ����Ҫ���췽���ഴ��ʵ����������
   �����ڲ���û�й��췽������ֻ���ù���������г�ʼ��
 *
 */

interface Destination1 {
	String readLabel();
}


public class Ex_7 {
	public Destination des(final String s, final int i) {//������������Ĳ����б�
		return new Destination() {
			private int x;

			{
				x = i;  //������г�ʼ���ֶ�
				if (i < 100) { // ������Ϊ�ֶγ�ʼ����һ���֣�
					//  i++; ����
					System.out.println("OK");
				}

			}
			// ����鲻�������أ������Ƕ����������ֶ�
			{
				System.out.println("why");
			}

			private String qubie = s; //ֱ��ͨ��������ʼ���ֶ�

			public String readLabel() {
				return qubie;
			}


		};


	}


	public static void main(String[] args) {
		Ex_7 ee = new Ex_7();
		ee.des("hongz",30);

	}
}
