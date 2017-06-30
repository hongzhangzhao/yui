/*
	- 一个方法的参数Object类型，这个参数就可以传任何类型的对象进来，
	- 之后可以在方法体内再把对象的类型转回原有的类型。
	- 集合中添加的都是对象，可以获取里面的对象调用自己的方法
*/


import java.util.ArrayList;

 class Mouse {

	private int mouseNumber;

	Mouse(int i) {
		mouseNumber = i;
	}


	public String toString() {
		return "This is Mouse #" + mouseNumber;
	}

	public int getNumber() {
		return mouseNumber;
	}
}


class MouseTrap {
    static void caughtYa(Object m) {
        Mouse mouse = (Mouse) m; 
        System.out.println("Mouse: " + mouse.getNumber());
    }
}

public class WorksAnyway {
    public static void main(String[] args) {
		//创建一个集合，
        ArrayList<Mouse> mice = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
			//为集合添加元素
            mice.add(new Mouse(i));
        }
		//size()返回集合大小
        for (int i = 0; i < mice.size(); i++) {
            //get() 获取集合中的元素
            System.out.println("Free mouse: " + mice.get(i));
            MouseTrap.caughtYa(mice.get(i));
        }
    }
}