package lee;

import org.apache.struts.validator.ValidatorForm;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginForm extends ValidatorForm 
{
    private String username;
	private String pass;
    //最好提供无参数的构造函数
    public LoginForm()
    {
    }
    //以下是属性字段的系列get，set方法
    public String getUsername()
    {
		return username;
    }
    public void setUsername(String username)
    {
		this.username = username;
    }
    public String getPass()
    {
		return pass;
    }
    public void setPass(String pass)
    {
		this.pass = pass;
    }
}
