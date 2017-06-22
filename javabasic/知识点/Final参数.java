class Gizmo {
	public void spin() {
		System.out.println("Gizmo.spin");
	}

}

public class FinalArguments {
	void with(final Gizmo g) {//这参数不能传null，可以传递不同的参数，
		// g= new Gizmo();    //但是g的作用域里面不可以重新指向对象
		g.spin();
	}

	void without(Gizmo g) { //这参数可以传null
		g = new Gizmo();	//与上面相比可以重新指向对象，应为不是final
		g.spin();
	}

	// void f(final int i){ i++; }//错误，final类型的变量不能变化
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