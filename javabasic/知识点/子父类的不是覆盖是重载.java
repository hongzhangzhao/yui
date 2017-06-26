/*
	重载 不是覆盖
*/

class NoteX {

	public static final int
	middle_c=0,c_sharp=1,c_flat=2;
}

class InstrumentX {
	public void play(int Notex) {
		System.out.println("Instrument.play()");
	}
}
class WindX extends InstrumentX {
	public void play(NoteX n) { //参数类型不一样，是重载，
		System.out.println("WindX.play(NoteX n)");
	}
}
public class WindError {
	public static void tune(InstrumentX i) {
		i.play(NoteX.middle_c);
	}
	public static void main(String[]args) {

		WindX flute = new WindX();
		WindError.tune(flute); //调用的是父类的方法
	}
}