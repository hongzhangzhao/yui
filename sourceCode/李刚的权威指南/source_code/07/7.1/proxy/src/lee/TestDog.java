package lee;

/*
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class TestDog
{
    public static void main(String[] args) 
    {
        Dog targetObject = new DogImpl();
		Dog dog = null;
        Object proxy = MyProxyFactory.getProxy(targetObject);
        if (proxy instanceof Dog)
        {
            dog = (Dog)proxy;
        }
        dog.info();
        dog.run();
    }
}
