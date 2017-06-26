/*
	1,子类型赋值给父类型，这个父类型只能使用自己的方法，
	不能使用子类型新定义的方法，即使使用了自己的方法，
	这个方法如果被子类型覆盖了，使用的其实是子类性的方法。
	在没有动态绑定的时候，父类型使用被子类覆盖的方法，
	使用的是父类型的方法。
	2,私有构造方法只能在自己类中new一个对象，
		不能在其他类中创建这个类的对象
	3,一个父类可能有很多个子类，这些子类可以都赋值给父类，这个样在父类
	调取被子类重写的方式时，就会调取各个子类的方法了
	
*/

class Note {
	private int value;

	private  Note(int val) {

		value = val;
	}
	public boolean equals(Object obj) {

		if(this == obj) {
			System.out.println("this ==obj");
			return true;
		}
		if(!super.equals(obj)) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final Note other = (Note) obj;

		if(value != other.value) {
			return false;
		}
		return true;
	}

	public static final Note MIDDLE_C = new Note(0);
	public static final Note C_SHARP = new Note(1);
	public static final Note B_FLAT = new Note(2);
}
class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}
class Wind extends Instrument {
	public void play(Note n) {
		if(n.equals(Note.MIDDLE_C)) {
			System.out.println("Wind.play(middle)");//结果
		} else if(n.equals(Note.B_FLAT)) {
			System.out.println("Wind.play(flat)");
		} else if(n.equals(Note.C_SHARP)) {
			System.out.println("Wind.play(sharp)");

		} else {
			System.out.println("Wind.play()");
		}
	}
}
public class Music {
	public static void tune(Instrument i) {
		//i 调用的是子类的play方法，因为子类重写了父类play方法
		//play方法里面传了Note类的一个Note类型的全局唯一的常量
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind ww = new Wind(); 
		/*把Wind类型传给了Insetrument类型的参数应为是Wind的父类，所谓的向上转型*/
		tune(ww); 
	}
}
