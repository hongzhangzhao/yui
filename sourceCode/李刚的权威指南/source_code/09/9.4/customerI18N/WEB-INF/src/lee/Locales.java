package lee;

import java.util.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */


public class Locales
{
	private Locale current;
	public void setCurrent(Locale cur)
	{
		this.current = cur;
	}
    public Map<String, Locale> getLocales()
	{
        Map<String, Locale> locales = new Hashtable<String, Locale>();
		ResourceBundle bundle = ResourceBundle.getBundle("messageResource" , current);
        locales.put(bundle.getString("usen"), Locale.US);
        locales.put(bundle.getString("zhcn"), Locale.CHINA);
        return locales;
    }
}