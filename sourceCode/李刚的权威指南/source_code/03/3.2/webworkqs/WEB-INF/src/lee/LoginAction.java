package lee;

import com.opensymphony.xwork.ModelDriven;
import com.opensymphony.xwork.Action;
import com.opensymphony.xwork.ActionContext;
import com.opensymphony.xwork.ActionSupport;

import java.util.Map;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class LoginAction extends ActionSupport
{  

    private String user; 
    private String pass; 
	private String tip;

    public String getUser()
    { 
        return user; 
    } 
  
    public void setUser(String user)
    { 
        this.user = user; 
    }

    public String getPass()
    { 
        return pass; 
    } 
  
    public void setPass(String pass)
    { 
        this.pass = pass; 
    } 

    public String getTip()
    { 
        return tip; 
    } 
  
    public void setTip(String tip)
    { 
        this.tip = tip; 
    } 

    public String execute() throws Exception
    {
        if (getUser().equals("scott")
			&& getPass().equals("tiger"))
        {
			setTip(getText("loginSuccess"));
            return SUCCESS; 
        }
        else
        { 
			setTip(getText("loginFail"));
            return ERROR; 
        } 
    } 

} 