<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>ʹ�������ϴ�����ļ�</title>
</head>
<body>
<s:fielderror/>
<form action="upload.action" method="post" enctype="multipart/form-data">
  	�ļ����⣺<input type="text" name="title" /><br>
  	ѡ���һ���ļ���<input type="file" name="upload" /><br>
  	ѡ��ڶ����ļ���<input type="file" name="upload" /><br>
  	ѡ��������ļ���<input type="file" name="upload" /><br>
	<input value="�ϴ�" type="submit" />
</form>
</body>
</html>
