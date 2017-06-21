/*
	final对象的引用不能重新指定其他的对象，
	但是对象中的数据可以修改。
*/

final class Test { 
	/*
		final类不可以被继承，
		所有的方法都默认为final,因为无法覆盖它们
	*/
	

}

class TestOne {

    final void method() { //不可以被子类重写
	
	private final void function(){ 

	}
	/*
		private方法默认带final，加与不加效果一样
	*/
	private void function_1(){
		
	}
		
    }
}


public class A extends TestOne {
	
	public final void function(){
		
	} 
	/*
		由于TestOne中的private方法不能被继承，
		所以A类中的function和function_1是重新定义的，不是覆盖。
	*/
	public void function_1(){
		
		
	}
	
    void method() { //这个方法是父类的final方法，重写不了

        System.out.print("final的方法能被继承，但不能被子类重写");
    }

    final int a = 1 ;

    final int b = (int)(Math.random() * 20);

    final int c = (int)(Math.random() * 20);

    final int[] xbox = {1,2,3,4,5};

    final Test test_1 = new Test();

    Test test_2 = new Test();

    public static void main(String[] args) {

        A a1 = new A();

        a1.test1=new Test(); //final了，不能重新指定对象
        a1.test2=new Test(); //没final,可以重新指定对象

        a1.xbox[0]=100;//数组是引用类型，不能重新指定，但可以修改里面元素的值

    }

}