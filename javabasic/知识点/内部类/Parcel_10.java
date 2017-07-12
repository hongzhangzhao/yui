/* 实例初始化？
   实例初始化方法是构造方法；
   实例初始化需要构造方法类创建实体对象的引用
   匿名内部类没有构造方法，它只有用构造块来进行初始化
 *
 */

interface Destination1 {
	String readLabel();
}


public class Ex_7 {
	public Destination des(final String s, final int i) {//这个就像构造器的参数列表
		return new Destination() {
			private int x;

			{
				x = i;  //代码块中初始化字段
				if (i < 100) { // 不能作为字段初始化的一部分？
					//  i++; 报错
					System.out.println("OK");
				}

			}
			// 构造块不存在重载，就像是定义了两个字段
			{
				System.out.println("why");
			}

			private String qubie = s; //直接通过参数初始化字段

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
