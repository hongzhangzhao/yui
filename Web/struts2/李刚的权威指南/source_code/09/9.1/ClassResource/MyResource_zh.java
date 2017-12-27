import java.util.ListResourceBundle;
import java.util.Locale;
//给zh_CN定义的资源包
public class MyResource_zh extends ListResourceBundle
{
	//定义资源
	private final Object myData[][]=
	{
		{"msg","{0}，您好 Class！今天是{1}"}
	};
	//实现抽象方法getContents()
	public Object[][] getContents()
	{
		return myData;
	}	
}
