package lee;

import com.opensymphony.xwork2.Action;

import java.io.Serializable;


public class RandomAction implements Action
{
	public String getRdmStr()
	{
		long result = Math.round(Math.random() * 2);
		return result == 2 ? "������J2EE��ҵӦ��ʵս" : "����J2EE��Ajax����";
	}

	public String execute()
	{
		return SUCCESS;
	}
}