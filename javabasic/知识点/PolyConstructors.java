/*
	����
		������һЩ���ʵ�����������ĳЩ��ͬ���������е���ͬ��������
		��ȡ������������һ��������Щ��ͬ�������࣬
		��Ҫ�������ͨ����.
	����һ�������еĲ�����һ�������ͣ�������������δ�������������Ͳ�����
	�����ɸ�����ֵĵط������඼���Գ��֡�
*/



abstract class Glyph {
	/*
		����ķ�������ʹ��static����,
		��Ϊ���󷽷������������Ҫ��������и��ǣ�
		��static��������ģ����ܱ����ǣ�
		
	*/
	abstract void draw();
	

	Glyph() {
		System.out.println("Glyph() befor draw()");
		/*
			���������draw()�ǵ��õ�����ģ�
			������ĳ��󷽷��������ʵ�֣�
			�����ʵ�ָ������еĳ��󷽷���
			��ô����Ҳ�ǳ��󷽷������ܱ�ʵ�����ˣ�
			���벻ͨ��
			
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

