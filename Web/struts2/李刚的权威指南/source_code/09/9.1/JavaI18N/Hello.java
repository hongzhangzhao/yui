import java.text.MessageFormat;
import java.text.DateFormat;
import java.text.Format;
import java.util.ResourceBundle;
import java.util.Locale;
import java.util.Date;

public class Hello
{
	public static void main(String[] args)
	{
		//取得系统默认的国家/语言环境
		Locale myLocale = Locale.getDefault();
		//根据指定国家/语言环境加载资源文件
		ResourceBundle bundle = ResourceBundle.getBundle("mess" , myLocale);
		//打印从资源文件中取得的消息
		System.out.println(bundle.getString("hello"));
	}	
}
