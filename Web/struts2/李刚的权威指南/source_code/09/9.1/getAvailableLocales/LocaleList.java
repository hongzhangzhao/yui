import java.util.Locale;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LocaleList
{
    public static void main(String[] args) 
    {
        Locale[] localeList = Locale.getAvailableLocales();
        for (int i = 0; i < localeList.length ; i++ )
        {
            System.out.println(localeList[i].getDisplayCountry() + "=" + localeList[i].getCountry()
                + " " + localeList[i].getDisplayLanguage() + "=" + localeList[i].getLanguage());
        }
    }
}
