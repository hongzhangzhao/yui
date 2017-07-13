/*
* �ڲ�����ϰ
*
*
* */

interface U {
    void f();

    void g();

    String toString();
} //һ���ӿڰ�����������

class A1 {
    U backU() {
        return new U() {
            public void f() {
            }

            public void g() {
            }

            public String toString() {
                return "i am u";
            }
        };
    }

}  //�����ڲ��෵�ض�U ������

class B1 {
    private U[] us; //����U��������

    B1(int i) {   //�������г�ʼ�������С
        us = new U[i];
    }

    void addU(U u, int i) {
        us[i] = u;
    } // ���Ԫ��

    void Unull(int i) {
        us[i] = null;
    } // ɾ��Ԫ��

    void testU() {
        for (U u : us) {
            u.f();
            u.g();
            u.toString();
        }
    } //foreach�������飬�����÷���

    void showUs() {
        for (U u : us) {
            if (u != null) System.out.println(u.toString());
            else System.out.println("I'm null");
        }
    }
}   // �ж�������Ԫ���Ƿ�Ϊ null

public class Ex23 {
    public static void main(String[] args) {
        A1 a0 = new A1();
        A1 a1 = new A1();
        A1 a2 = new A1();
        B1 b = new B1(3);
        b.addU(a0.backU(),0);
        b.addU(a1.backU(),1);
        b.addU(a1.backU(),2);
        b.showUs();
        b.Unull(0);
        b.showUs();

    }
}