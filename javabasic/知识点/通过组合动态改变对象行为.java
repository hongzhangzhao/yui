/*
	ͨ����϶�̬�ı������Ϊ
*/

abstract class Actor {

	abstract void act();
}
class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}
class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}
class Stage {
	Actor a  =new HappyActor();
	void change() {
		a= new SadActor();
	}
	void go() {
		a.act();
	}
}
