import java.util.ListResourceBundle;
import java.util.Locale;
//��zh_CN�������Դ��
public class MyResource_zh_CN extends ListResourceBundle
{
	//������Դ
	private final Object myData[][]=
	{
		{"msg","{0}������ Class��������{1}"}
	};
	//ʵ�ֳ��󷽷�getContents()
	public Object[][] getContents()
	{
		return myData;
	}	
}
