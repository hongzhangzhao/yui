import java.util.ListResourceBundle;
import java.util.Locale;
//For en_US locale
public class MyResource extends ListResourceBundle
{
	//������Դ
	private final Object myData[][]=
	{
		{"msg","Hello Class,{0}!Today is {1}."}
	};
	//ʵ�ֳ��󷽷�getContents()
	public Object[][] getContents()
	{
		return myData;
	}	
}
