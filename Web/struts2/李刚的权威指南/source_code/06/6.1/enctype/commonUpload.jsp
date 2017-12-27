<%@ page contentType="text/html;charset=GBK" import="java.io.*,java.util.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*,org.apache.commons.fileupload.*,org.apache.commons.fileupload.servlet.*"%>
<%
DiskFileItemFactory factory = new DiskFileItemFactory();
//设置上传工厂的限制
factory.setSizeThreshold(1024 * 1024  * 20);
factory.setRepository(new File(request.getRealPath("/")));
//创建一个上传文件的ServletFileUpload对象
ServletFileUpload upload = new ServletFileUpload(factory);

//设置最大的上传限制
upload.setSizeMax(1024 * 1024 * 20);

//处理HTTP请求，items是所有的表单项

List items = upload.parseRequest(request);

//遍历所有的表单项
for (Iterator it = items.iterator(); it.hasNext() ; )
{
	FileItem item = (FileItem)it.next();
	if (item.isFormField())
	{
		String name = item.getFieldName();
		String value = item.getString("GBK");
		out.println("表单域的name=value对为:" + name + "=" + value);
	}
	else
	{
		System.out.println("----------------------");
		//取得文件域的表单域名
		String fieldName = item.getFieldName();
		//取得文件名
		String fileName = item.getName();
		//取得文件类型
		String contentType = item.getContentType();
		FileOutputStream fos = new FileOutputStream( request.getRealPath("/") +
			System.currentTimeMillis() + 
			fileName.substring(fileName.lastIndexOf(".") , fileName.length()));

		if (item.isInMemory() )
		{
			fos.write(item.get());
		}
		else
		{
			InputStream is = item.getInputStream();
			byte[] buffer = new byte[1024];
			int len;
			while ((len = is.read(buffer)) > 0 )
			{
				fos.write(buffer , 0 , len);
			}
			is.close();
			fos.close();
		}		

	}
}

%>