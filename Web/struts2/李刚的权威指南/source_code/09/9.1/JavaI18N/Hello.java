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
		//ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault();
		//����ָ������/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("mess" , myLocale);
		//��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}	
}
