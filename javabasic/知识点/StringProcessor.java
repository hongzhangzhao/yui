/*
 * ~ 使用组合会增加耦合度？
 * ~ 耦合度是两个事物相互依赖的一个量度，降低耦合度会使程序代码更易于修改，
 * ~ 策略设计模式？
 * ~ 适配器设计模式？
 * ~ 接口中可以定义static方法，但是必须有具体实现;
 * ~ 接口是一种标准，标准，标准，是一种统一的协议，属性也是协议，
 *   公共的 唯一的 不可修改。
 * ~ 同样的接口和抽象类中也可以定义main方法
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