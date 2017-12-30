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
	 �����õ�ActionӦ�÷���һ��InputStreamʵ����
	 �÷�����Ӧ��result���inputName����ֵΪtargetFile
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
