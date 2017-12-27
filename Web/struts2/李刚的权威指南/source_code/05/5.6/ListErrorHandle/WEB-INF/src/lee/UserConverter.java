package lee;

import java.util.Map;
import ognl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;
import java.util.List;
import java.util.ArrayList;


/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */


public class UserConverter extends StrutsTypeConverter 
{

    public Object convertFromString(Map context, String[] values, Class toClass)
	{

		if (values.length > 1)
		{
			List<User> result = new ArrayList<User>();
			for (int i = 0; i < values.length ; i++ )
			{
				User user = new User();
				String[] userValues = values[i].split(",");
				user.setName(userValues[0]);
				user.setPass(userValues[1]);
				result.add(user);
			}
			return result;	
		}
		else
		{
			User user = new User();
			String[] userValues = values[0].split(",");
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			return user;
		}

    }

    @Override
    public String convertToString(Map context, Object o)
	{
		if (o instanceof User)
		{
			User user = (User)o;
			return "<" + user.getName() + "," + user.getPass() + ">";
		}
		else if (o instanceof List)
		{
			List<User> users = (List<User>)o;
			String result = "[";
			for (User user : users )
			{
				result += "<" + user.getName() + "," + user.getPass() + ">";
			}
			return result + "]";
		}
		else
		{
			return "";
		}

    }


} 