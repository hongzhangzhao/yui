package Arrays;
/*
 * 16.5  数组与泛型
 * 
 * 
 * */
public class ArrayOfGenericType<T> {
	//不能创建泛型数组
	T[] array;
	
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size){
		// array = new T[size];  :illegal
		array = (T[])new Object[size]; //cheched warning
		
		/*  illegal:
		public <U> U[] makeArray(){
			return new U[10];
		}
		*/
	}
}
