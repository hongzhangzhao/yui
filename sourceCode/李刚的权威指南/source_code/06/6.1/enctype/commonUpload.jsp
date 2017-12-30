<%@ page contentType="text/html;charset=GBK" import="java.io.*,java.util.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*,org.apache.commons.fileupload.*,org.apache.commons.fileupload.servlet.*"%>
<%
DiskFileItemFactory factory = new DiskFileItemFactory();
//�����ϴ�����������
factory.setSizeThreshold(1024 * 1024  * 20);
factory.setRepository(new File(request.getRealPath("/")));
//����һ���ϴ��ļ���ServletFileUpload����
ServletFileUpload upload = new ServletFileUpload(factory);

//���������ϴ�����
upload.setSizeMax(1024 * 1024 * 20);

//����HTTP����items�����еı���

List items = upload.parseRequest(request);

//�������еı���
for (Iterator it = items.iterator(); it.hasNext() ; )
{
	FileItem item = (FileItem)it.next();
	if (item.isFormField())
	{
		String name = item.getFieldName();
		String value = item.getString("GBK");
		out.println("�����name=value��Ϊ:" + name + "=" + value);
	}
	else
	{
		System.out.println("----------------------");
		//ȡ���ļ���ı�����
		String fieldName = item.getFieldName();
		//ȡ���ļ���
		String fileName = item.getName();
		//ȡ���ļ�����
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