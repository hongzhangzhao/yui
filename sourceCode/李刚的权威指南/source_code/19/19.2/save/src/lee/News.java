package lee;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class News
{
	//��Ϣ��ı�ʶ����
	private int id;
	//��Ϣ����
	private String title;
	//��Ϣ����
	private String content;
	//������
	public News()
	{
	}
	//��ʶ���Ե�setter����
	public void setId(int id) 
	{
		this.id = id; 
	}
	//��Ϣ�����setter����
	public void setTitle(String title) 
	{
		this.title = title; 
	}
	//��Ϣ���ݵ�setter����
	public void setContent(String content) 
	{
		this.content = content; 
	}
	//��ʶ���Ե�getter����
	public int getId() 
	{
		return (this.id); 
	}
	//��Ϣ�����getter����
	public String getTitle()
	{
		return (this.title); 
	}
	//��Ϣ���ݵ�getter����
	public String getContent() 
	{
		return (this.content); 
	}
}
