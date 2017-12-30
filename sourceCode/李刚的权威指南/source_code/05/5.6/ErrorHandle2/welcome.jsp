<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>转换成功</title>
    </head>
    <body>
        转换成功!<br>
		用户名：<s:property value="user.name"/><br>
		年龄：<s:property value="user.age"/><br>
		生日：<s:property value="user.birth"/><br>
    </body>
</html>
