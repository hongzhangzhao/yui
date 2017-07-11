/*
	数组的返回

*/


public class IceCream {

	static String[] flav = { "a", "b", "c", "d", "e" };

	static int flavorSet(int n) {
		n = Math.abs(n) % (flav.length + 1);

//		String[] results = new String[n];
//		boolean[] picked = new boolean[flav.length];
//
//		for (int i = 0; i < n; i++) {
//			int t;
//			do {
//				t = (int) (Math.random() * flav.length);
//				System.out.println(t);
//			} while (picked[t]);
//			System.out.println(i);
//			results[i] = flav[t];
//
//			picked[t] = true;
//
//		}
		return n;

	}

	public static void main(String[] args) {

		 int i = flavorSet(100);//对应上面的方法，不管输入什么数字数组都不会越界
		 System.out.println(i);

//		for (int i = 0; i < 20; i++) {
//			System.out.println("flavorSet(" + i + ")=");
//			String[] fl = flavorSet(flav.length);
//			for (int j = 0; j < fl.length; j++) {
//				System.out.println("\t" + fl[j]);
//			}
//		}

	}
}