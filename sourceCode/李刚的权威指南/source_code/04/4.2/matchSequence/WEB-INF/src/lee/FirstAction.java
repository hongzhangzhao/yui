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

public class FirstAction extends ActionSupport
{
	private String tip;
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
		setTip("第一个Action处理结果");
		System.out.println("第一个Action");
        return SUCCESS;
    }
}