/**
 * �ڲ������ʵ�ֶ�̳�
 *
 * ��ͨ��ֻ�ܵ��̳�
 *
 * ����ڲ������ʵ��ͬһ���ӿ�
 * ��ʵ�ֽӿ��з����Ĳ�ͬЧ��
 *
 *
 * �ڲ���û�� is-a �Ƕ���ʵ��
 *
 */

/*
interface Q {}
interface W {}

class X implements Q,W{}

class Y implements Q {
    W backW(){
        return new W(){};
    }
}

public class MInterface {
    static void takeQ(Q q){}
    static void takeW(W w){}

    public static void main(String[] args){
        takeQ(new X());
        takeQ(new Y());
        takeW(new X());
        takeW(new Y().backW());

    }
}

*/

class D{}
abstract class E{}
class Z extends D {
    E eback(){
        return new E(){};
    }
}


public class MInterface{
    static void takesD(D d){}
    static void takesE(E e){}
    public static void main(String[] args){
        takesD(new Z());
        takesE(new Z().eback());
    }
}