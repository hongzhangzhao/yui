package lee;

import com.opensymphony.xwork2.Action;

import java.io.Serializable;


public class AjaxTestAction implements Action, Serializable
{

    private static int counter = 0;
    private String data;

    public long getServerTime()
	{
        return System.currentTimeMillis();
    }

    public int getCount()
	{
        return ++counter;
    }

    public String getData()
	{
        return "服务器提示：" + data;
    }

    public void setData(String data)
	{
        this.data = data;
    }

    public String execute() throws Exception 
	{
        return SUCCESS;
    }
}
