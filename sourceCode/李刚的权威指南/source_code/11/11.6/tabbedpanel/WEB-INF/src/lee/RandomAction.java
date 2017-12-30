package lee;

import com.opensymphony.xwork2.Action;

import java.io.Serializable;


public class RandomAction implements Action
{
	public String getRdmStr()
	{
		long result = Math.round(Math.random() * 2);
		return result == 2 ? "轻量级J2EE企业应用实战" : "基于J2EE的Ajax宝典";
	}

	public String execute()
	{
		return SUCCESS;
	}
}