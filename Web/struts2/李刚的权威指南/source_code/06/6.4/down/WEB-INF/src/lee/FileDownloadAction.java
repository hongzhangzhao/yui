package lee;

import java.io.InputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class FileDownloadAction implements Action 
{

    private String inputPath;
    public void setInputPath(String value)
	{
        inputPath = value;
    }

	/*
	 下载用的Action应该返回一个InputStream实例，
	 该方法对应在result里的inputName属性值为targetFile
	*/
    public InputStream getTargetFile() throws Exception 
	{
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }

    public String execute() throws Exception
	{
        return SUCCESS;
    }

}
