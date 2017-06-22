class Engine {

	public void start() {
		System.out.println("kai pao");
	}

	public void rev() {

	}

	public void stop() {

	}
}

class Wheel {
	public void inflate(int psi) {

	}
}

class Window {
	public void rollup() {
		System.out.println("window rollup");
	}

	public void rolldown() {

	}
}

class Door {
	public Window window = new Window();

	public void open() {

	}

	public void close() {

	}
}

public class Car {
	private Engine engine = new Engine();

	private Engine engine1;
	private Wheel[] wheel = new Wheel[4];

	public Door left = new Door(), right = new Door();
 
	public Car() {                         // 通过public的构造方法给private变量初始化
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.getEngine().start();
		car.setEngine(new Engine());
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(Engine e) {
		this.engine1 = e;
	}
}