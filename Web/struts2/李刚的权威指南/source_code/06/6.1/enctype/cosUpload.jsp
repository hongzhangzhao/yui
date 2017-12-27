<%@ page contentType="text/html;charset=GBK" import="java.io.*,java.util.*"%>
<%@ page import="com.oreilly.servlet.multipart.*,com.oreilly.servlet.*"%>
<%
//设置POST请求的内容最大字节为10M,该类用于解析HTTP请求
MultipartParser mp = new MultipartParser(request, 10*1024*1024); 
//所有表单域都是Part实例
Part part;
//遍历请求中的所有表单域
while ((part = mp.readNextPart()) != null)
{
	//取得表单域的name属性值
	String name = part.getName();
	//对于普通表单域
	if (part.isParam())
	{
		//取得普通表单域的值
		ParamPart paramPart = (ParamPart) part;
		String value = paramPart.getStringValue("GBK");
		out.print("普通表单域部分:<br> name=" + name + "; value=" + value + "<br>");
	}
	//对于文件域
	else if (part.isFile())
	{
		//取得文件上传域
		FilePart filePart = (FilePart) part;
		String fileName = filePart.getFileName();
		if (fileName != null)
		{
			//输出文件内容
			long size = filePart.writeTo(new File(request.getRealPath("/")));
			out.println("上传文件:<br> 文件域的名=" + name + "; 文件名=" + fileName + "<br>" + 
			"上传文件的路径=" + filePart.getFilePath() + "<br>" + 
			"文件内容类型=" + filePart.getContentType() + "<br>" + 
			"文件大小=" + size + "<br>");
		}
		//文件名为空
		else
		{ 
			//该文件域没有输入文件名
			out.println("file: name=" + name + "; EMPTY");
		}
		out.flush();
	}
}
%>