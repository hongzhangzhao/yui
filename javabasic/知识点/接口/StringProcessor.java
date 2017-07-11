/*
 * ~ ʹ����ϻ�������϶ȣ�
 * ~ ��϶������������໥������һ�����ȣ�������϶Ȼ�ʹ�������������޸ģ�
 * ~ �������ģʽ��
 * ~ ���������ģʽ��
 * ~ �ӿ��п��Զ���static���������Ǳ����о���ʵ��;
 * ~ �ӿ���һ�ֱ�׼����׼����׼����һ��ͳһ��Э�飬����Ҳ��Э�飬
 *   ������ Ψһ�� �����޸ġ�
 * ~ ͬ���Ľӿںͳ�������Ҳ���Զ���main����
 *
 */
import java.util.*;

interface Processor {
	public String name();
	Object process(Object input);
	static void run() {}
	public static void main(String[] args) {}

}
class Apply {
	public static void process(Processor p,Object s) {
		System.out.println("Using Processor "+ p.name() );
		System.out.println(p.process(s));
	}
}

public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);
	public static String s=
	    "If she weighs the same as a duck, she's made of wood";

	public static void main(String[] args) {

	}
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}