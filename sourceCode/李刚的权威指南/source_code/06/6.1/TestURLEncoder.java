import java.net.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class TestURLEncoder
{
    public static void main(String[] args) throws Exception
    {
        String encodeStr = "%CC%E1%BD%BB";
		String decodeStr = URLDecoder.decode(encodeStr ,"GBK");
		System.out.println(decodeStr);
		String rawStr = "øŒ≥ÃΩÈ…‹";
		System.out.println(URLEncoder.encode(rawStr , "GBK"));
    }
}
