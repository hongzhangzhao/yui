package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction implements Action
{

	private String username;
	private String password;
	private String tip;

	
	public void setUsername(String username) {
		this.username = username; 
	}

	public void setPassword(String password) {
		this.password = password; 
	}

	public void setTip(String tip)
	{
		this.tip = tip;
	}

	public String getUsername() {
		return (this.username); 
	}

	public String getPassword() {
		return (this.password); 
	}
	public String getTip()
	{
		return tip;
	}

    public String execute() throws Exception
	{
		if (getUsername().equalsIgnoreCase("user"))
		{
			throw new MyException("自定义异常");
		}
		if (getUsername().equalsIgnoreCase("sql"))
		{
			throw new java.sql.SQLException("用户名不能为SQL");
		}
        if (getUsername().equals("scott")
                && getPassword().equals("tiger") )
		{
			setTip("哈哈，服务器提示！");
            return SUCCESS;
        }
		else
		{
            return ERROR;
        }
    }
}
