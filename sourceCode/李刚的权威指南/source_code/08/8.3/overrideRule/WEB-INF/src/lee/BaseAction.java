package lee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import java.util.*;
import java.util.regex.*;
import java.text.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class BaseAction extends ActionSupport
{
	private String name;

	public void setName(String name) 
	{
		this.name = name; 
	}

	public String getName()
	{
		return (this.name); 
	}
}