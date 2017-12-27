package lee;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class DemoAction extends ActionSupport
{
	@Override
	public String execute()
	{
		addActionError("第一条错误消息！"); 
		addActionError("第二条错误消息！"); 
		addActionMessage("第一条普通消息！"); 
		addActionMessage("第二条普通消息！"); 
		return SUCCESS;
	}
}