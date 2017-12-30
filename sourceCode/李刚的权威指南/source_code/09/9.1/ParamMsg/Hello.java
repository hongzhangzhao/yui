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
        Locale currentLocale = null;
        if (args.length == 2)
        {
            currentLocale = new Locale(args[0] , args[1]);
        }
        else
        {
            currentLocale = Locale.getDefault();
        }
		ResourceBundle bundle = ResourceBundle.getBundle("MyResource" , currentLocale);
		String msg = bundle.getString("msg");		
		System.out.println(MessageFormat.format(msg , "yeeku" , new Date()));
	}	
}
