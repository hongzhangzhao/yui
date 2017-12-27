<%@ page contentType="text/html;charset=GBK" import="java.io.*,java.util.*"%>
<%@ page import="com.oreilly.servlet.multipart.*,com.oreilly.servlet.*"%>
<%
//����POST�������������ֽ�Ϊ10M,�������ڽ���HTTP����
MultipartParser mp = new MultipartParser(request, 10*1024*1024); 
//���б�����Partʵ��
Part part;
//���������е����б���
while ((part = mp.readNextPart()) != null)
{
	//ȡ�ñ����name����ֵ
	String name = part.getName();
	//������ͨ����
	if (part.isParam())
	{
		//ȡ����ͨ�����ֵ
		ParamPart paramPart = (ParamPart) part;
		String value = paramPart.getStringValue("GBK");
		out.print("��ͨ���򲿷�:<br> name=" + name + "; value=" + value + "<br>");
	}
	//�����ļ���
	else if (part.isFile())
	{
		//ȡ���ļ��ϴ���
		FilePart filePart = (FilePart) part;
		String fileName = filePart.getFileName();
		if (fileName != null)
		{
			//����ļ�����
			long size = filePart.writeTo(new File(request.getRealPath("/")));
			out.println("�ϴ��ļ�:<br> �ļ������=" + name + "; �ļ���=" + fileName + "<br>" + 
			"�ϴ��ļ���·��=" + filePart.getFilePath() + "<br>" + 
			"�ļ���������=" + filePart.getContentType() + "<br>" + 
			"�ļ���С=" + size + "<br>");
		}
		//�ļ���Ϊ��
		else
		{ 
			//���ļ���û�������ļ���
			out.println("file: name=" + name + "; EMPTY");
		}
		out.flush();
	}
}
%>