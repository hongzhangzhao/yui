<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>ͨ������ʵ���ļ����͹���</title>
</head>
<body>
${requestScope.typeError}
<form action="upload.action" method="post" enctype="multipart/form-data">
  	�ļ����⣺<input type="text" name="title" /><br>
  	ѡ���ļ���<input type="file" name="upload" /><br>
	<input value="�ϴ�" type="submit" />
</form>
</body>
</html>
