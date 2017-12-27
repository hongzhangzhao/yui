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

public class LoginAction implements Action , ModelDriven<UserBean>
{
	private UserBean model = new UserBean();

    public String execute() throws Exception
	{
        if (model.getUsername().equals("scott")
                && model.getPassword().equals("tiger") )
		{
			model.setTip("哈哈，服务器提示！");
            return SUCCESS;
        }
		else
		{
            return ERROR;
        }
    }

    public UserBean getModel()
    { 
        return model; 
    }
}
