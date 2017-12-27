import java.util.ListResourceBundle;
import java.util.Locale;
//For en_US locale
public class MyResource extends ListResourceBundle
{
	//定义资源
	private final Object myData[][]=
	{
		{"msg","Hello Class,{0}!Today is {1}."}
	};
	//实现抽象方法getContents()
	public Object[][] getContents()
	{
		return myData;
	}	
}
