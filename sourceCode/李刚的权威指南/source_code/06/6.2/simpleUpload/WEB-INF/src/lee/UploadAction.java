package lee;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;
import java.io.File;
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
    private File upload;
    private String uploadContentType;
    private String uploadFileName;

	//��������ע�������
    private String savePath;
	//��������ע��ķ���
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
	@Override
    public String execute() throws Exception
	{
		System.out.println("��ʼ�ϴ������ļ�-----------------------");
		System.out.println(getSavePath());
		System.out.println("==========" + getUploadFileName());
		System.out.println("==========" + getUploadContentType());
		System.out.println("==========" + getUpload());
		//�Է��������ļ������ַ��ԭ�ļ��������ϴ��ļ������
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