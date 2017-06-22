class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin");
	}

}

public class FinalArguments {
	void with(final Gizmo g) {//��������ܴ�null�����Դ��ݲ�ͬ�Ĳ�����
		// g= new Gizmo();    //����g�����������治��������ָ�����
		g.spin();
	}

	void without(Gizmo g) { //��������Դ�null
		g = new Gizmo();	//��������ȿ�������ָ�����ӦΪ����final
		g.spin();
	}

	// void f(final int i){ i++; }//����final���͵ı������ܱ仯
	void f(final int i) {
		System.out.println(i);
	}

	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(new Gizmo());
		bf.with(new Gizmo());
		Gizmo g1 = new Gizmo();
		bf.with(g1);
		bf.with(g1);
		bf.f(100);
		bf.f(200);
		bf.with(null);

	}
}