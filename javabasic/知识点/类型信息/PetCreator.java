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
		int n = rand.nextInt(types().size()); // �����ȡList����
		try {
			return types().get(n).newInstance(); // ��ȡClass�����࣬������Ӧ���͵�ʵ��
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}//

	public Pet[] createArray(int size) { // method�������������С
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++) // ���������Pet����浽������
			result[i] = randomPet();
		return result;
	}//

	public ArrayList<Pet> arrayList(int size) { // ����������������С
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size)); // ���� �������鷽��
		return result;
	}//
}
