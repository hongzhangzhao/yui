

class Shape {
	void draw() {
	}

	void erase() {
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle.draw()");
	}

	void erase() {
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Square.draw()");
	}

	void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle.draw()");
	}

	void erase() {
		System.out.println("Triangle.erase()");
	}
}




public class Shapes {
	public static Shape randShape() {
		switch ((int) (Math.random() * 3)) {


		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
/*			
		default不能去掉，因为随机数只有在执行的时候才会出现，
		但是编译器却不知道只有这三种可能，它会认为还有其他的可能，
		所以要添加个default这个永远不会执行到，只是让编译顺利通过。
		
		default:
			return new Circle();
*/			
		}
	}
}

