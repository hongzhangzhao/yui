<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>通过代码实现文件类型过滤</title>
</head>
<body>
${requestScope.typeError}
<form action="upload.action" method="post" enctype="multipart/form-data">
  	文件标题：<input type="text" name="title" /><br>
  	选择文件：<input type="file" name="upload" /><br>
	<input value="上传" type="submit" />
</form>
</body>
</html>
