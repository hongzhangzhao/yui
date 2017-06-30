/*
	- һ�������Ĳ���Object���ͣ���������Ϳ��Դ��κ����͵Ķ��������
	- ֮������ڷ��������ٰѶ��������ת��ԭ�е����͡�
	- ��������ӵĶ��Ƕ��󣬿��Ի�ȡ����Ķ�������Լ��ķ���
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
		//����һ�����ϣ�
        ArrayList<Mouse> mice = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
			//Ϊ�������Ԫ��
            mice.add(new Mouse(i));
        }
		//size()���ؼ��ϴ�С
        for (int i = 0; i < mice.size(); i++) {
            //get() ��ȡ�����е�Ԫ��
            System.out.println("Free mouse: " + mice.get(i));
            MouseTrap.caughtYa(mice.get(i));
        }
    }
}