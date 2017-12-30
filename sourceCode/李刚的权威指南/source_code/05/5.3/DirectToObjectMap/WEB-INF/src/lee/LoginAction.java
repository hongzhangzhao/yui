package lee;

import com.opensymphony.xwork2.Action;
import java.util.Map;

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
	private Map<String ,User> users;
	private String tip;

	public void setUsers(Map<String ,User> users) 
	{
		this.users = users; 
	}

	public void setTip(String tip)
	{
		this.tip = tip; 
	}

	public Map<String ,User> getUsers() 
	{
		return (this.users); 
	}

	public String getTip() 
	{
		return (this.tip); 
	}

    public String execute() throws Exception
	{
		System.out.println(getUsers());
        if (getUsers().get("one").getName().equals("scott")
			&& getUsers().get("one").getPass().equals("tiger") )
		{
			setTip("转换成功");
            return SUCCESS;
        }
		else
		{
			setTip("转换失败");
            return ERROR;
        }
    }
}