package lee;

import com.opensymphony.xwork2.Action;

import java.io.Serializable;


public class RandomAction implements Action
{
	private String data;

	public String getRdmStr()
	{

		String result = String.valueOf(Math.round(Math.random() * 10000));
		return data != null && !data.equals("") ? data + result : result;
	}

	public void setData(String data)
	{
		this.data = data;
	}
	public String getData()
	{
		 return this.data;
	}

	public String execute()
	{
		return SUCCESS;
	}
}