import java.util.*;

public class Test {

    public static void main(String[] args) {

        String s1 = "987654321";

        /*
        ��������ǰ��ַ����е�û��Ԫ����ȡ������
        ����ÿ��Ԫ��ת��char,
        �ٰ�û��ת��char��Ԫ�ذ�˳��浽һ��char���͵������С�
        */
        char[] ca = s1.toCharArray();
		
		String s2 = Arrays.toString(ca);//�������е�Ԫ��ת����String==[,,,,]
		
		for(char c1:ca) {   //����ca�����е�ÿ��Ԫ�أ�����ÿ��Ԫ�ظ���c1

            System.out.print(c1);  //��ӡca�����е�ÿ��Ԫ��

        }
		
		Arrays.sort(ca); //���Ը������е�Ԫ�ؽ��д�С���������
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		for (String s1 : list) { //���������ÿ��Ԫ��

			System.out.println(s1);
		}
		Object[] obj = list.toArray(); //������ת��������

		for (Object x : obj) {		
			System.out.println(x.toString());

		}
		
		int[][] arr={{1,2},{3,4}};
		
		for(int[] x : arr){
			for(int y : x){
				
				System.out.println(y);
				
			}
			
		}
    }



}