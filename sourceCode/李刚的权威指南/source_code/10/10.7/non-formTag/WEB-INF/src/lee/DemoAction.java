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
		addActionError("��һ��������Ϣ��"); 
		addActionError("�ڶ���������Ϣ��"); 
		addActionMessage("��һ����ͨ��Ϣ��"); 
		addActionMessage("�ڶ�����ͨ��Ϣ��"); 
		return SUCCESS;
	}
}