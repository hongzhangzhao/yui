
/*
  @SuppressWarnings("unchecked")


*/
class Test<T>{
	 T element;
	 public void set(T element){
		 this.element = element;
	 }
	 public T get(){
		 return element;
	 }
 }
 
 class Test1<T> extends Test<T>{}
 class Test2 extends Test{}


public class Demo11 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		Object obj= t2.get();
		t2.set(obj);
	}
}
