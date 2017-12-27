package lee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class MyAction extends ActionSupport
{
	private String target;
	private String tip;

    public String getTarget()
	{
        return target;
    }
    public void setTarget(String target)
	{
        this.target = target;
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
		setTip("恭喜您,您已经成功转向");
		return SUCCESS;
	}
}
