package Arrays;
/*
 * 16.5  �����뷺��
 * 
 * 
 * */
public class ArrayOfGenericType<T> {
	//���ܴ�����������
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
