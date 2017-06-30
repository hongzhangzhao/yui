
/*
	- 直接打印 List对象，可以显示列表中的元素内容
	- next() 跳转了指针的位置

	- remove()这个方法删除元素看使用的方法hasNext(),hasPrevious();

	- 一个类中的私有变量，其他包中的对象定义在这个类中，使用方法可以调用这个类中的私有变量；

	-
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Unsupported {

	private static String[] s = {"1","2","3","4","5","6","7","8"};


	//只能传递对象类数组,我感觉好处在于List不用使用add方法一个个添加元素了
	static List<String> list1 = Arrays.asList(s);

	//截取列表中第三个元素到第六个元素，不去第六个元素
	static List<String> list2 = list1.subList(3,6);

	public static void main(String[] args) {

		System.out.println(list1);
		System.out.println(list2);


		//这个迭代器只可以使用在List,ArrayList,linkedList
		//索引定义的数字是把指针插入到指定的元素位置，原有的元素向后顺延
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
		//控制指针往后跳
		String s1 = (String)lister.next();
		System.out.println(s1);

		//add()往指针前面插入元素
		lister.add("x");

		System.out.println(al1);

		//控制指针往前跳
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

