package lee;

import com.opensymphony.xwork2.*;
import org.apache.struts2.ServletActionContext;
import java.io.File;
import java.io.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */

public class UploadAction extends ActionSupport
{
	private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;

	//接受依赖注入的属性
    private String savePath;
	//接受依赖注入的方法
    public void setSavePath(String value)
	{
        this.savePath = value;
    }
    private String getSavePath() throws Exception 
	{
        return ServletActionContext.getRequest().getRealPath(savePath);
    }

	private String allowTypes;

	public String getAllowTypes()
	{
		return allowTypes;
	}
	public void setAllowTypes(String allowTypes)
	{
		this.allowTypes = allowTypes;
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}

	public void setUpload(File upload) {
		this.upload = upload; 
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType; 
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName; 
	}

	public String getTitle() {
		return (this.title); 
	}

	public File getUpload() {
		return (this.upload); 
	}

	public String getUploadContentType() {
		return (this.uploadContentType); 
	}

	public String getUploadFileName() {
		return (this.uploadFileName); 
	}

	public String filterType(String[] types)
	{
		String fileType = getUploadContentType();
		for (String type : types)
		{
			if (type.equals(fileType))
			{
				return null;
			}
		}
		return INPUT;

	}

	@Override
    public String execute() throws Exception
	{
		String filterResult = filterType(getAllowTypes().split(","));
		if (filterResult != null)
		{
			ActionContext.getContext().put("typeError" , "您要上传的文件类型不正确！");
			return filterResult;
		}
		System.out.println("文件大小---------------------------" + getUpload().length());

		//以服务器的文件保存地址和原文件名建立上传文件输出流
		FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0)
		{
			fos.write(buffer , 0 , len);
		}
        return SUCCESS;
    }
}