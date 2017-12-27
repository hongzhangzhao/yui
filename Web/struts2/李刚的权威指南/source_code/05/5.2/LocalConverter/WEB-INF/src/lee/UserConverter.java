package lee;

import java.util.Map;
import ognl.DefaultTypeConverter;


/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */


public class UserConverter extends DefaultTypeConverter 
{
    public Object convertValue(Map context, Object value, Class toType)
	{
        if (toType == User.class )
		{
			String[] params = (String[])value;
			User user = new User();
			String[] userValues = params[0].split(",");
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			return user;

        }
		else if (toType == String.class )
		{
			User user = (User) value;
			return "<" + user.getName() + "," + user.getPass() + ">";
        } 
        return null ;
    } 
} 