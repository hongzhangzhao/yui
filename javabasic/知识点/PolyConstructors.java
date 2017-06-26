/*
	抽象：
		对事物一些性质的描述，并把某些相同事物所具有的相同的特征，
		提取出来，并创建一个包含这些相同特征的类，
		主要是提高了通用性.
	对于一个方法中的参数是一个父类型，这个参数可以任传任意子类的类型参数，
	就是由父类出现的地方，子类都可以出现。
*/



abstract class Glyph {
	/*
		抽象的方法不能使用static修饰,
		因为抽象方法的意义就在于要被子类进行覆盖，
		而static是属于类的，不能被覆盖，
		
	*/
	abstract void draw();
	

	Glyph() {
		System.out.println("Glyph() befor draw()");
		/*
			首先这里的draw()是调用的子类的，
			抽象类的抽象方法子类必须实现，
			如果不实现父类所有的抽象方法，
			那么子类也是抽象方法，不能被实例化了，
			编译不通过
			
		*/
		draw();   
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(),radius = + radius");
	}
	// void  draw() {
	//	System.out.println("RoundGlyph.draw(),radius = "+ radius);
	//}
	
}
	 public class PolyConstructors{
	 public static void main(String[] args){
		 new RoundGlyph(5);
	 }
	 }

