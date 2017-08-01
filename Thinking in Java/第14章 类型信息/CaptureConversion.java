package Generic;

public class CaptureConversion {
	static <T> void f1(Holder<T> holder){
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
		
	}
	static void f2(Holder<?> holder){
		f1(holder);
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		System.out.println("1");
		Holder raw = new Holder<Integer>(1);
		System.out.println("2");
		f2(raw);
		System.out.println("3");
		Holder rawBasic = new Holder();
		System.out.println("4");
		//rawBasic.set(new Object());
		
		f2(rawBasic);
		System.out.println("5");
		Holder<?> wildcarded = new Holder<Double>(1.0);
		System.out.println("6");
		f2(wildcarded);
		System.out.println("7");
	}
	
}
