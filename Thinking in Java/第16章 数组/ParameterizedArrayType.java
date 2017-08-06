package Arrays;

/*
 * 16.5 �����뷺��
 * 
 * */
class ClassParameter<T> {
	//�������뷺�ͻ����飺
	public T[] f(T[] arg) {
		return arg;
	}
}

class MethodParameter {
	//���ͷ����뷺�ͻ����飺
	static <T> T[] f(T[] arg) {
		return arg;
	}
}

public class ParameterizedArrayType<T> {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };

		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		Integer[] ints2 = new ClassParameter<Integer>().f(ints);

		Double[] doubles2 = new ClassParameter<Double>().f(doubles);

		ints2 = MethodParameter.f(ints);

		doubles2 = MethodParameter.f(doubles);
	}

}
