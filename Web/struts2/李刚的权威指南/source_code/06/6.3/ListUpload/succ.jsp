<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>上传成功</title>
    </head>
    <body>
        上传成功!<br>
		文件标题:<s:property value=" + title"/><br>
		第一个文件为：<img src="<s:property value="'upload/' + uploadFileName[0]"/>"/><br>
		第二个文件为：<img src="<s:property value="'upload/' + uploadFileName[1]"/>"/><br>
		第三个文件为：<img src="<s:property value="'upload/' + uploadFileName[2]"/>"/><br>

    </body>
</html>
