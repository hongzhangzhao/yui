package typeinfo.pets;
/*
 * 
 *   1111111111111
 * 
 * 
 * */

import java.util.*;

public abstract class PetCreator {
	private Random rand = new Random(47);

	public abstract List<Class<? extends Pet>> types(); //

	public Pet randomPet() {
		int n = rand.nextInt(types().size()); // 随机获取List索引
		try {
			return types().get(n).newInstance(); // 获取Class类型类，创建对应类型的实例
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}//

	public Pet[] createArray(int size) { // method参数定义数组大小
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++) // 随机产生的Pet宠物存到数组中
			result[i] = randomPet();
		return result;
	}//

	public ArrayList<Pet> arrayList(int size) { // 参数定义宠物数组大小
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size)); // 调用 宠物数组方法
		return result;
	}//
}
