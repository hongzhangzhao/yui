<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>利用拦截器实现文件过滤</title>
</head>
<body>
<s:fielderror/>
<form action="upload.action" method="post" enctype="multipart/form-data">
  	文件标题：<input type="text" name="title" /><br>
  	选择文件：<input type="file" name="upload" /><br>
	<input value="上传" type="submit" />
</form>
</body>
</html>
