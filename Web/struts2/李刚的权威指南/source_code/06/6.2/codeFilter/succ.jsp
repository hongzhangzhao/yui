<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>上传成功</title>
    </head>
    <body>
        上传成功!<br>
		文件标题:<s:property value=" + title"/><br>
		文件为：<img src="<s:property value="'upload/' + uploadFileName"/>"/><br>
    </body>
</html>
