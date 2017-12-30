<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>使用数组上传多个文件</title>
</head>
<body>
<s:fielderror/>
<form action="upload.action" method="post" enctype="multipart/form-data">
  	文件标题：<input type="text" name="title" /><br>
  	选择第一个文件：<input type="file" name="upload" /><br>
  	选择第二个文件：<input type="file" name="upload" /><br>
  	选择第三个文件：<input type="file" name="upload" /><br>
	<input value="上传" type="submit" />
</form>
</body>
</html>
