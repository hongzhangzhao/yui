package lee;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;
import java.util.*;
import java.io.*;


import com.opensymphony.xwork2.ActionSupport;

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
    private List<File> upload;
    private List<String> uploadContentType;
    private List<String> uploadFileName;

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
	
	public void setTitle(String title) {
		this.title = title; 
	}

	public void setUpload(List<File> upload) {
		this.upload = upload; 
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType; 
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName; 
	}

	public String getTitle() {
		return (this.title); 
	}

	public List<File> getUpload() {
		return (this.upload); 
	}

	public List<String> getUploadContentType() {
		return (this.uploadContentType); 
	}

	public List<String> getUploadFileName() {
		return (this.uploadFileName); 
	}
	@Override
    public String execute() throws Exception
	{
		List<File> files = getUpload();
		for (int i = 0 ; i < files.size() ; i++)
		{
			//以服务器的文件保存地址和原文件名建立上传文件输出流
			FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName().get(i));
			FileInputStream fis = new FileInputStream(files.get(i));
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0)
			{
				fos.write(buffer , 0 , len);
			}
		}
        return SUCCESS;
    }
}