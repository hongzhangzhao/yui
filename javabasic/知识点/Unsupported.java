
/*
	- ֱ�Ӵ�ӡ List���󣬿�����ʾ�б��е�Ԫ������
	- next() ��ת��ָ���λ��

	- remove()�������ɾ��Ԫ�ؿ�ʹ�õķ���hasNext(),hasPrevious();

	- һ�����е�˽�б������������еĶ�������������У�ʹ�÷������Ե���������е�˽�б�����

	-
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Unsupported {

	private static String[] s = {"1","2","3","4","5","6","7","8"};


	//ֻ�ܴ��ݶ���������,�Ҹо��ô�����List����ʹ��add����һ�������Ԫ����
	static List<String> list1 = Arrays.asList(s);

	//��ȡ�б��е�����Ԫ�ص�������Ԫ�أ���ȥ������Ԫ��
	static List<String> list2 = list1.subList(3,6);

	public static void main(String[] args) {

		System.out.println(list1);
		System.out.println(list2);


		//���������ֻ����ʹ����List,ArrayList,linkedList
		//��������������ǰ�ָ����뵽ָ����Ԫ��λ�ã�ԭ�е�Ԫ�����˳��
		ListIterator li1 = list1.listIterator(list1.size());

		while(li1.hasPrevious()) {

			System.out.print(li1.previous());

		}

		ArrayList<String> al1 =new ArrayList<>();

		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add("d");

		System.out.println(al1);

		ListIterator lister =al1.listIterator();
		//����ָ��������
		String s1 = (String)lister.next();
		System.out.println(s1);

		//add()��ָ��ǰ�����Ԫ��
		lister.add("x");

		System.out.println(al1);

		//����ָ����ǰ��
		lister.previous();
		lister.previous();
		lister.add("k");

		System.out.println(al1);
		lister.previous();
		while (lister.hasNext()) {
			System.out.print(lister.next());

		}


	}
}

