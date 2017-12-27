package lee;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class LoginBean
{
    private String name;
    private String pass;
    private String err;	

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		 return this.pass;
	}

	public void setErr(String err)
	{
		this.err = err;
	}
	public String getErr()
	{
		 return this.err;
	}
	
	public String valid()
	{
		if (name.equals("scott") && pass.equals("tiger"))
		{
			return "success";
		}
        setErr("您的用户名和密码不符合");
		return "failure";
	}

}