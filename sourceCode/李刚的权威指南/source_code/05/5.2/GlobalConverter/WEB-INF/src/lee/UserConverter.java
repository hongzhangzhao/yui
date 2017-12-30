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
		User user = new User();
		String[] userValues = values[0].split(",");
		user.setName(userValues[0]);
		user.setPass(userValues[1]);
		return user;
    }

    @Override
    public String convertToString(Map context, Object o)
	{
		User user = (User)o;
		return "<" + user.getName() + "," + user.getPass() + ">";

    }


} 