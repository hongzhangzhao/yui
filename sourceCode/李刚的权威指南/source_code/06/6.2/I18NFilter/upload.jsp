<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>修改默认的提示信息</title>
</head>
<body>
<div style="color:red">
<s:fielderror/>
</div>
<form action="upload.action" method="post" enctype="multipart/form-data">
  	文件标题：<input type="text" name="title" /><br>
  	选择文件：<input type="file" name="upload" /><br>
	<input value="上传" type="submit" />
</form>
</body>
</html>
